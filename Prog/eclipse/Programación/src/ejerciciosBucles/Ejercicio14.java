package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// edir números hasta que se teclee uno negativo, y mostrar cuantos números se
		// han introducido…

		Scanner teclado = new Scanner(System.in);

		int numeroIntr = 541564;
		int cont;

		for (cont = -1; numeroIntr >= 0; cont++) {

			System.out.println("Dame un numero");
			numeroIntr = teclado.nextInt();

		}

		System.out.println("Se han introducido : " + cont + " numeros");

		teclado.close();
	}

}
