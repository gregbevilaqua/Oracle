package jeopardy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Jogo {

	private HashMap<Categoria, Pergunta> perguntas;
	private String nome;
	private int maximoPerguntas;
	private int totalPerguntas;

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
	
	public void jogar() {
		System.out.println(nome);
		
		Iterator it = perguntas.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry perguntas = (Map.Entry)it.next();
	       	System.out.println("ola");
		}
	}

	public static void main(String[] args) {
		Jogo jogo = new Jogo("Perguntas e Respostas");

		Pergunta p1 = new Pergunta(
				Categoria.STRINGS,
				"Qual a maneira correta para verificar a quantidade de caracteres de uma String?");
		try {
			p1.addResposta(new Resposta("Atraves da propriedade lenght", false));
			p1.addResposta(new Resposta("Atraves do metodo lenght", true));
			p1.addResposta(new Resposta("Atraves da propriedade size", false));
			p1.addResposta(new Resposta("Atraves da metodo size", false));
		} catch (RespostaUsadaException e) {
			System.out.println(e.getMessage());
		}
		jogo.jogar();
	}

}
