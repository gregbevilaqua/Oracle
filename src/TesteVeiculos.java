public class TesteVeiculos {

	public static void main(String[] args) {

		Carro c = new Carro("Ferrari");
		Veiculo v = new Veiculo(null, 0);
		
		c.cintoAtado = true;
		c.ligar();
		c.print();
		c.acelerar(1000);
		c.frear(152);
		

		/*
		 * Moto m = new Moto("Cinquentinha"); m.print(); m.capacete=true;
		 * m.ligar(); m.print(); m.acelerar(10);
		 */

	}

}
