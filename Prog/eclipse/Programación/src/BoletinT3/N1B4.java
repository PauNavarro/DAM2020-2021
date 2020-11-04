package BoletinT3;

import java.util.Scanner;

public class N1B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que muestre los números desde el 1 hasta un número N que
		 * se introducirá por teclado.
		 */

		Scanner teclado = new Scanner(System.in);

		int numeroUsu;

		System.out.println("Hasta que numero quieres contar");
		numeroUsu = teclado.nextInt();

		for (int cont = 1; cont <= numeroUsu; cont++) {
			System.out.println(cont);
		}
		teclado.close();
	}

}
