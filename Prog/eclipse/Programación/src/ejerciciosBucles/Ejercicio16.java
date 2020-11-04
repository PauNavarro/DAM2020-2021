package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir números hasta que se introduzca uno negativo, y calcular la media.

		Scanner teclado = new Scanner(System.in);

		double numIntr;
		double cont = 0;
		double sumatorio = 0;
		double media;

		do {

			System.out.println("Dame numero");
			numIntr = teclado.nextDouble();

			if (numIntr >= 0) {
				
				sumatorio = sumatorio + numIntr;

				cont++;
			}
			
			continue;
			
		} while (numIntr >= 0);

		media = sumatorio / cont;

		System.out.println(media);

		teclado.close();
	}

}
