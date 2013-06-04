public class Veiculo {

	String nome;
	int rodas;
	int velocidade;
	int aceleracao;
	int velocidadeMaxima;
	boolean ligado;

	public Veiculo(String nome, int rodas) {
		this.nome = nome;
		this.rodas = rodas;
	}

	public void acelerar(int tempo) {

		for (int i = 0; i < tempo; i++) {
			if (velocidade < velocidadeMaxima)
				velocidade = velocidade + aceleracao;

			if (velocidade >= velocidadeMaxima)
				velocidade = velocidadeMaxima;
			print();
		}

	}

	public void frear(int tempo) {

		for (int i = 0; i < tempo; i++) {
			if (velocidade > 0)
				velocidade = velocidade - aceleracao;

			if (velocidade <= 0) {
				velocidade = 0;
				break;
			}
			print();
		}

	}

	public void ligar() {
		if (checarSeguranca()) {
			ligado = true;
		}
	}

	public void desligar() {
		ligado = false;
	}

	public boolean checarSeguranca() {
		return false;
	}

	public void print() {
		System.out.println("Veiculo: " + nome + " Rodas:" + rodas
				+ " Velocidade:" + velocidade + "KM/h" + " Ligado:" + ligado);
	}
}
