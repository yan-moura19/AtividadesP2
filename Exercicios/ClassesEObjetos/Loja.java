package ClassesEObjetos;

public class Loja {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Palio", "Fiat",  35000);
		System.out.println(carro1);
		
		Carro carro2 = new Carro ("Palio", "Fiat", "prateado", 2, false, false, false, false, 35000);
		System.out.println(" =====================================" + " \n");
		System.out.println(carro2);
		
		System.out.println(" =====================================" + " \n");
		Carro carro3 = new Carro("Civic", "Honda",  110000);
		System.out.println(carro3);
		
		System.out.println(" =====================================" + " \n");
		Carro carro4 = new Carro ("Corolla", "Toyota", "branco", 2, true, true, false, true, 110000);
		System.out.println(carro4);
		
		System.out.println(" =====================================" + " \n");
		Carro carro5 = new Carro();
		carro5.nome = "Gol";
		

	}

}
