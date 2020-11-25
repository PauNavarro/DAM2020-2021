package boletinT3;

import java.util.Scanner;

public class NXB17 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa en java que pida un número entero positivo y nos diga si
		 * es primo o no. (Un número es primo si es solo es divisible entre 1 y entre él
		 * mismo)
		 */
		
		Scanner teclado = new Scanner(System.in);

		int numeroIntr;
		boolean noPrimo = false;

		do {

			do {
				System.out.println("Dame un numero");
				numeroIntr = teclado.nextInt();

				if (numeroIntr < 0)
					System.out.println("El numero no puede ser negativo, introduce otro numero");

			} while (numeroIntr < 0);

			noPrimo = false;

			if (numeroIntr == 0)
				continue;

			for (int i = 2; i <= numeroIntr / 2; ++i) {

				if (numeroIntr % i == 0) {
					noPrimo = true;
					break;
				}
			}

			if (noPrimo)
				System.out.println("El numero no es primo");
			else
				System.out.println("El numero es primo");

		} while (numeroIntr != 0);

		System.out.println("El programa se va a detener.");

		teclado.close();

	}

}
