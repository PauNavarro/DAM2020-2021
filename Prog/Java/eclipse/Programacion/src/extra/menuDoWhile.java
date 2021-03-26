package extra;

import java.util.Scanner;

public class menuDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion;
		int num1;
		int num2;
		int rdo, rdo2;

		do {

			System.out.println("Que quieres hacer:");
			System.out.println("(1) - suma");
			System.out.println("(2) - resta");
			System.out.println("(3) - multiplicar");
			System.out.println("(4) - dividir");
			System.out.println("(5) - invertir");
			System.out.println("(6) - salir");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Dame el primer numero ");
				num1 = teclado.nextInt();
				System.out.println("Dame el segundo numero");
				num2 = teclado.nextInt();

				rdo = num1 + num2;

				System.out.println("El resultado es : " + rdo);

				continue;

			case 2:
				System.out.println("Dame el primer numero ");
				num1 = teclado.nextInt();
				System.out.println("Dame el segundo numero");
				num2 = teclado.nextInt();

				rdo = num1 - num2;

				System.out.println("El resultado es : " + rdo);

				continue;

			case 3:
				System.out.println("Dame el primer numero ");
				num1 = teclado.nextInt();
				System.out.println("Dame el segundo numero");
				num2 = teclado.nextInt();

				rdo = num1 * num2;

				System.out.println("El resultado es : " + rdo);

				continue;

			case 4:
				System.out.println("Dame el primer numero ");
				num1 = teclado.nextInt();
				System.out.println("Dame el segundo numero");
				num2 = teclado.nextInt();

				rdo = num1 / num2;
				rdo2 = num1 % num2;

				System.out.println("El resultado es : " + rdo + " , el resto es : " + rdo2);

				continue;

			case 5:
				System.out.println("Dame el numero que deseas invertir ");
				num1 = teclado.nextInt();

				rdo = num1 * -1;

				System.out.println("El resultado es : " + rdo);

				continue;

			case 6:
				System.out.println("Adios");
				continue;

			default:
				System.out.println("La opcion introducida no es valida.");

			}

		} while (opcion != 6);
		
		teclado.close();
	}

}
