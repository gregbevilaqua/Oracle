package jeopardy;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
	
	private Set<Pergunta> perguntas;
	
	public Jogo() {
		perguntas = new HashSet<Pergunta>();
	}
	
	public void addPergunta(Pergunta pergunta) {
		perguntas.add(pergunta);
	}
	
	
	
}
