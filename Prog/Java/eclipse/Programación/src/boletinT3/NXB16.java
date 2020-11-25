package boletinT3;

import java.util.Scanner;

public class NXB16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
		 * que introducimos por teclado.
		 */

		// Variables

		Scanner teclado = new Scanner(System.in);
		int cont = 1;
		int numero;
		int contMult = 0;
		
		// Codigo

		System.out.print("Dame un numero :");
		numero = teclado.nextInt();
		
		while (cont <= numero) {
			
			if (cont % 3 == 0) {
				contMult++;
			}
			cont++;
		}
		System.out.println("Cantidad de multiplos de 3 : " + contMult);
		teclado.close();
	}

}
