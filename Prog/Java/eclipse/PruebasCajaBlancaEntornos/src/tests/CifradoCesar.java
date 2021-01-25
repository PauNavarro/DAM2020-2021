package tests;

import java.text.Normalizer;
import java.util.Scanner;

public class CifradoCesar {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		
		String frase;
		int codigo;

		System.out.println("Dame una frase para cifrar");
		frase = c.nextLine();

		System.out.println("Dame el codigo de cifrado (desplazamiento)");
		codigo = c.nextInt();

		System.out.println("La frase cifrada es:");
		System.out.println(cifrado(frase, codigo));

	}

	private static String cifrado(String frase, int codigo) {

		String fraseCifrada = "";

		frase = normalizarfrase(frase.toLowerCase());

		String abecedario = "abcdefghijklmnñopqrstuvwxyz";

		for (int i = 0; i < frase.length(); i++) {

			{
				int posicion = abecedario.indexOf(frase.charAt(i));

				if (posicion >= 0) {

					fraseCifrada += abecedario.charAt((posicion + codigo) % abecedario.length());

				} else {

					fraseCifrada += frase.charAt(i);

				}
			}

		}

		return fraseCifrada;
	}

	private static String normalizarfrase(String frase) {
		
		frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
		frase = frase.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		
		return frase.replace(" ", "").replace(",", "").replace(".", "");
	}

}
