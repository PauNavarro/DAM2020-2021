package boletinT3;

import java.util.Scanner;

public class NXB18 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		 * el último dado. La introducción de números finaliza con la introducción de un
		 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
		 * total de números fallados.
		 * 
		 */

		Scanner teclado = new Scanner(System.in);

		int numero1;
		int numero2;
		int contNum = 0;
		int contFallados = 0;

		System.out.println("Dime un numero inicial");
		numero1 = teclado.nextInt();
		contNum++;

		do {

			System.out.println("Dame un numero");
			numero2 = teclado.nextInt();

			if (numero2 == 0) {

				System.out.println("Has introducido un 0, el programa se va a detener.");
				break;

			} else if (numero2 < numero1) {

				System.out.println("Error, el numero es menor");

				contNum++;
				contFallados++;

			} else if (numero2 > numero1) {

				contNum++;
				numero1 = numero2;

			}

		} while (numero1 != 0 && numero2 != 0);

		System.out.println(
				"Se han introducido : " + contNum + " numeros, de los cuales " + contFallados + " han dado error");

		teclado.close();
	}

}
