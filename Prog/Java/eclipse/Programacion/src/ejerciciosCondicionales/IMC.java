package ejerciciosCondicionales;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declarar variables

		double peso;
		double altura;
		double talla;
		double resultado;

		// Pedir variables

		System.out.println("Dime tu peso");
		peso = teclado.nextDouble();

		System.out.println("Dime tu altura (En metros, por ejemplo 1.80)");
		altura = teclado.nextDouble();

		// Calcular la talla (altura ^ 2)

		talla = altura * altura;

		// Calcular el IMC

		resultado = peso / talla;

		// Imprimir el resultado en pantalla
		
		System.out.println("Tu IMC es de = " + resultado + ", siendo tu peso " + peso + ", y tu talla " + talla);
		teclado.close();
	}

}