package boletinT3;

public class N2B9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa que calcule y escriba la suma y el producto de los 10
		 * primeros números naturales.
		 */

		int rdoSuma = 0, rdoMult = 0;

		for (int cont = 1; cont <= 10; cont++) {

			rdoSuma = cont + cont;
			rdoMult = cont * cont;
			
			System.out.println(
					"La suma de " + cont + " + " + cont + " = " + rdoSuma + " y la multiplicacion = " + rdoMult);
		}

	}

}
