package jeopardy;

public class RespostaUsadaException extends Exception {

	public RespostaUsadaException() {
		super();
	}

	public RespostaUsadaException(String message) {
		super("Resposta ja foi utilizada por outra pergunta");
	}

	
}
