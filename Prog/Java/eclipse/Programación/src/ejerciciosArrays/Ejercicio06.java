package ejerciciosArrays;

public class Ejercicio06 {

	/**
	 *
	 * Diseñar un programa en el que se guarden 10 números decimales generados de
	 * forma aleatoria.
	 * 
	 */

	public static void main(String[] args) {

		double aleatorios[] = new double[10];

		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = Math.random();
			System.out.print("El número aleatorio guardado en la posición v[" + i + "] = ");
			System.out.printf("%.3f %n" , aleatorios[i]);
		}

	}

}
