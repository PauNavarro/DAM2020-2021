package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio03 {

	/**
	 * 
	 * Diseñar un programa en el que se cree un array de 20 elementos, llamado
	 * pares, en el que se guarden los 20 primeros números pares. Una vez se haya
	 * llenado el array se deben imprimir por pantalla los valores de este array.
	 * 
	 **/

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] pares = new int[20];

		int numero;

		System.out.println("Dame un numero para sacar los 20 siguientes numeros pares");
		numero = teclado.nextInt();
		siguientesPares(numero, pares);

		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i] + " ");
		}

		teclado.close();
	}

	public static int[] siguientesPares(int numero, int[] pares) {

		if (numero % 2 == 0) {

			int a = numero;

			for (int i = 0; i < pares.length; i++) {

				pares[i] = a;

				a += 2;

			}

		} else {

			int a = numero + 1;

			for (int i = 0; i < pares.length; i++) {

				pares[i] = a;

				a += 2;

			}

		}

		return pares;

	}

}
