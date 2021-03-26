package boletinT3;

import java.util.Scanner;

public class NXB23 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que pida un número y construya por pantalla su pirámide
		 */

		Scanner teclado = new Scanner(System.in);

		int alturaPiramide;
		int cont;
		int hueco;
		int asterisco;

		System.out.println("Dame la altura de la piramide");

		alturaPiramide = teclado.nextInt();

		for (cont = 1; cont <= alturaPiramide; cont++) {

			// Huecos en blanco

			for (hueco = 1; hueco <= alturaPiramide - cont; hueco++) {

				System.out.print(" ");

			}

			// Asteriscos

			for (asterisco = 1; asterisco <= (cont * 2) - 1; asterisco++) {

				System.out.print("*");

			}

			//System.out.println("");

		}

		teclado.close();

	}
}
