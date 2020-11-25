package ejemplosTema4;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int rdo = 0;
		int parar;

		System.out.println("Dame dos numeros para sumar:");

		do {

			rdo = suma();

			System.out.println(rdo);

			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();
		
	}

	private static int suma() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int rdo;
		int n1;
		int n2;

		System.out.println("Dame un numero");
		n1 = teclado.nextInt();

		System.out.println("Dame otro numero");
		n2 = teclado.nextInt();

		rdo = n1 + n2;
	
		return rdo;
	}

}
