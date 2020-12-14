package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeroDeNotas;
		double media;
		int b = 1;

		System.out.println("Cuantas notas quieres introducir");
		numeroDeNotas = teclado.nextInt();

		double[] notas = new double[numeroDeNotas];

		System.out.println("Dame " + numeroDeNotas + " notas:");
		for (int i = 0; i < notas.length; i++) {

			notas[i] = teclado.nextDouble();

		}

		media = media(notas);

		System.out.println("La media de la clase es " + media);

		System.out.println("Los alumnos por encima de la media son:");
		for (int a = 0; a < notas.length; a++) {

			if (notas[a] > media)
				System.out.println("El alumno Numero " + b + " tiene un " + notas[a]);

			b++;
		}
		
		teclado.close();

	}

	public static double media(double[] notas) {

		double media = 0;
		double sumatorio = 0;

		for (int i = 0; i < notas.length; i++) {

			sumatorio = notas[i] + sumatorio;

			media = sumatorio / notas.length;
		}
		return media;
	}

}
