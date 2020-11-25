package ejerciciosCondicionales;

import java.util.Scanner;

public class CuentaCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// 20.- Escribir un programa que pida al usuario un número entre 0 y 9999 y decir
		// cuántas cifras tiene

		int numero;

		System.out.println("Introduce un numero entre el 0 y el 9999");
		numero = teclado.nextInt();

		if (numero < 10) {
			System.out.println("El numero tiene 1 cifra");
		} else {
			if (numero < 100) {
				System.out.println("El numero tiene 2 cifras");
			} else {
				if (numero < 1000) {
					System.out.println("El numero tiene 3 cifras");
				} else {
					if (numero < 10000) {
						System.out.println("El numero tiene 4 cifras");
					}else {
						System.out.println("El numero introducido no esta dentro de el rango de valores indicado");
					}

				}
			}
		}
		teclado.close();
	}
}
