package ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se debe realizar un programa que dado un número introducido por el usuario,
		// muestre en pantalla la tabla de multiplicar.

		Scanner teclado = new Scanner(System.in);

		int numeroMultiplicar;
		int multiplos;
		int resultado = 0;
		int contador = 1;

		System.out.println("Que numero quieres multiplicar?");
		numeroMultiplicar = teclado.nextInt();

		System.out.println("Cuantos multiplos quieres mostrar");
		multiplos = teclado.nextInt();

		while (contador <= multiplos) {
			resultado = numeroMultiplicar * contador;
			System.out.println(numeroMultiplicar + " x " + contador + " = " + resultado);
			contador++;
		}

		teclado.close();
	}

}
