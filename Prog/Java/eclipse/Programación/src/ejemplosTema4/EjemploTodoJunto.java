package ejemplosTema4;

import java.util.Scanner;

public class EjemploTodoJunto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;

		do {
			
			System.out.println("|===============================================|");
			System.out.println("| 1) Sumar dos numeros                		|");
			System.out.println("| 2) Restar dos numeros               		|");
			System.out.println("| 3) Multiplicar dos numeros          		|");
			System.out.println("| 4) Dividir dos numeros              		|");
			System.out.println("| 5) Sacar el maximo entre dos numeros		|");
			System.out.println("| 6) Imprimir una piramide			|");
			System.out.println("| 0) Cerrar el programa             		|");
			System.out.println("|===============================================|");
			
			opcion = teclado.nextInt();

		switch (opcion) {

			case 0:
				break;
			
			case 1:
				System.out.println(suma());
				break;

			case 2:
				System.out.println(resta());
				break;

			case 3:
				System.out.println(multiplicar());
				break;

			case 4:
				System.out.println(dividir());
				break;

			case 5:
				System.out.println(maximo());
				break;

			case 6:
				piramide();
				break;

			default:
				System.out.println("La opcion introducida no es valida, introduce una opcion valida");
			}

		} while (opcion != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

	public static int suma() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int rdo;
		int n1;
		int n2;

		System.out.println("Dame un numero");
		n1 = teclado.nextInt();

		System.out.println("Dame otro numero");
		n2 = teclado.nextInt();

		rdo = n1 + n2;

		return rdo;
	}

	public static int resta() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int rdo;
		int n1;
		int n2;

		System.out.println("Dame un numero");
		n1 = teclado.nextInt();

		System.out.println("Dame otro numero");
		n2 = teclado.nextInt();

		rdo = n1 - n2;

		return rdo;
	}

	public static int multiplicar() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int rdo;
		int n1;
		int n2;

		System.out.println("Dame el primer numero");
		n1 = teclado.nextInt();

		System.out.println("Dame el segundo numero");
		n2 = teclado.nextInt();

		rdo = n1 * n2;

		return rdo;
	}

	public static int dividir() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int rdo;
		int n1;
		int n2;

		System.out.println("Dame el primer numero");
		n1 = teclado.nextInt();

		System.out.println("Dame el segundo numero");
		n2 = teclado.nextInt();

		rdo = n1 / n2;

		return rdo;

	}

	public static int maximo() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("Dame dos numeros enteros para que te devuelva el numero mayor.");

		System.out.println("Dame el 1er numero");
		num1 = teclado.nextInt();

		System.out.println("Dame el 2º numero");
		num2 = teclado.nextInt();

		if (num1 > num2) {

			return num1;

		} else {

			return num2;

		}
	}

	public static void piramide() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int alturaPiramide;
		int cont;
		int hueco;
		int asterisco;

		System.out.println("Dame la altura de la piramide");

		alturaPiramide = teclado.nextInt();

		for (cont = 1; cont <= alturaPiramide; cont++) {

			// Huecos en blanco

			for (hueco = 1; hueco <= alturaPiramide - cont; hueco++) {

				System.out.print(" ");

			}

			// Asteriscos

			for (asterisco = 1; asterisco <= (cont * 2) - 1; asterisco++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}