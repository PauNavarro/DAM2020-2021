package ejerciciosCondicionales;

import java.util.Scanner;

public class HorasMinSecSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Escribe un programa que recibe como datos de entrada una hora expresada en
		// horas, minutos y segundos que nos calcula y escribe la hora, minutos y
		// segundos que ser�n, transcurrido un segundo.

		int horasIniciales;
		int minutosIniciales;
		int segundosIniciales;
		int segundosASumar;

		System.out.println("Dame la hora");
		horasIniciales = teclado.nextInt();

		System.out.println("Dame los minutos");
		minutosIniciales = teclado.nextInt();

		System.out.println("Dame los segundos");
		segundosIniciales = teclado.nextInt();

		System.out.println("Cuantos segundos quieres sumar");
		segundosASumar = teclado.nextInt();

		int horasFinales = horasIniciales;
		int minutosFinales = minutosIniciales;
		int segundosFinales = segundosIniciales;

		for (; segundosFinales >= 60; minutosFinales++) {
			segundosFinales = segundosFinales - 60;
		}

		for (; segundosASumar >= 60; minutosFinales++) {
			segundosASumar = segundosASumar - 60;
		}
		for (; minutosFinales >= 60; horasFinales++) {
			minutosFinales = minutosFinales - 60;
		}

		System.out.println(
				"El resultado es :" + horasFinales + "h, " + minutosFinales + "min, " + segundosFinales + "sec.");

		teclado.close();
	}

}