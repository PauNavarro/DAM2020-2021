package ejerciciosEntregables;
import java.util.Scanner;

/**
 * @author Pau Navarro Palao
 * 
 *         date : 02/11/2020
 *
 *         Loc : Alzira
 *
 */
public class Ejercicio17 {

	/**
	 * Realiza un programa que nos diga si un número es PRIMO.
	 * 
	 * Un numero es primo si solo es divisible entre 1 (NºPrimo%1 = X) o entre si
	 * mismo (NºPrimo%NºPrimo = X = primo, si no se cumple el numero no es primo)
	 *
	 * Hacer que sigua pidiendo numeros hasta que se introduzca el 0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaro entrada de teclado y las variables a utilizar

		Scanner teclado = new Scanner(System.in);

		int numeroIntr;
		boolean noPrimo = false;

		// Inicio del bucle para comprobar mas de 1 numero

		do {

			// Petición de el numero a comprobar en esta repetición

			// Bucle para comprobar si el numero es positivo
			do {
				System.out.println("Dame un numero");
				numeroIntr = teclado.nextInt();

				// en caso de que se introduzca un numero negativo el bucle se repetiria hasta
				// que se introduzca un numero positivo

				if (numeroIntr < 0)
					System.out.println("El numero no puede ser negativo, introduce otro numero");

			} while (numeroIntr < 0);

			// Reset del resultado para evitar errores en el programa

			noPrimo = false;

			// Definiendo el factor para que si se introduce un 0 no lo detecte como numero
			// primo y entonces pare el programa.

			if (numeroIntr == 0)
				continue;

			// Inicio del bucle para detectar si un numero es primo o no

			/*
			 * si el numero introducido / 2 es mayor o igual a la variable i se entra al
			 * bucle, si no es asi el numero que se ha introducido es primo
			 */

			for (int i = 2; i <= numeroIntr / 2; ++i) {

				// en caso de que se entre al bucle se comprueba si el resto de el numero
				// introducido / i es igual a 0
				// si es el caso, el resultado sera que el numero no es primo ( noPrimo = true)

				if (numeroIntr % i == 0) {
					noPrimo = true;
					break;
				}
			}

			// Salida de resultados

			if (noPrimo) // if (noPrimo == true )
				System.out.println("El numero no es primo");
			else // if ( noPrimo == false)
				System.out.println("El numero es primo");

		} while (numeroIntr != 0);

		System.out.println("El programa se va a detener.");

		teclado.close();
	}

}
