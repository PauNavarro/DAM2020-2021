package ejercicio_4;

public class Principal {

	public static void main(String[] args) {

		Electrodomestico e[] = new Electrodomestico[10];

		Electrodomestico e0 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e1 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e2 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e3 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e4 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e5 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e6 = new Lavadora(100, "blanco", 25, "A", 15);
		Electrodomestico e7 = new Electrodomestico(100, "blanco", 25, "A");
		Electrodomestico e8 = new Television(100, "blanco", 25, "A", true, 21);
		Electrodomestico e9 = new Electrodomestico(100, "blanco", 25, "A");

		e[0] = e0;
		e[1] = e1;
		e[2] = e2;
		e[3] = e3;
		e[4] = e4;
		e[5] = e5;
		e[6] = e6;
		e[7] = e7;
		e[8] = e8;
		e[9] = e9;
		
		for (int i = 0; i < e.length; i++) {
			
			System.out.println(e[i].precioFinal());
			
		}

	}

}
