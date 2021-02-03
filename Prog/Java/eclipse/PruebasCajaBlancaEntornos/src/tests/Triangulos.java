package tests;

public class Triangulos {

	public static String ValidarTriangulo(int a, int b, int c) {

		String resultado = "";

		if (a <= 0 || b <= 0 || c <= 0) {

			resultado = "Triangulo inválido, lados negativos o nulos";

		} else {

			if (a > c + b || b > a + c || c > a + b) {

				resultado = "Triangulo inválido, no desigualdad triangular";

			} else {

				if (a == b && b == c) {

					resultado = "Triangulo equilatero";

				} else {

					if (a == b || b == c || c == a) {

						resultado = "Triangulo isosceles";

					} else {

						resultado = "Triangulo escaleno";

					}

				}

			}

		}

		return resultado;

	}

}
