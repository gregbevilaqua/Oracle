package Enume;

public enum Mes {

	JANEIRO(1,31),
	FEVEREIRO(2,28),
	MARCO(3,31),
	ABRIL(4,30),
	MAIO(5,31),
	JUNHO(6,30),
	JULHO(7,31),
	AGOSTO(8,31),
	SETEMBRO(9,30),
	OUTUBRO(10,31),
	NOVEMBRO(11,30),
	DEZEMBRO(12,31);

	public int id, dias;
	Mes(int id, int dias){
		this.id=id;
		this.dias=dias;
	}
	public String toString(){
		String res = "Id do Mês: " + id + "\nQuantidade de Dias que tem nesse mês: " +dias;  
		return res;
	}
	public int teste(){
		int x = 10;
		System.out.println(x);
		return x;
	}
}
