package boletinT3;

import java.util.Scanner;

public class NXB21 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que pida un n�mero entero N entre 0 y 20 y luego muestre
		 * por pantalla los n�meros desde 1 hasta N, uno en cada l�nea, repitiendo cada
		 * n�mero tantas veces como su valor.
		 */

		Scanner teclado = new Scanner(System.in);

		int cont = 1;
		int numIntr;
		int imprimir = 0;


		System.out.println("Dame un numero");
		numIntr = teclado.nextInt();


		for (; cont <= numIntr; cont++) {

			imprimir = cont; 
			System.out.println();

			do { 

				System.out.print(cont);

				imprimir--; 

			} while (imprimir > 0);

			teclado.close();

		}

	}
}
