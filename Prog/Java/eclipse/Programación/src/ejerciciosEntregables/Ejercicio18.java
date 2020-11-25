package ejerciciosEntregables;

import java.util.Scanner;

/**
 * @author Pau Navarro Palao
 * 
 *         date : 09/11/2020
 *
 *         Loc : Alzira
 *
 */

public class Ejercicio18 {

	/**
	 * Realiza un programa que nos diga cuántos 0 tiene un número introducido por
	 * teclado.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables

		Scanner teclado = new Scanner(System.in);

		int numero;
		int contCero = 0;

		// Codigo

		// Peticion de un numero al usuario
		System.out.println("Dame un numero para comprobar cuantos 0 tiene");
		numero = teclado.nextInt();

		// Bucle para ejecutar condiciones para comprobar si hay un cero presente o no
		while (numero != 0) {

			if (numero % 10 == 0) { // si el modulo de el numero dividido entre 10 es 0, hay un 0 presente en el
									// ultimo lugar.
				contCero++;
				numero = numero / 10; // se elimina el ultimo digito del numero

			} else {
				numero = numero / 10;
			}
		}

		System.out.println("Hay un total de " + contCero + " cero(s)");

		teclado.close();
	}

}
