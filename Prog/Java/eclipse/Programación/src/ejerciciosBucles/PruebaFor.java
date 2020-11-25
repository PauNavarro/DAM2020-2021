package ejerciciosBucles;

import java.util.Scanner;

public class PruebaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Cuantos numeros quieres mostrar");
		numero = teclado.nextInt();
		
		for (int contador = 1;contador <=numero; contador++) {
			System.out.println(contador);
		}
		teclado.close();
	}

}
