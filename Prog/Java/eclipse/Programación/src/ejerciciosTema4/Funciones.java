package ejerciciosTema4;

import java.util.Scanner;

public class Funciones {

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

	public static int numeroMaximo() {

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

	public static void imprimePiramide() {

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

	public static void primo() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int numero;
		boolean noPrimo;

		System.out.println("Dame un numero para comprobar si es primo o no");

		numero = teclado.nextInt();

		noPrimo = false;

		for (int i = 2; i <= numero / 2; ++i) {

			if (numero % i == 0) {
				noPrimo = true;
				break;
			}
		}

		if (noPrimo) {
			System.out.println("El numero no es primo");
		} else {
			System.out.println("El numero es primo");
		}

		return;
	}

	public static int factorial() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int numero;
		int factorial = 1;

		System.out.println("Dame un numero para calcular su factorial");
		numero = teclado.nextInt();

		for (int cont = 1; cont <= numero; cont++) {

			factorial = (cont * factorial);

		}

		return factorial;
	}

	public static void sumarHastaN() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		long numero;
		long numAux = 0;

		System.out.println("¿Hasta que Nº quieres sumar?");
		numero = teclado.nextInt();

		for (long cont = 1; cont <= numero; cont++) {

			numAux = cont + numAux;
			System.out.println(cont + "=" + numAux);

		}
		return;
	}

	public static void sumatorio() {

		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los número
		// introducidos.

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int sumatorio = 0;
		int numeroIntr;

		do {
			System.out.println("Dame un numero (El numero 0 detendra el programa)");
			numeroIntr = teclado.nextInt();

			sumatorio = numeroIntr + sumatorio;

		} while (numeroIntr != 0);

		System.out.println("La suma de todos los numeros es : " + sumatorio);

		return;
	}

	public static void mostrarRangoNumeros() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Dame un numero");
		numero1 = teclado.nextInt();

		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();

		if (numero1 > numero2) {

			for (; numero2 <= numero1; numero2++) {

				System.out.print(numero2 + ", ");

			}

		}

		if (numero1 < numero2) {

			for (; numero1 <= numero2; numero1++) {

				System.out.print(numero1 + ", ");

			}

		}

		return;
	}

	public static double volumenCilindro() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		double radio, altura;

		System.out.println("Dame el radio (en cm)");
		radio = teclado.nextInt();

		System.out.println("Dame la altura (en cm)");
		altura = teclado.nextInt();

		return Math.PI * radio * altura;
	}

	public static double areaCilindro() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		double radio, altura;

		System.out.println("Dame el radio (en cm)");
		radio = teclado.nextInt();

		System.out.println("Dame la altura (en cm)");
		altura = teclado.nextInt();

		return 2 * Math.PI * radio * (radio + altura);

	}

	public static int sumaNumerosImpares() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int numero;
		int sumatorio = 0;
		int numeroImpar = 1;

		System.out.println("Calcular la suma de los N primeros numeros impares, introduce N");

		numero = teclado.nextInt();
		
		for (int i = 0; i < numero; i++) {

			sumatorio = numeroImpar + sumatorio;

			numeroImpar = numeroImpar + 2;
		}

		return sumatorio;
	}

	public static int rangoDeProductos() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int numeroInicio;
		int numeroFin;
		int sumatorio = 1;
		
		System.out.println("Dame el numero inicial");
		numeroInicio = teclado.nextInt();
		
		System.out.println("Dame el numero final");
		numeroFin = teclado.nextInt();
		
		for(int numeroActual = numeroInicio;numeroInicio <= numeroFin; numeroActual++) {
			
			numeroInicio++;
			
			sumatorio = numeroActual * sumatorio;
			
		}
		
		return sumatorio;
	}
}