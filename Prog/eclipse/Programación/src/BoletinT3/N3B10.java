package BoletinT3;

import java.util.Scanner;

public class N3B10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que lea una secuencia de notas (con valores que van de 0
		 * a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con
		 * valor 10.
		 */

		Scanner teclado = new Scanner(System.in);

		int notaIntr;
		boolean diez = false;

		System.out.println("Dame notas (0-10,introduce el -1 para que el programa se detenga)");
		do {
			notaIntr = teclado.nextInt();

			if (notaIntr < 0)
				continue;

			if (notaIntr == 10)
				diez = true;

		} while (notaIntr > -1);

		if (diez == true) {
			System.out.println("Hay minimo 1 diez");
		} else {
			System.out.println("No hay ningun diez");
		}

		teclado.close();
	}

}
