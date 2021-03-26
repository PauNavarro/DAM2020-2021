package contador;

public class ContadorMain {

	public static void main(String[] args) {

		Contador cont1 = new Contador();
		
		cont1.setCont(5);
		
		System.out.println(cont1.getCont());
		
		cont1.incrementar(5);
		
		System.out.println(cont1.getCont());
		
		Contador cont2 = new Contador(cont1);
		cont1.decrementar(11);
		
		System.out.println(cont1.getCont());
		System.out.println(cont2.getCont());
		
	}

}
