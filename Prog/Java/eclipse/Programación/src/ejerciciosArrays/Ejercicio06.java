package ejerciciosArrays;

public class Ejercicio06 {

	/**
	 *
	 * Dise�ar un programa en el que se guarden 10 n�meros decimales generados de
	 * forma aleatoria.
	 * 
	 */

	public static void main(String[] args) {

		double aleatorios[] = new double[10];

		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = Math.random();
			System.out.print("El n�mero aleatorio guardado en la posici�n v[" + i + "] = ");
			System.out.printf("%.3f %n" , aleatorios[i]);
		}

	}

}
