package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sumar los n�meros de 1 al n...

		Scanner teclado = new Scanner(System.in);

		long numero;
		long numAux = 0;

		System.out.println("�Hasta que N� quieres sumar?");
		numero = teclado.nextInt();

		for (long cont = 1; cont <= numero; cont++) {

			numAux = cont + numAux;
			System.out.println(cont + "=" + numAux);

		}
		teclado.close();
	}

}
