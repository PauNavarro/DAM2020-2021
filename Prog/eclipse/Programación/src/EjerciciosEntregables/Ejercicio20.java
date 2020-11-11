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

		// El bucle se ejecutara hasta que el contador sea igual al numero introducido.

		for (; cont <= numIntr; cont++) {

			imprimir = cont; // hacemos que la variable imprimir sea igual al contador para asi imprimir el
			// numero correcto de * cada vez

			System.out.println();	// Utilizo un println para separar cada linea de asteriscos

			do { 		// este bucle se encarga de imprimir los asteriscos dentro de una misma linea,
					   // por eso utilizo un print y no un println

				System.out.print("*"); // se imprime un asterisco en la linea actual

				imprimir--;			// se resta 1 a imprimir cada vez que se ejecuta el bucle hasta que imprimir = 0.

			} while (imprimir > 0);

			teclado.close();
		}

	}
}
