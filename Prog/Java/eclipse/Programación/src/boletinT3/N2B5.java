package boletinT3;

import java.util.Scanner;

public class N2B5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que lea un número positivo N y calcule y visualice su
		 * factorial N!
		 */

		Scanner teclado = new Scanner(System.in);

		int numero;
		long factorial = 1;

		System.out.println("Dame un numero para calcular su factorial");
		numero = teclado.nextInt();

		for (int cont = 1; cont <= numero; cont++) {

			factorial = (cont * factorial);

		}
		System.out.println(factorial);
		
		teclado.close();
	}

}
