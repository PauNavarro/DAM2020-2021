package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer un número por teclado y mostrar su cuadrado. Repetir el proceso hasta
		// que se introduzca un número negativo

		Scanner teclado = new Scanner(System.in);

		int numIntr;

		do {

			System.out.println("Dame un numero");
			numIntr = teclado.nextInt();
			if (numIntr < 0) {
				continue;
			} else {

				System.out.println(Math.pow(numIntr, 2));
			}

		} while (numIntr >= 0);
		teclado.close();
	}

}
