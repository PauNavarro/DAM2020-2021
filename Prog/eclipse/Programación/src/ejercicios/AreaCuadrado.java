package ejercicios;

import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribe un programa que calcule y muestre el área de un cuadrado

		Scanner teclado = new Scanner(System.in);

		double lado;
		double area;

		System.out.println("Introduce el lado para calcular el area de el cuadrado");
		lado = teclado.nextDouble();

		area = lado * lado;
		
		System.out.println("El area de el cuadrado de lado " + lado + " es " + area);
		
		teclado.close();
	}

}
