package ejerciciosBucles;

import java.util.Scanner;

public class PruebaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int contador = 0;
		int numero;

		System.out.println("Cuantos numero quieres imprimir");
		numero = teclado.nextInt();

		while (contador < numero) {
			contador++;
			System.out.println(contador);

		}
		teclado.close();
	}

}