package jeopardy;

public class Resposta {
	private final String texto;
	private boolean emUso;

	public Resposta(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public boolean emUso() {
		return emUso;
	}

	public void usar() {
		emUso = true;
	}

}
