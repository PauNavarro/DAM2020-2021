package boletinT3;

import java.util.Scanner;

public class NXB20 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que lea un n�mero y a continuaci�n escriba el car�cter
		 * �*� tantas veces igual al valor num�rico le�do. En aquellos casos en que el
		 * valor le�do no sea positivo se deber� escribir un �nico asterisco
		 */

		Scanner teclado = new Scanner(System.in);

		int cantidad;
		int contador = 0;

		do {

			System.out.println("Cuantos asteriscos quieres escribir");
			cantidad = teclado.nextInt();
			contador = 0;

			if (cantidad == 0) {

				System.out.println("El programa se va a detener");

			} else if (cantidad < 0) {

				System.out.println("*");

			}

			for (; contador < cantidad; contador++) {

				System.out.print("*");

			}

			System.out.println("");

		} while (cantidad != 0);

		teclado.close();
	}

}
