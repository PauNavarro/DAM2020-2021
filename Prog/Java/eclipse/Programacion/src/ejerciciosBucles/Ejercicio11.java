package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calcular el factorial de un n�mero n, siendo n!= 1*2*3*...*(n-1)*n

		Scanner teclado = new Scanner(System.in);

		int numero;
		int factorial = 1;

		System.out.println("Dame un numero para calcular su factorial");
		numero = teclado.nextInt();

		for (int cont = 1; cont <= numero; cont++) {

			factorial = (cont * factorial);

		}
		System.out.println(factorial);
		
		teclado.close();
	}

}
