package boletinT3;

import java.util.Scanner;

public class NXB19 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa para calcular la suma de los cuadrados de los n primeros
		 * números naturales.
		 */

		// Variables

		Scanner teclado = new Scanner(System.in);
		
		int sumaAcum = 0;
		int numIntr;

		// Codigo

		System.out.println("hata que numero quieres sumar los cuadrados de todos los numeros naturales");
		numIntr = teclado.nextInt();
		
		for (int cont = 1; cont <= numIntr; cont++) {

			sumaAcum = (int) (Math.pow(cont, 2) + sumaAcum);
			
		}

		System.out.println(sumaAcum);
		
		teclado.close();
	}

}
