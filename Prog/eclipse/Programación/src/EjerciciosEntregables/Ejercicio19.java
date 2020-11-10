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
public class Ejercicio19 {
	/**
	 * Realiza un programa que nos diga cuántas cifras tiene un número introducido
	 * por teclado. Hacerlo hasta que el usuario introduzca un 0 por pantalla.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables

		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int contCifr = 0;

		// Codigo

		do { // Bucle para pedir y contar cifras.

			System.out.println("Dame un numero"); // Peticion de valores al usuario
			numero = teclado.nextInt();

			if (numero == 0)
				continue; 	 // se comprueba si el numero es 0, si es asi se ejecuta un continue para
							// finalizar el bucle
 
			contCifr = 0; // Reset de el contador de cifras

			do { // Bucle para contar el numero total de cifras

				numero = numero / 10;
				contCifr++;

			} while (numero != 0);

			numero++; // Se hace que numero = numero + 1 debido a que el numero ha quedado en 0 a
					 // causa de las divisiones entre 10.

			System.out.println("El numero tiene " + contCifr + " cifras"); // Salida de datos

		} while (numero != 0);

		teclado.close();
	}
}
