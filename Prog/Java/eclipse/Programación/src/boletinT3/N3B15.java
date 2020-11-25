package boletinT3;

import java.util.Scanner;

public class N3B15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		 */

		// Variables

		Scanner teclado = new Scanner(System.in);

		int numEntradas;
		int salario = 0;
		int salarioMax = 0;

		// Codigo

		System.out.println("¿Cuantos sueldos quieres introducir?");
		numEntradas = teclado.nextInt();

		if (numEntradas <= 0) {
			
			System.out.println("El numero introducido no es valido, introduce un valor superior a 0");
		
		} else {

			do {

				System.out.println("Dame el salario para comparar");
				salario = teclado.nextInt();

				if (salario > salarioMax) {

					salarioMax = salario;
					salario = salarioMax;

				}

				numEntradas--;
			
			} while (numEntradas != 0);
		
			System.out.println("El salario maximo es de : " + salarioMax + "€");
		
		}

		teclado.close();
	}

}
