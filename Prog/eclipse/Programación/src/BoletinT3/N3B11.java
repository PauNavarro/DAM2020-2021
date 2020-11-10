package boletinT3;

import java.util.Scanner;

public class N3B11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso
		 * del operador de potencia (^), siendo A y B valores introducidos por teclado,
		 * y luego muestre el resultado por pantalla
		 */

		Scanner teclado = new Scanner(System.in);

		int num1, num2;
		double rdo = 0;

		System.out.println("Dame el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo numero");
		num2 = teclado.nextInt();
		
		 rdo = Math.pow(num1, num2);
		
		System.out.println(rdo);
		teclado.close();
	}

}
