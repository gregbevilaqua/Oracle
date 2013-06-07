package jeopardy;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private Categoria categoria;
	private String caput;
	private List<Resposta> respostas;
	private int gabarito;

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
	
	public static Pergunta criarPergunta(Categoria categoria, int gabarito,
			String caput, String... respostas) {

		Pergunta pergunta = new Pergunta(categoria, caput);

		try {

			for (String texto : respostas) {
				pergunta.addResposta(new Resposta(texto));
			}
			pergunta.setGabarito(gabarito);

		} catch (RespostaUsadaException e) {
			e.printStackTrace();
		}

		return pergunta;
	}

	public void setGabarito(int indice) {
		this.gabarito = indice;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public int getPontuacao() {
		return categoria.pontuacao();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(caput);
		sb.append("\n");
		for (Resposta resposta: respostas) {
			sb.append("\t"+ resposta + "\n");
		}
		
		return sb.toString();
	}
	
	public boolean verificar(int palpite) {
		return (palpite == gabarito);
	}

}
