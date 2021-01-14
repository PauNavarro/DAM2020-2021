package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio04 {

	/**
	 * 
	 * Diseñar un programa en el que se pida al usuario que introduzca 10 número
	 * enteros y éstos se guarden en un array. Una vez introducidos, el programa
	 * debe mostrar por pantalla cuántos números negativos, cuántos números
	 * positivos y cuántos 0 hay en el array
	 *
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeros[] = new int[10];

		System.out.println("Dame 10 numeros");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();
		}

		compNum(numeros);

		teclado.close();
	}

	private static void compNum(int[] numeros) {

		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > 0) {
				positivos++;
			} else if (numeros[i] < 0) {
				negativos++;
			} else {
				ceros++;
			}
		}

		System.out.println("Hay un total de " + positivos + " numeros positivos.");
		System.out.println("Hay un total de " + negativos + " numeros negativos.");
		System.out.println("Hay un total de " + ceros + " ceros.");

	}

}
