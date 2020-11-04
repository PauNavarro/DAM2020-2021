package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los número
		// introducidos.

		Scanner teclado = new Scanner(System.in);

		int sumatorio = 0;
		int numeroIntr;

		do {
			System.out.println("Dame un numero (El numero 0 detendra el programa)");
			numeroIntr = teclado.nextInt();

			sumatorio = numeroIntr + sumatorio;

		} while (numeroIntr != 0);

		System.out.println("La suma de todos los numeros es : " + sumatorio);

		teclado.close();
	}

}
