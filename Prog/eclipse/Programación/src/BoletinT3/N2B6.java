package BoletinT3;

import java.util.Scanner;

public class N2B6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de
		 * si ha leído algún número negativo o no.
		 */

		Scanner teclado = new Scanner(System.in);

		int numeroIntr = 1;
		boolean negativo =false;

		System.out.println("Dame 10 numeros no nulos (Si introduces un 0 el programa se detendra)");
		for (int cont = 0; cont < 10 && numeroIntr != 0; cont++) {
			numeroIntr = teclado.nextInt();

			if (numeroIntr < 0) {
				negativo = true;
			}
		}
		
		if(negativo) System.out.println("Se ha introducido minimo un numero negativo");
		if(negativo == false) System.out.println("No se ha introducido ningun numero negativo");
		teclado.close();
	}

}
