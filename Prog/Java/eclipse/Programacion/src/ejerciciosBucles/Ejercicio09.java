package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir valores y que se muestre sin son pares o no, hasta que se introduzca un
		// 0...

		Scanner teclado = new Scanner(System.in);

		int numero;
		int cont;
		String parar;

		do {

			System.out.println("Dame un numero, recuerda, si introduces el 0, el programa se detendra");
			numero = teclado.nextInt();
			cont = numero;
			if (numero < 0) {
				System.out.println("El numero introducido no es valido, por favor, introduce un valor superior a 0");
				cont = 1;
			} else {
				if ((numero % 2) == 0) {
					if (numero == 0) {
						System.out.println("Has introducido el numero " + numero
								+ " el programa se va a detener, estas seguro (y/n)");
						parar = teclado.next();
						if (parar.equals("y")) {
							System.out.println("Adios");
							continue;
						} else {
							cont = 1;
						}
					}
					System.out.println("El numero introducido es par = " + numero);
				} else {
					System.out.println("El numero introducido es impar = " + numero);
				}

			}

		} while (cont > 0);

		teclado.close();

	}

}