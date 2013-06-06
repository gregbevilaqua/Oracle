package jeopardy;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
	
	private Set<Categoria, Pergunta> perguntas;
	
	public Jogo() {
		perguntas = new HashSet<Categoria, Pergunta>();
	}
	
	public void addPergunta(Pergunta pergunta) {
		perguntas.add(pergunta.getCategoria(), pergunta);
	}
	
	
	
}
