package ejerciciosBucles;

public class SumaParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Eliminar el /* */ de uno de los tres bucles para que funcione.
		
		System.out.println("Este programa suma los numeros pares e impares del 100 al 200");

		int totalPar = 0;
		int totalImpar = 0;
		int contador = 100;

		for (contador = 100; contador <= 200; contador++) {

			if ((contador % 2) == 0) {
				totalPar = totalPar + contador;
			} else {
				totalImpar = totalImpar + contador;
			}

		}

/*
		while (contador <= 200) {
			if ((contador % 2) == 0) {
				totalPar = totalPar + contador;
				contador++;
			} else {
				totalImpar = totalImpar + contador;
				contador++;
			}

		}
*/
/*
		do {
			
			if ((contador % 2) == 0) {
				totalPar = totalPar + contador;
				contador++;
			} else {
				totalImpar = totalImpar + contador;
				contador++;
			}
			
		}while (contador <=200);
*/
		
		System.out.println("El total de los pares es : " + totalPar);
		System.out.println("El total de los impares es : " + totalImpar);

	}

}

