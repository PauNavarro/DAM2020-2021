package ejerciciosCondicionales;

import java.util.Scanner;

public class ConversorTiempo {

	public static void main(String[] args) {
		

		// Se debe realizar un programa en el que se introduzca
		// un n�mero de minutos y devuelva la conversi�n a d�as, horas y minutos

		Scanner teclado = new Scanner(System.in);

		int minutos;
		int minutosIniciales;
		int horas = 0;
		int dias = 0;

		System.out.println("Dame el tiempo en Min a convertir");
		minutos = teclado.nextInt();
		minutosIniciales = minutos;

		for (; minutos >= 60; horas++) {
			minutos = minutos - 60;
		}
		for (; horas >= 24;) {
			horas = horas - 24;
			dias++;
		}
		System.out.println(
				"Los " + minutosIniciales + " Min equivalen a " + dias + " dias, " + horas + " h, " + minutos + "min.");
		teclado.close();
	}

}
