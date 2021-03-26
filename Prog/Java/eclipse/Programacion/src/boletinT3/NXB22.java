package boletinT3;

import java.util.Scanner;

public class NXB22 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
		 * Luego visualiza los números desde A hasta B e indicar cuantos hay pares.
		 */

		Scanner teclado = new Scanner(System.in);

		int numeroA;
		int numeroB;
		int contPar = 0;

		System.out.println("Dame el primer numero (A)");
		numeroA = teclado.nextInt();

		System.out.println("Dame el segundo numero(B), recuerda que este tiene que ser mayor que (A)");
		numeroB = teclado.nextInt();

		for (; numeroA <= numeroB; numeroA++) {
			
			System.out.print(numeroA + " ");
			
			if (numeroA % 2 == 0) {

				contPar++;

			}

		}
		System.out.println("");
		System.out.println("Hay un total de " + contPar + " numeros pares");
		
		teclado.close();
	}

}
