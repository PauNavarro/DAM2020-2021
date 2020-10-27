package ejerciciosCondicionales;

import java.util.Scanner;

public class OperadorDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// 25.- Pedir dos números enteros y un operador: +,-,*,/ y realizar y mostrar la
		// operación que corresponda con esos dos operadores.

		int numero1;
		int numero2;
		int resultado;
		double resultado2;
		String operador = "afasdfa";

		System.out.println("Dame los dos numeros que quieras introducir");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();

		System.out.println("Que operación deseas realizar?");
		operador = teclado.next();

		while (operador == "afasdfa") {
			operador = teclado.next();
		}
		switch (operador) {

		case "+":

			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;
		case "sumar":

			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;

		case "-":

			resultado = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;
		case "restar":

			resultado = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;

		case "/":

			resultado = numero1 / numero2;
			resultado2 = numero1 % numero2;
			System.out.println(numero1 + " / " + numero2);
			System.out.println("El resultado es : " + resultado + " , y el resto de la division es " + resultado2);

			break;
		case "dividir":

			resultado = numero1 / numero2;
			resultado2 = numero1 % numero2;
			System.out.println(numero1 + " / " + numero2);
			System.out.println("El resultado es : " + resultado + " , y el resto de la division es " + resultado2);

			break;

		case "*":

			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;

		case "x":

			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;
		case "multiplicar":

			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2);
			System.out.println("El resultado es : " + resultado);

			break;

		default:
			System.out.println(
					"Por favor introduce un operador valido (+ o sumar, - o restar, * o x o multiplicar, / o dividir)");
		}

		teclado.close();
	}

}
