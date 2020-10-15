package ejercicios;

import java.util.Scanner;

public class CalculoCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa que toma como dato de entrada un número que corresponde a
		// la longitud de un radio y nos escribe la longitud de la circunferencia, el
		// área del círculo y el volumen de la esfera que corresponden con dicho radio.

		Scanner teclado = new Scanner(System.in);

		double radio;
		double longitud;
		double area;
		double volumen;

		System.out.println("Dame el radio para iniciar los calculos");
		radio = teclado.nextDouble();

		// Calcular la longitud

		longitud = Math.PI * radio;

		// Calcular el area

		area = Math.PI * Math.pow(radio, 2);

		// Calcular volumen de la esfera

		volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);

		// Imprimir resultados

		System.out.println("Dado un circulo de radio " + radio + " su longitud seria " + longitud + " , su area " + area
				+ " y el volumen de su esfera seria " + volumen);

		teclado.close();
	}

}
