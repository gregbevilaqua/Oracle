package jeopardy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Jogo {

	private HashMap<Categoria, Pergunta> perguntas;
	private String nome;
	private int maximoPerguntas;
	private int totalPerguntas;
	private int pontuacao;

	public Jogo(String nome) {
		this(nome, 10);
	}

	public Jogo(String nome, int maximo) {
		this.nome = nome;
		perguntas = new HashMap<Categoria, Pergunta>();
		maximoPerguntas = maximo;
	}

	public void addPergunta(Pergunta pergunta) {
		if (totalPerguntas < maximoPerguntas) {
			perguntas.put(pergunta.getCategoria(), pergunta);
			totalPerguntas++;
		}
	}
<<<<<<< HEAD
	
	public void jogar() {
		System.out.println(nome);
		
		Iterator it = perguntas.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry perguntas = (Map.Entry)it.next();
	       	System.out.println(perguntas);
		}
=======

	public void quebrarLinha() {
		System.out.println("\n");
>>>>>>> cd1c116c9edc3c9a0891ca169af50ef146e246e3
	}

	public Pergunta criarPergunta(Categoria categoria, int indiceDaCorreta,
			String caput, String... respostas) {

		Pergunta pergunta = new Pergunta(
				categoria,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?");

		try {

			for (String texto : respostas) {
				pergunta.addResposta(new Resposta(texto));
			}
			pergunta.setCorreta(indiceDaCorreta);

		} catch (RespostaUsadaException e) {
			e.printStackTrace();
		}

		return pergunta;
	}

	public void inicializar() {

		Pergunta pergunta = criarPergunta(
				Categoria.DEPLOYING,
				2,
				"Se a classe esta em um pacote, o CLASSPATH do sistema deve ser alterado para acessar a classe. Verdadeiro ou Falso?",
				"1) Verdadeiro", "2) Falso");

		addPergunta(pergunta);

		pergunta = criarPergunta(
				Categoria.DEPLOYING,
				2,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");

		pergunta = criarPergunta(
				Categoria.STRINGS,
				2,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");

		pergunta = criarPergunta(
				Categoria.STRINGS,
				2,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");

		pergunta = criarPergunta(
				Categoria.STRINGS,
				2,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");

		pergunta = criarPergunta(
				Categoria.STRINGS,
				2,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?",
				"1) Atraves da propriedade lenght",
				"2) Atraves do metodo lenght",
				"3) Atraves da propriedade size", "4) Atraves da metodo size");

		addPergunta(pergunta);

	}

	public void jogar() {

		System.out.println(nome);

		quebrarLinha();

		Iterator<?> it = perguntas.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<Categoria, Pergunta> categoriaPergunta = (Map.Entry) it
					.next();

			Pergunta pergunta = categoriaPergunta.getValue();

			System.out.println(pergunta);

			Iterator<Resposta> respostas = pergunta.respostas();

			while (respostas.hasNext()) {
				System.out.println("\t" + respostas.next().getTexto());
			}

			System.out.print("Informe a opcao correta: ");

			Scanner scanner = new Scanner(System.in);
			int palpite = scanner.nextInt();

			if (pergunta.verificar(palpite)) {
				pontuacao += pergunta.getPontuacao();
				System.out.println("Parabens, vc acertou");
			} else {
				System.out.println("Tente novamente");
			}

			System.out.println("Pontuacao: " + pontuacao);

		}
	}

	public static void main(String[] args) {

		Jogo jogo = new Jogo("Perguntas e Respostas");
		jogo.inicializar();
		jogo.jogar();
	}

}
