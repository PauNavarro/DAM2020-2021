package tests;

import java.util.Scanner;

public class DesglosarDinero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int dinero[] = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 05, 02, 01 };

		int totales[] = new int[14];

		int dineroEnCentimos;

		double dinerototal;

		System.out.println("Dame una cantidad de dinero");

		dinerototal = teclado.nextDouble();

		dineroEnCentimos = (int) (dinerototal * 100);

		System.out.println("Necesitaras : ");

		for (int i = 0; i < dinero.length; i++) {

			totales[i] = dineroEnCentimos / dinero[i];
			dineroEnCentimos = dineroEnCentimos % dinero[i];

			if (dinero[i] > 50) {

				if (totales[i] >= 1 && totales[i] != 0) {

					System.out.print(totales[i] > 1 ? totales[i] + " billetes de " : totales[i] + " billete de ");
					System.out.print(dinero[i] / 100);
					System.out.println();

				}
			} else if (dinero[i] < 50) {

				if (totales[i] >= 1 && totales[i] != 0) {
					if (dinero[i] > 50) {
						System.out.print(totales[i] > 1 ? totales[i] + "monedas de " : totales[i] + " moneda de ");
						System.out.printf("%.2f", (double) (dinero[i] / 100));
						System.out.print(totales[i] > 1 ? dinero[i] + " euros" : dinero[i] + " euro");
						System.out.println();
					} else {
						System.out.print(totales[i] > 1 ? totales[i] + "monedas de " : totales[i] + " moneda de ");
						System.out.print(dinero[i] == 1 ? dinero[i] + " centimo" : dinero[i] + " centimos");
						System.out.println();
					}

				}
			}
		}
	}
}
