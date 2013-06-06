package jeopardy;

public class Resposta {
	private final String texto;
	private final boolean correta;
	private boolean emUso;

	public Resposta(String texto, boolean correta, boolean emUso) {
		this.texto = texto;
		this.correta = correta;
		this.emUso = emUso;
	}

	public String getTexto() {
		return texto;
	}

	public boolean isCorreta() {
		return correta;
	}

	public boolean emUso() {
		return emUso;
	}

	public void usar() {
		emUso = true;
	}

}
