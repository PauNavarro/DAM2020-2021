package ejerciciosEntornos;

public class ContarParesEnImpares {

	public static void main(String[] args) {

		int numeros[] = new int[20];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (Math.random() * 100);

		}

		int nppi = ParesEnImpares(numeros);

		System.out.println();
		System.out.println("Hay un total de " + nppi + " numeros pares en posiciones impares");

	}

	public static int ParesEnImpares(int[] numeros) {

		int cntParesEnImpares = 0;

		for (int a = 1; a < numeros.length + 1; a++) {
			System.out.printf("%02d", a);
			System.out.print(" ");
		}

		System.out.println(" ");

		int i = 0;

		for (; i < numeros.length; i++) {

			int c = i + 1;

			System.out.printf("%02d", numeros[i]);
			System.out.print(" ");

			if (c % 2 != 0) {

				if (numeros[i] % 2 == 0) {

					cntParesEnImpares++;
				}
			}

		}
		return cntParesEnImpares;
	}
}