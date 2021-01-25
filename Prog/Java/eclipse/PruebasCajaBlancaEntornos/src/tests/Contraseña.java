package tests;

import java.util.Scanner;

public class Contrase�a {

	public static final int NO_ERROR = 0;
	public static final int ERROR_MAYUS = 1;
	public static final int ERROR_MINUS = 2;
	public static final int ERROR_SIMB = 3;
	public static final int ERROR_LONG = 4;
	public static final int ERROR_NUM = 5;

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		String contrase�a;

		do {

			System.out.println("Introduce una contrase�a");

			contrase�a = c.next();

			switch (esValida(contrase�a)) {

			case NO_ERROR:

				System.out.println("La contrase�a introducida es valida");

				break;

			case ERROR_MAYUS:

				System.out.println("A la contrase�a le falta una mayuscula");

				break;

			case ERROR_MINUS:

				System.out.println("A la contrase�a le falta una minuscula");

				break;

			case ERROR_SIMB:

				System.out.println("A la contrase�a le falta un caracter especial ( <>-_| !��?*+.@�#$%&()= {}[]^ )");

				break;

			case ERROR_LONG:

				System.out.println("La contrase�a es demasiado corta, la longitud minima son 8 caracteres");

				break;

			case ERROR_NUM:

				System.out.println("A la contrase�a le falta un numero");

				break;

			}
		} while (esValida(contrase�a) != 0);
	}

	private static int esValida(String contrase�a) {

		boolean longitud = true;
		boolean hayMayusculas = false;
		boolean hayMinusculas = false;
		boolean hayNumeros = false;
		boolean haySimbolos = false;

		int codigoDeError = 0;

		String especiales = "<>-_| !��?*+.@�#$%&()= {}[]^";

		if (contrase�a.length() < 8) {

			longitud = false;

		} else {

			for (int i = 0; i < contrase�a.length(); i++) {

				if (Character.isDigit(contrase�a.charAt(i))) {

					hayNumeros = true;

				}

				if (Character.isUpperCase(contrase�a.charAt(i))) {

					hayMayusculas = true;

				}

				if (especiales.contains(contrase�a.charAt(i) + "")) {

					haySimbolos = true;

				}

				if (Character.isLowerCase(contrase�a.charAt(i))) {

					hayMinusculas = true;

				}

			}

		}

		if (hayNumeros && hayMayusculas && hayMinusculas && haySimbolos && longitud) {
			codigoDeError = NO_ERROR;
		}

		if (!haySimbolos) {
			codigoDeError = ERROR_SIMB;
		}
		
		if (!hayNumeros) {
			codigoDeError = ERROR_NUM;
		}

		if (!hayMinusculas) {
			codigoDeError = ERROR_MINUS;
		}

		if (!hayMayusculas) {
			codigoDeError = ERROR_MAYUS;
		}
		
		if (!longitud) {
			codigoDeError = ERROR_LONG;
		}

		return codigoDeError;
	}
}
