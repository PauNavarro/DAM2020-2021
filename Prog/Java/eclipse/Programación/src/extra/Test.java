package extra;

import java.util.Scanner;
import extra.LibraryTest;

public class Test {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;
		int mostrarResultado = 0;

		boolean orbes = false;
		boolean emf = false;
		boolean bajo0 = false;
		boolean spiritBox = false;
		boolean escrituraFantasmal = false;
		boolean huellasDactilares = false;

		do {

			System.out.println("Que pruebas has recogido:");
			System.out.println("1) Orbes.");
			System.out.println("2) Emf 5");
			System.out.println("3) Temperatura bajo 0");
			System.out.println("4) Spirit Box");
			System.out.println("5) Escritura fantasmal");
			System.out.println("6) Huellas dactilares");
			System.out.println("7) Mostrar el resultado actual");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				orbes = LibraryTest.orbes();
				break;

			case 2:

				emf = LibraryTest.emf();
				break;

			case 3:

				bajo0 = LibraryTest.bajo0();
				break;

			case 7:

				mostrarResultado++;
			}
		} while (mostrarResultado == 0);

		if (orbes == true && emf == true && bajo0 == true) {
			System.out.println("Es un Ente");
		}

	}

}
