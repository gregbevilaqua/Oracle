package jeopardy;

import java.util.HashMap;
import java.util.Map;

public class Jogo {

	private Map<Categoria, Pergunta> perguntas;
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

	public static void main(String[] args) {
		Jogo jogo = new Jogo("Perguntas e Respostas");
	}

}
