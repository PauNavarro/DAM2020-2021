package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numeroIntr;

		do {

			System.out.println("Dame un numero");
			numeroIntr = teclado.nextInt();

			if (numeroIntr > 0) {
				System.out.println("El numero es positivo");
			} else if (numeroIntr < 0) {
				System.out.println("El numero es negativo");
			}

		} while (numeroIntr != 0);
		
		System.out.println("El programa se ha detenido");
		
		teclado.close();
	}

}
