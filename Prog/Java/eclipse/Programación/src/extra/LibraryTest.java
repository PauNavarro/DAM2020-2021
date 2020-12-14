package extra;

import java.util.Scanner;

public class LibraryTest {

	public static boolean orbes() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		boolean orbes = false;
		String siNo;
		boolean respuestaValida = false;

		do {

			System.out.println("Tiene orbes?");
			siNo = teclado.next();

			if (siNo.equals("Si")) {

				orbes = true;
				respuestaValida = true;

			} else if (siNo.equals("No")) {

				orbes = false;
				respuestaValida = true;

			} else {

				System.out.println("El valor introducido no es valido, introduce Si o No");
				respuestaValida = false;

			}

		} while (respuestaValida == false);

		return orbes;
	}

	public static boolean emf() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		boolean emf = false;
		boolean respuestaValida = false;

		String siNo;

		do {

			System.out.println("Tiene EMF 5?");
			siNo = teclado.next();

			if (siNo.equals("Si")) {

				emf = true;
				respuestaValida = true;

			} else if (siNo.equals("No")) {

				emf = false;
				respuestaValida = true;

			} else {

				System.out.println("El valor introducido no es valido, introduce Si o No");
				respuestaValida = false;

			}

		} while (respuestaValida == false);

		return emf;
	}

	public static boolean bajo0() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		boolean bajo0 = false;
		boolean respuestaValida = false;
		String siNo;

		do {

			System.out.println("Tiene temperaturas bajo 0?");
			siNo = teclado.next();

			if (siNo.equals("Si")) {

				bajo0 = true;
				respuestaValida = true;

			} else if (siNo.equals("No")) {

				bajo0 = false;
				respuestaValida = true;

			} else {

				System.out.println("El valor introducido no es valido, introduce Si o No");
				respuestaValida = false;

			}

		} while (respuestaValida == false);

		return bajo0;
	}

	public static boolean spiritBox() {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		boolean spiritBox = false;
		String siNo;
		boolean respuestaValida = false;

		do {

			System.out.println("Tiene orbes?");
			siNo = teclado.next();

			if (siNo.equals("Si")) {

				spiritBox = true;
				respuestaValida = true;

			} else if (siNo.equals("No")) {

				spiritBox = false;
				respuestaValida = true;

			} else {

				System.out.println("El valor introducido no es valido, introduce Si o No");
				respuestaValida = false;

			}

		} while (respuestaValida == false);

		return spiritBox;
	}
}
