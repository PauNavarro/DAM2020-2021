package ejerciciosMatrizes;

public class CuadradoMagico {

	public static void main(String[] args) {

		// Declarar Matrizes

		int[][] c1 = new int[][] { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }; // si
		int[][] c2 = new int[][] { { 7, 14, 9 }, { 12, 10, 8 }, { 11, 6, 13 } }; // si
		int[][] c3 = new int[][] { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } }; // si
		int[][] c4 = new int[][] { { 10, 10, 10, 11 }, { 10, 10, 10, 11 }, { 25, 25, 25, 25 }, { 11, 0, 0, 0 } }; //no

		// Comprobar si la primera matriz contiene un cuadrado magico

		System.out.println(cuadradoMagico(c1) ? "Si que es un cuadrado magico" : "No es un cuadrado magico");

		// Imprimir la primera matriz

		imprimeCuadrado(c1);

		// Comprobar si la segunda matriz contiene un cuadrado magico

		System.out.println(cuadradoMagico(c2) ? "Si que es un cuadrado magico" : "No es un cuadrado magico");

		// Imprimir la segunda matriz

		imprimeCuadrado(c2);

		// Comprobar si la tercera matriz contiene un cuadrado magico

		System.out.println(cuadradoMagico(c3) ? "Si que es un cuadrado magico" : "No es un cuadrado magico");

		// Imprimir la tercera matriz

		imprimeCuadrado(c3);

		// Comprobar si la cuarta matriz contiene un cuadrado magico

		System.out.println(cuadradoMagico(c4) ? "Si que es un cuadrado magico" : "No es un cuadrado magico");

		// Imprimir la cuarta matriz

		imprimeCuadrado(c4);

	}

	// Metodo para comprobar si es un cuadrado magico

	private static boolean cuadradoMagico(int[][] c) {

		boolean cuadradoMagico = false;
		boolean columnasMagicas = false;
		boolean filasMagicas = false;
		boolean diagonalesMagicas = false;
		int sumActFilas = 0;
		int sumDiagonal1 = 0;
		int sumDiagonal2 = 0;
		int ultimoSumFilas = 0;
		int sumActColum = 0;
		int ultimoSumColum = 0;

		// Bucle que suma todas las filas y comprueba que sus

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

		for (int i = 0; i < c.length; i++) {
			sumDiagonal1 = c[i][i] + sumDiagonal1;
		}
		for (int a = c.length - 1; a >= 0; a--) {
			sumDiagonal2 = c[a][a] + sumDiagonal2;
		}

		if (sumDiagonal1 == sumDiagonal2)
			diagonalesMagicas = true;

		if (filasMagicas && columnasMagicas && diagonalesMagicas) {
			cuadradoMagico = true;
		}

		return cuadradoMagico;
	}

	// Metodo para imprimir los cuadrados

	private static void imprimeCuadrado(int[][] c) {

		for (int i = 0; i < c.length; i++) {
			for (int a = 0; a < c.length; a++) {
				System.out.printf("|%02d", c[i][a]);
			}
			System.out.print("|");
			System.out.println();
		}

	}
}