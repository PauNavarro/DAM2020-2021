package boletinT3;

import java.util.Scanner;

public class N3B12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
		 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
		 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
		 * es mayor, menor o igual al número que ha pensado).
		 */

		Scanner teclado = new Scanner(System.in);

		int random1 = 50;
		boolean parar = false;

		System.out.println("Que numero estas pensando");
		int numUsu = teclado.nextInt();

		do {

			if (numUsu > random1) {
				System.out.println("Tu numero es mayor que " + random1);
				random1 = (int) (Math.random() * (100 - random1) + random1);
			} else if (numUsu < random1) {
				System.out.println("Tu numero es menor que " + random1);
				random1 = (int) (Math.random() * (random1 - 1) + 1);
			} else if (numUsu == random1) {
				System.out.println("El numero en el que has pensado es : " + random1);
				parar = true;
			}

			/*
			 * String mameig = teclado.next(); // mameig = Mayor Menor Igual
			 * 
			 * switch (mameig) { case "mayor": random1 = (int) (Math.random() * (100 -
			 * random1) + random1); continue;
			 * 
			 * case "menor": random1 = (int) (Math.random() * random1); continue;
			 * 
			 * case "igual": parar = true;
			 * System.out.println("El numero en el que pensabas era: " + random1); continue;
			 * }
			 */
		} while (parar != true);
		teclado.close();
	}

}
