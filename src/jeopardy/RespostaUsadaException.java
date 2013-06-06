package jeopardy;

public class RespostaUsadaException extends Exception {

	private static final long serialVersionUID = 1L;

	public RespostaUsadaException() {
		super("Resposta ja foi utilizada por outra pergunta");
	}
	
}
