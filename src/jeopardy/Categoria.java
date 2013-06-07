package jeopardy;

public enum Categoria {
	DEPLOYING(1, "Deployng", 10),
	GENERICS(2, "Generics", 20),
	CLASS_DESIGN(3, "Class Design", 30),
	STRINGS(4, "Strings", 40),
	EXCEPTIONS(5, "Exceptions", 50);
	
	private final String label;
	private final int codigo;
	private final int pontuacao;
	
	Categoria(int codigo, String label, int pontuacao) {
		this.label = label;
		this.codigo = codigo;
		this.pontuacao = pontuacao;
	}
	
	public String label() {
		return label;
	}
	
	public int codigo() {
		return codigo;
	}
	
	public int pontuacao() {
		return pontuacao;
	}
	
	@Override
	public String toString() {
		return label;
	}
}
