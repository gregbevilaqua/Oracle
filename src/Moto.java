public class Moto extends Veiculo {

	boolean capacete;

	public Moto(String nome) {
		super(nome, 2);
		aceleracao = 10;
		velocidadeMaxima = 180;
	}

	public boolean checarSeguranca() {

		return capacete;
	}

}
