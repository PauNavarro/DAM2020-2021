package ejerciciosCondicionales;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se debe realizar un programa que dado un número introducido por el usuario,
		// muestre en pantalla la tabla de multiplicar.

		// Declarar entrada de teclado y variables

		Scanner teclado = new Scanner(System.in);

		int numeroMultiplicar;
		int multiplos;
		int resultado = 0;
		int contador = 1;

		// Pedir al usuario el numero a multiplicar y hasta donde multiplicarlo

		System.out.println("Que numero quieres multiplicar?");
		numeroMultiplicar = teclado.nextInt();

		System.out.println("Cuantos multiplos quieres mostrar");
		multiplos = teclado.nextInt();

		// Realizar el calculo

		while (contador <= multiplos) {
			resultado = numeroMultiplicar * contador;
			System.out.println(numeroMultiplicar + " x " + contador + " = " + resultado);
			contador++;
		}

		teclado.close();
	}

}
