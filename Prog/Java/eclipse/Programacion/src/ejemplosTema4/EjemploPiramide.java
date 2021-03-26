package ejemplosTema4;

import java.util.Scanner;

public class EjemploPiramide {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int parar;

		do {

			piramide();
			
			System.out.println("");
			System.out.println("Pulsa 0 para cerrar el programa, pulsa 1 para introducir otro numero;");
			parar = teclado.nextInt();

		} while (parar != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

	public static void piramide() {

		@SuppressWarnings("resource")
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
			
			System.out.println("");
			
		}

	}
}
