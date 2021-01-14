package ejerciciosMatrizes;

public class CuadradoMagico {

	public static void main(String[] args) {

		// Declarar Matrizes

		int[][] c = new int[][] { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		int[][] c2 = new int[][] { { 7, 14, 9 }, { 12, 10, 8 }, { 11, 6, 13 } };
		int[][] c3 = new int[][] { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };

		// Comprobar si la primera matriz contiene un cuadrado magico

		if (cuadradoMagico(c)) {
			System.out.println("Si que es un cuadrado magico");
		} else {
			System.out.println("No es un cuadrado magico");
		}

		// Imprimir la primera matriz

		imprimeCuadrado(c);

		// Comprobar si la segunda matriz contiene un cuadrado magico

		if (cuadradoMagico(c2)) {
			System.out.println("Si que es un cuadrado magico");
		} else {
			System.out.println("No es un cuadrado magico");
		}

		// Imprimir la segunda matriz

		imprimeCuadrado(c2);

		// Comprobar si la tercera matriz contiene un cuadrado magico

		if (cuadradoMagico(c3)) {
			System.out.println("Si que es un cuadrado magico");
		} else {
			System.out.println("No es un cuadrado magico");
		}

		// Imprimir la segunda matriz

		imprimeCuadrado(c3);

	}

	// Metodo para comprobar si es un cuadrado magico

	private static boolean cuadradoMagico(int[][] c) {

		boolean cuadradoMagico = false;
		boolean columnasMagicas = false;
		boolean filasMagicas = false;
		int sumActFilas = 0;
		int ultimoSumFilas = 0;
		int sumActColum = 0;
		int ultimoSumColum = 0;

		// Bucle que pasa y suma todas las filas

		for (int i = 0; i < c.length; i++) {

			sumActFilas = 0;

			for (int a = 0; a < c.length; a++) {

				sumActFilas = c[i][a] + sumActFilas;

			}

			if (ultimoSumFilas == 0 || sumActFilas == ultimoSumFilas) {

				ultimoSumFilas = sumActFilas;

				filasMagicas = true;

			} else {
				filasMagicas = false;
				cuadradoMagico = false;
				break;

			}
		}

		for (int i = 0; i < c.length; i++) {

			sumActColum = 0;

			for (int a = 0; a < c.length; a++) {

				sumActColum = c[a][i] + sumActColum;

			}

			if (ultimoSumColum == 0 || sumActColum == ultimoSumColum) {

				ultimoSumColum = sumActColum;

				columnasMagicas = true;

			} else {
				columnasMagicas = false;
				cuadradoMagico = false;
				break;

			}
		}

		if (filasMagicas && columnasMagicas) {
			cuadradoMagico = true;
		}

		return cuadradoMagico;
	}

	// Metodo para imprimir los cuadrados

	private static void imprimeCuadrado(int[][] c) {

		for (int i = 0; i < c.length; i++) {
			for (int a = 0; a < c.length; a++) {
				System.out.print("|");
				System.out.printf("%02d", c[i][a]);
			}
			System.out.print("|");
			System.out.println();
		}

	}
}