package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio05 {

	/**
	 * 
	 * Dissenyar un programa en el que se guarden los datos de 10 empleados. Para
	 * ello, se guardará en un array llamado nombres los nombres de estos diez
	 * empleados y en un array llamado sueldos en el que se guarden los sueldos de
	 * estos empleados. Los datos se deben pedir por teclado para que sean
	 * introducidos por el usuario. Una vez introducidos los datos de los empleados,
	 * se debe imprimir por pantalla los datos del empleado con el sueldo más alto
	 *
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String empleados[] = new String[10];
		int salario[] = new int[10];

		for (int i = 0; i < empleados.length; i++) {

			System.out.println("¿Nombre del empleado?");

			empleados[i] = teclado.next();

			System.out.println("¿Salario del empleado?");

			salario[i] = teclado.nextInt();
		}

		salarioAlto(empleados, salario);

		teclado.close();
	}

	private static void salarioAlto(String[] empleados, int[] salario) {

		String nombre = empleados[0];
		int salarioMasAlto = salario[0];

		for (int i = 0; i < salario.length; i++) {

			if (salario[i] > salarioMasAlto) {

				salarioMasAlto = salario[i];

				nombre = empleados[i];

			}

		}

		System.out.println("El empleado con el salario mas alto es:");
		System.out.println(nombre + " con un salario de " + salarioMasAlto + "€");

	}
}
