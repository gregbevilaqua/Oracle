package jeopardy;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
	
	private Map<Categoria, Pergunta> perguntas;
	
	public Jogo() {
		perguntas = new HashMap<Categoria, Pergunta>();
	}
	
	public void addPergunta(Pergunta pergunta) {
		perguntas.put(pergunta.getCategoria(), pergunta);
	}
	
	
	
}
