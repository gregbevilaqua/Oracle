package jeopardy;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private Categoria categoria;
	private String caput;
	private List<Resposta> respostas;

	public Pergunta(Categoria categoria, String caput) {
		this.caput = caput;
		this.categoria = categoria;
		respostas = new ArrayList<Resposta>();
	}

	public void addResposta(Resposta resposta) {

		if (!resposta.emUso()) {

		}

	}

	public Categoria getCategoria() {

		return categoria;

	}

}
