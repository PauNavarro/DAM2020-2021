package boletinT3;

import java.util.Scanner;

public class N2B7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
		 * indicando cuántos son positivos y cuantos negativos.
		 */

		Scanner teclado = new Scanner(System.in);

		int numeroIntr = 1;
		boolean negativo = false;
		int contNeg = 0, contPos = 0;

		System.out.println("Dame 10 numeros no nulos (Si introduces un 0 el programa se detendra)");
		for (int cont = 0; cont < 10; cont++) {
			numeroIntr = teclado.nextInt();

			if (numeroIntr == 0)
				break;

			if (numeroIntr < 0) {
				negativo = true;
				contNeg++;
			} else
				contPos++;
		}

		if (negativo)
			System.out.println(
					"Se han introducido " + contNeg + " numero(s) negativo(s) y " + contPos + " numero(s) positivo(s)");
		if (negativo == false)
			System.out.println("No se ha introducido ningun numero negativo, se han introducido : " + contPos
					+ " numero(s) positivo(s)");
		teclado.close();
	}
}
