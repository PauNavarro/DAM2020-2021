package ejerciciosMatrizes;

public class TablasDeMultiplicar {

	public static void main(String[] args) {

		int[][] resultado = rellenarMatriz();

		imprimirMatriz(resultado);

	}

	private static void imprimirMatriz(int[][] resultado) {

		for (int i = 0; i < resultado.length; i++) {
			System.out.println();
			for (int j = 0; j < resultado.length; j++) {
				System.out.printf("%5d", resultado[i][j]);
			}
		}
		
	}

	public static int[][] rellenarMatriz() {

		int resultado[][] = new int[10][10];

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] = (i + 1) * (j + 1);
			}
		}

		return resultado;
	}

}
