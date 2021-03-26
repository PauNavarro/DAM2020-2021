package boletinT3;

import java.util.Scanner;

public class N2B8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que lea una secuencia de números no nulos hasta que se
		 * introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
		 * positivos y cuantos negativos
		 */
		
		Scanner teclado = new Scanner(System.in);

		
		int numIntr;
		boolean negativo = false;
		int contNeg = 0, contPos = 0;
		
		System.out.println("Dame numeros");
		
		do {
			numIntr = teclado.nextInt();
			
			if (numIntr == 0) continue;

			if (numIntr < 0) {
				negativo = true;
				contNeg++;
			} else
				contPos++;
		
		}while (numIntr != 0);

		if (negativo)
			System.out.println(
					"Se han introducido " + contNeg + " numero(s) negativo(s) y " + contPos + " numero(s) positivo(s)");
		if (negativo == false)
			System.out.println("No se ha introducido ningun numero negativo, se han introducido : " + contPos
					+ " numero(s) positivo(s)");
		teclado.close();
			
			
			
		

	}

}
