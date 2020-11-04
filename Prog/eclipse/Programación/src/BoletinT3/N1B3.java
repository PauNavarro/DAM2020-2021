package BoletinT3;

public class N1B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
		 * el 200. Esta vez utiliza un contador sumando de 1 en 1
		 */

		for (int cont = 1; cont <= 200; cont++) {

			if (cont % 2 == 0) {
				System.out.println(cont);
			}
		}
	}
}