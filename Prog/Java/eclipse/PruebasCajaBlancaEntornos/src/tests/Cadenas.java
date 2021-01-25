package tests;

import java.text.Normalizer;
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		String palabraAInvertir;
		String esPalabraPalindroma;
		String fraseAComprobar;

		System.out.println("Dame una palabra para invertir");
		palabraAInvertir = c.next();

		System.out.println(invertirPalabra(palabraAInvertir));

		System.out.println("Dame una palabra");
		esPalabraPalindroma = c.next();

		System.out.println(esPalindromo(esPalabraPalindroma) ? "Si que es una palabra palindroma"
				: "No es una palabra palindroma");

		c.nextLine();

		System.out.println("Dame una frase");
		fraseAComprobar = c.nextLine();

		System.out.println(
				esFrasePalindroma(fraseAComprobar) ? "Si que es una frase palindroma" : "No es una frase palindroma");

	}

	private static String invertirPalabra(String palabraAInvertir) {

		String palabraInvertida = "";

		for (int i = palabraAInvertir.length() - 1; i >= 0; i--) {

			palabraInvertida += palabraAInvertir.charAt(i);

		}

		return palabraInvertida.toLowerCase();
	}

	private static boolean esPalindromo(String esPalabraPalindroma) {

		boolean esPalindromo = false;

		String palabraInvertida = "";

		palabraInvertida = invertirPalabra(esPalabraPalindroma);

		if (palabraInvertida.toLowerCase().equals(esPalabraPalindroma.toLowerCase())) {

			esPalindromo = true;

		}

		return esPalindromo;
	}

	private static boolean esFrasePalindroma(String fraseAComprobar) {

		boolean esPalindroma = false;

		String fraseInicial = eliminarAcentos(fraseAComprobar.replace(" ", "").toLowerCase());

		String fraseInvertida = "";

		fraseInvertida = invertirPalabra(fraseInicial);

		if (fraseInvertida.equals(fraseInicial)) {

			esPalindroma = true;

		}

		return esPalindroma;

	}

	public static String eliminarAcentos(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD);
		s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return s;
	}

}
