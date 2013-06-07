package jeopardy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Jogo {

	private List<Pergunta> perguntas;
	private String nome;
	private int maximoPerguntas;
	private int totalPerguntas;
	private int pontuacao;
	private int acertos;
	int indiceControleQuestao = 1;
	int indiceApresentacaoQuestao = 0;
	int totalErros = 0;

	public Jogo(String nome) {
		this(nome, 10);
	}

	public Jogo(String nome, int maximo) {
		this.nome = nome;
		perguntas = new ArrayList<Pergunta>();
		maximoPerguntas = maximo;
	}

	public void addPergunta(Pergunta pergunta) {
		if (totalPerguntas < maximoPerguntas) {
			perguntas.add(pergunta);
			totalPerguntas++;
		}
	}

	private void inicializar() {

		Pergunta pergunta = Pergunta.criarPergunta(
				Categoria.DEPLOYING,
				3,
				"Se a classe esta em um pacote, o CLASSPATH do sistema deve ser alterado para acessar a classe. Verdadeiro ou Falso?",
				"1) Verdadeiro", "2) Falso");

		addPergunta(pergunta);

		pergunta = Pergunta.criarPergunta(
				Categoria.DEPLOYING,
				3,
				"Qual dos seguintes s�o arquivos que devem ser enviados para um servidor web para implantar um aplicativo em java?",
				"1) .HTML",
				"2) .CSS",
				"3) .JAR", 
				"4) .EXE");
		addPergunta(pergunta);

		pergunta = Pergunta.criarPergunta(
				Categoria.GENERICS,
				3,
				"Qual destes poderia ser um exemplo de Cole��o Set?",
				"1) {1, 1, 2, 22, 305, 26}",
				"2) {Apple, 1, Carrot, 2}",
				"3) {1, 2, 5, 178, 259}", 
				"4) Todas Anteriores");
		addPergunta(pergunta);

		pergunta = Pergunta.criarPergunta(
				Categoria.GENERICS,
				3,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");
		
		addPergunta(pergunta);
		
		pergunta = Pergunta.criarPergunta(
				Categoria.STRINGS,
				3,
				"Identificar o m�todo daqueles listados abaixo, que n�o est� dispon�vel para ambos os StringBuilders e Strings?",
				"1) length ()",
				"2) delete (int start, int end)",
				"3) charAt (int index)", 
				"4) indexOf (String str)");
		addPergunta(pergunta);

		pergunta = Pergunta.criarPergunta(
				Categoria.STRINGS,
				3,
				"O que significa o ponto (.) Representam em express�es regulares?",
				"1) indica��o de uma ou mais ocorr�ncias do caractere precedente",
				"2) um jogo para qualquer caractere",
				"3) um intervalo especificado entre par�nteses, que permite a variabilidade de um personagem",
				"4) nada, � apenas um ponto");
		
		addPergunta(pergunta);
		
		pergunta = Pergunta.criarPergunta(
				Categoria.EXCEPTIONS,
				3,
				"Quando uma instru��o finally ser� executado?",
				"1) S� se uma exce��o � lan�ada.",
				"2) S� no caso de uma exce��o n�o � lan�ada.",
				"3) Sempre, n�o importa se uma exce��o � lan�ada ou n�o.", 
				"4) S� se v�rias exce��es s�o capturados e jogados.",
				"5) Nunca, ele est� l� para fins visuais.");
		addPergunta(pergunta);

		pergunta = Pergunta.criarPergunta(
				Categoria.EXCEPTIONS,
				3,
				"O que voc� deve fazer para criar sua pr�pria exce��o?",
				"1) Crie uma nova classe que se estende Exception.",
				"2) Crie uma nova classe que implementa Exception.",
				"3) Declare o primitivo Exce��o de dados.",
				"4) As exce��es n�o podem ser criados. Eles s� s�o constru�dos para Java.");
		
		addPergunta(pergunta);

	}
	
	private String formatarPergunta(Pergunta pergunta) {
		StringBuilder sb = new StringBuilder();
		
		int pontos =  ehPrimeiraChance() ? pergunta.getPontuacao() : pergunta.getPontuacao() / 2;    
		
		sb.append("Pontuacao atual: " + pontuacao + "\n");
		sb.append("Quest�o " + indiceApresentacaoQuestao + " - Categoria "
					+ pergunta.getCategoria() +" - ("+ pontos +" pontos)\n" );
		sb.append(pergunta);
		sb.append("Informe a opcao correta: ");

		return sb.toString();
	}
	
	private String informacoesGerais() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Sobre o jogo:\n\t- Voce deve selecionar a resposta correta para cada pergunta")
				.append("\n\t- Existem 5 categorias de perguntas")
				.append("\n\t- Cada categoria possui uma pontua��o especifica, quanto mais alta a categoria, maior a pontuacao")
				.append("\n\t- Caso voce erre uma questao de uma categoria, voce tera uma segunda chace ")
				.append("\n\t- Caso voce erre duas perguntas de uma categoria, o jogo acaba.")
				.append("\n- B O A  S O R T E!!!");
		return sb.toString();
	}

	private void verificarMaximoErros() throws Exception {
		if (totalErros == 2) {
			throw new Exception();
		}
		
	}

	private boolean ehPrimeiraChance() {
		return indiceControleQuestao % 2 != 0;
	}

	
	public void jogar() {
		inicializar();
			
		JOptionPane.showMessageDialog(null, "Bem-vindo ao " + nome + "\nVoc� gostaria de iniciar o jogo?");
		JOptionPane.showMessageDialog(null, informacoesGerais());

		Iterator<Pergunta> it = perguntas.iterator();
		
		while (it.hasNext()) {
			boolean respostaInvalida = false;
			int gabarito = 0;
			
			indiceApresentacaoQuestao++;
			
			Pergunta pergunta = it.next();
						
			do {
				try {
					respostaInvalida = false;
					gabarito = Integer.parseInt(JOptionPane.showInputDialog(formatarPergunta(pergunta)));
				} catch (NumberFormatException e) {
					respostaInvalida = true;
					JOptionPane.showMessageDialog(null, "Resposta deve ser um numero. Informe um novo valor");
				} 
			
			} while(respostaInvalida);
			
			if (pergunta.verificar(gabarito)) {
				int pontos =  ehPrimeiraChance() ? pergunta.getPontuacao() : pergunta.getPontuacao() / 2;   
				pontuacao += pontos;   
				JOptionPane.showMessageDialog(null, "Parabens, vc acertou e ganhou "+ pontos +" pontos.\nPontuacao: " + pontuacao);
				acertos++;
				indiceControleQuestao++;
				if (it.hasNext()) it.next();
				totalErros = 0;
			} else {
				totalErros++;
				try {
					verificarMaximoErros();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Voce alcancou o maximo de erros!\n G A M E  O V E R!");
					System.exit(0);
				}
				
				if (ehPrimeiraChance()) {
					JOptionPane.showMessageDialog(null, "Tente novamente uma quest�o desta categoria");
				} else {
					JOptionPane.showMessageDialog(null, "Voc� n�o ganhou pontos nesta categoria\nPontuacao: " + pontuacao);
				}
			}

			indiceControleQuestao++;
			
		}
		
		JOptionPane.showMessageDialog(null, "F I M  D E  J O G O \nPontua��o final: " + pontuacao + "\nVoce acertou " + acertos + " de um total de " + (indiceApresentacaoQuestao) + " questoes");
		System.exit(0);
	}

	public static void main(String[] args) {
		Jogo jogo = new Jogo("Perguntas e Respostas");
		jogo.jogar();
	}

}
