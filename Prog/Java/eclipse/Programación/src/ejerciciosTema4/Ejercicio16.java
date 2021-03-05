package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("1.- Calcular el area de un rectangulo");
			System.out.println("2.- Calcular el area de un triangulo");
			System.out.println("3.- Calcular el area de un circulo");
			System.out.println("4.- Calcular el area de un hexagono");
			System.out.println("Introduzca el 99 para salir");

			opcion = c.nextInt();

			switch (opcion) {
			case 1:

				int lado1;
				int lado2;

				System.out.println("Dame un lado");
				lado1 = c.nextInt();
				System.out.println("Dame el segundo lado");
				lado2 = c.nextInt();

				System.out.println("el area del rectangulo es " + areaRectangulo(lado1, lado2));

				break;

			case 2:

				int base;
				int altura;

				System.out.println("Dame la base");
				base = c.nextInt();
				System.out.println("Dame la altura");
				altura = c.nextInt();

				System.out.println("el area del triangulo es " + areaTriangulo(base, altura));

			case 3:

				int radio;

				System.out.println("Dame el radio");
				radio = c.nextInt();

				System.out.println("el area del circulo es " + areaCirculo(radio));

			case 4:

				double lado;
				double apotema;

				System.out.println("Dame el lado");
				lado = c.nextDouble();

				System.out.println("Dame el apotema");
				apotema = c.nextDouble();

				double perimetro = lado * 6;

				System.out.println("el area del circulo es " + areaHexagono(perimetro, apotema));

			case 99:
				break;

			default:
				System.out.println("Opcion incorrecta, intentalo de nuevo");
				break;
			}

		} while (opcion != 99);

		c.close();
	}

	private static double areaHexagono(double perimetro, double apotema) {

		double area;

		area = (perimetro * apotema) / 2;

		return area;
	}

	private static double areaCirculo(int radio) {

		double area;

		area = Math.PI * radio;

		return area;
	}

	private static int areaTriangulo(int base, int altura) {

		int area;

		area = (base * altura) / 2;

		return area;
	}

	private static int areaRectangulo(int lado1, int lado2) {

		int area;

		area = lado1 * lado2;

		return area;

	}

}
