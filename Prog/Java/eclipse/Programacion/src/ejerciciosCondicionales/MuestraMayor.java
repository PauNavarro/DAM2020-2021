package ejerciciosCondicionales;

import java.util.Scanner;

public class MuestraMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// 14.- Escribe un programa que lee 2 n�meros y muestra el mayor.

		double numero1;
		double numero2;

		System.out.println("Dame el primer numero");
		numero1 = teclado.nextDouble();

		System.out.println("Dame el segundo numero");
		numero2 = teclado.nextDouble();

		if (numero1 == numero2) {
			System.out.println(numero1 + " = " + numero2);
			System.out.println("Los numeros son equivalentes");
		} else {

			if (numero1 > numero2) {
				System.out.println(numero1 + " > " + numero2);
				System.out.println("El primer numero ( " + numero1 + " ) es mayor");
			} else {
				System.out.println(numero1 + " < " + numero2);
				System.out.println("El segundo numero ( " + numero2 + " ) es mayor");
			}
		}
		teclado.close();
	}

}
