package ejemplosTema4;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int parar;

		do {

			System.out.println(maximo());

			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

	private static int maximo() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("Dame dos numeros enteros para que te devuelva el numero mayor.");

		System.out.println("Dame el 1er numero");
		num1 = teclado.nextInt();

		System.out.println("Dame el 2º numero");
		num2 = teclado.nextInt();

		if (num1 > num2) {

			return num1;

		} else {

			return num2;

		}
	}
}
