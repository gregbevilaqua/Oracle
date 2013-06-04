
public class TesteVeiculos {

	public static void main(String[] args) {

		Carro c = new Carro("Ferrari");
		c.cintoAtado=true;
		c.ligar();
		c.print();
		c.acelerar(1000);
		c.frear(52);
		
		
		/*Moto m = new Moto("Cinquentinha");
		m.print();
		m.capacete=true;
		m.ligar();
		m.print();
		m.acelerar(10);
		*/
		
		
	}

}
