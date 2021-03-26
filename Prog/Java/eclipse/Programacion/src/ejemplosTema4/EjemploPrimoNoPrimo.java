package ejemplosTema4;

import java.util.Scanner;

public class EjemploPrimoNoPrimo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int parar;

		do {

			System.out.println("Dame un numero para comprobar si es primo o no");

			if (primo() == true)
				System.out.println("El numero no es primo");
			else
				System.out.println("El numero es primo");

			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

	public static boolean primo() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int numero;
		boolean noPrimo;

		numero = teclado.nextInt();

		noPrimo = false;

		for (int i = 2; i <= numero / 2; ++i) {

			if (numero % i == 0) {
				noPrimo = true;
				break;
			} 
		}

		return noPrimo;
	}

}
