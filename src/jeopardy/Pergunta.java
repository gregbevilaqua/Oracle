package jeopardy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pergunta {
	private Categoria categoria;
	private String caput;
	private List<Resposta> respostas;
	private int correta;

	public Pergunta(Categoria categoria, String caput) {
		this.caput = caput;
		this.categoria = categoria;
		respostas = new ArrayList<Resposta>();
	}

	public void addResposta(Resposta resposta) throws RespostaUsadaException {
		if (!resposta.emUso()) {
			resposta.usar();
			respostas.add(resposta);
		} else {
			throw new RespostaUsadaException();
		}
	}

	public void setCorreta(int indice) {
		this.correta = indice;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public int getPontuacao() {
		return categoria.pontuacao();
	}
	
	@Override
	public String toString() {
		return caput;
	}
	
	public Iterator<Resposta> respostas() {
		return respostas.iterator();
	}

	public boolean verificar(int palpite) {
		return (palpite == correta);
	}

}
