package ejemplosTema4;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int rdo = 0;
		int parar;

		System.out.println("Dame el numero para calcular su doble:");

		do {

			rdo = doble();

			System.out.println(rdo);

			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");
		
		teclado.close();
		
	}

	private static int doble() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int rdo;
		int n1;
		
		System.out.println("Dame el numero");
		n1 = teclado.nextInt();
		
		rdo = n1 * 2;
		
		return rdo;
	}

}
