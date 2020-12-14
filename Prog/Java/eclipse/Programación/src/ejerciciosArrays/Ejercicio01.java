package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[10];

		System.out.println("Dame 10 numeros naturales para calcular la media de los pares e impares");
		
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = teclado.nextInt();

		}

		System.out.println("La media de los numeros pares introducidos es = " + mediaPar(numeros));
		System.out.println("La media de los numeros impares introducidos es = " + mediaImpar(numeros));
		
		teclado.close();
	}

	public static double mediaPar(int[] numeros) {

		int media = 0;
		int sumatorio = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {

				sumatorio = numeros[i] + sumatorio;

			}

			media = sumatorio / numeros.length;
		}

		return media;
	}

	public static double mediaImpar(int[] numeros) {

		int media = 0;
		int sumatorio = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 != 0) {

				sumatorio = numeros[i] + sumatorio;

			}

			media = sumatorio / numeros.length;
		}

		return media;
	}

}