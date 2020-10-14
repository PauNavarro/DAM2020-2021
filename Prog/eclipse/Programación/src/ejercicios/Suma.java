package ejercicios;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables

		int Numero1, Numero2, resultado;

		// Petición de valores

		System.out.println("Dame el primer numero");

		Numero1 = teclado.nextInt();

		System.out.println("Dame el Segundo numero");

		Numero2 = teclado.nextInt();

		// Calculo de la suma

		resultado = Numero1 + Numero2;
		System.out.println("El resultado de la suma es " + resultado);

		teclado.close();
	}

}
