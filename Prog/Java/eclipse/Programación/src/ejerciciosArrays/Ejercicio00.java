package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] temperatura = new double[10];

		System.out.println("Dame 10 temperaturas:");

		for (int i = 0; i < temperatura.length; i++) {

			temperatura[i] = teclado.nextDouble();

		}
		System.out.println("La media de temperatura es = " + media(temperatura) + "Cº");
		System.out.println("La media de las temperaturas positivas es = " + mediaPos(temperatura) + "Cº");
		System.out.println("La media de las temperaturas negativas es = " + mediaNeg(temperatura) + "Cº");
		teclado.close();
	}

	public static double media(double[] temperatura) {

		double media = 0;
		double sumatorio = 0;

		for (int i = 0; i < temperatura.length; i++) {

			sumatorio = temperatura[i] + sumatorio;

			media = sumatorio / temperatura.length;
		}
		return media;
	}

	public static double mediaPos(double[] temperatura) {

		double media = 0;
		double sumatorio = 0;
		int cont = 0;

		for (int i = 0; i < temperatura.length; i++) {

			if (temperatura[i] > 0) {

				cont++;

				sumatorio = temperatura[i] + sumatorio;

			}
		
			media = sumatorio / cont;
			
		}
		return media;
	}

	public static double mediaNeg(double[] temperatura) {

		double media = 0;
		double sumatorio = 0;
		int cont = 0;

		for (int i = 0; i < temperatura.length; i++) {

			if (temperatura[i] <= 0) {

				cont++;

				sumatorio = temperatura[i] + sumatorio;

			}
		
			media = sumatorio / cont;
			
		}
		return media;
	}

}
