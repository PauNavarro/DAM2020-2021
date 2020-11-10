/**
 * 
 */
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
public class Ejercicio20 {

	public static void main(String[] args) {

		// Declaro e inicializo las variables
		
		Scanner teclado = new Scanner(System.in);

		int cont = 1;
		int numIntr;
		int imprimir = 0;

		// Peticion de un valor al usuario para saber cual es la altura del triangulo
		
		System.out.println("Dame la altura del triangulo a imprimir");
		numIntr = teclado.nextInt();
		
		for (; cont <= numIntr; cont++) {

			imprimir = cont;

			System.out.println();
			
			do {

				System.out.print("*");

				imprimir--;

			} while (imprimir > 0);
		}

	}
}
