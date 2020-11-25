package ejerciciosEntornos;

import java.util.Scanner;

public class SumaPares {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int parar;

		do {

			suma();

			System.out.println("");
			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

	private static int suma() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int numIntr;
		int numIntrcopia;
		int sumatorio = 0;
		int i;

		System.out.println("Dame un numero");
		numIntr = sc.nextInt();

		numIntrcopia = numIntr;

		System.out.println("La suma de los " + numIntr + " siguientes numeros pares a partir de " + numIntr + " es :");

		for (i = 0; i < numIntr; numIntrcopia++) {

			if (numIntrcopia % 2 == 0) {

				sumatorio = numIntrcopia + sumatorio;

				System.out.print(numIntrcopia);

				if (i == numIntr - 1) {
					System.out.print(" = ");
				} else {
					System.out.print(" + ");
				}
				
				i++;
			}
		}

		System.out.print(sumatorio);
		
		return 0;
	}

}
