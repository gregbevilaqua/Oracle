public class Carro extends Veiculo {

	boolean cintoAtado;

	public Carro(String nome) {
		super(nome, 4);
		aceleracao = 8;
		velocidadeMaxima = 220;
	}

	public boolean checarSeguranca() {

		return cintoAtado;
	}

}
