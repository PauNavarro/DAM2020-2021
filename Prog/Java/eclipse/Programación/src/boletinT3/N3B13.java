package boletinT3;

import java.util.Scanner;

public class N3B13 {

	public static void main(String[] args) {

		/**
		 * Realiza un programa que dada una cantidad de euros que el usuario introduce
		 * por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán
		 * necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200,
		 * 100, 50, 20, 10 y 5). Hay que indicar el mínimo de billetes posible. Por
		 * ejemplo, si el usuario introduce 145 el programa indicará que será necesario
		 * 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por
		 * ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de
		 * billetes posible).
		 */

		Scanner teclado = new Scanner(System.in);

		// Variables

		int eurIntr;
		int cant5, cant10, cant20, cant50, cant100, cant200, cant500;

		// Codigo

		System.out.println("Dame una cantidad de euros.");
		eurIntr = teclado.nextInt();

		if (eurIntr < 5) {

			System.out.println("No se puede calcular la cantidad de billetes necesarios, minimo has de introducir 5€");

		}

		for (; eurIntr != 0 && eurIntr > 0;) {

			if (eurIntr >= 500) {
				cant500 = eurIntr / 500;
				eurIntr -= 500 * cant500;
				System.out.print(cant500 + " billete(s) de 500€");
			} else if (eurIntr >= 200) {
				cant200 = eurIntr / 200;
				eurIntr -= 200 * cant200;
				System.out.print(" " + cant200 + " billete(s) de 200€");
			} else if (eurIntr >= 100) {
				cant100 = eurIntr / 100;
				eurIntr -= 100 * cant100;
				System.out.print(" " + cant100 + " billete(s) de 100€");
			} else if (eurIntr >= 50) {
				cant50 = eurIntr / 50;
				eurIntr -= 50 * cant50;
				System.out.print(" " + cant50 + " billete(s) de 50€");
			} else if (eurIntr >= 20) {
				cant20 = eurIntr / 20;
				eurIntr -= 20 * cant20;
				System.out.print(" " + cant20 + " billete(s) de 20€");
			} else if (eurIntr >= 10) {
				cant10 = eurIntr / 10;
				eurIntr -= 10 * cant10;
				System.out.print(" " + cant10 + " billete(s) de 10€");
			} else if (eurIntr >= 5) {
				cant5 = eurIntr / 5;
				eurIntr -= 5 * cant5;
				System.out.print(" " + cant5 + " billete(s) de 5€");
			} else if (eurIntr < 5) {
				System.out.print(" y sobra " + eurIntr + "€");
				eurIntr -= eurIntr;
			}
		}

		teclado.close();
	}
}
