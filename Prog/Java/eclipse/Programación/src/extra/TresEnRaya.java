package extra;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int lineaUsu;
		int columnaPrg = 0;
		int columnaUsu;
		String fin = "no";
		String fila1 = " ", fila2 = " ", fila3 = " ", fila4 = " ", fila5 = " ", fila6 = " ", fila7 = " ", fila8 = " ",
				fila9 = " ";
		int jugadaPrg = 0;

		while (fin.equals("no")) {

			System.out.println("En que linea quieres poner tu ficha (O):1, 2 o 3");
			columnaUsu = teclado.nextInt();

			if (columnaUsu == 1) {

				System.out.println("En que columna quieres poner tu ficha (O):1, 2 o 3");
				lineaUsu = teclado.nextInt();

				switch (lineaUsu) {

				case 1:

					if (fila1.equals(" ")) {
						fila1 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 2:

					if (fila2.equals(" ")) {
						fila2 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 3:

					if (fila3.equals(" ")) {
						fila3 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				}
			}

			if (columnaUsu == 2) {
				System.out.println("En que linea quieres poner tu ficha (O):1, 2 o 3");
				lineaUsu = teclado.nextInt();

				switch (lineaUsu) {

				case 1:
					if (fila4.equals(" ")) {
						fila4 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 2:
					if (fila5.equals(" ")) {
						fila5 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 3:
					if (fila6.equals(" ")) {
						fila6 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				}
			}

			if (columnaUsu == 3) {
				System.out.println("En que linea quieres poner tu ficha (O):1, 2 o 3");
				lineaUsu = teclado.nextInt();

				switch (lineaUsu) {

				case 1:
					if (fila7.equals(" ")) {
						fila7 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 2:
					if (fila8.equals(" ")) {
						fila8 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				case 3:
					if (fila9.equals(" ")) {
						fila9 = "O";
					} else {
						System.out.println("Movimiento invalido, vuelve a intentarlo.");
						System.out.println("En que Columna quieres poner tu ficha (O):1, 2 o 3");
						columnaUsu = teclado.nextInt();
						System.out.println("En que Linea quieres poner tu ficha (O):1, 2 o 3");
						lineaUsu = teclado.nextInt();
						continue;
					}
					break;
				}
			}

			while (jugadaPrg == 0) {

				if (columnaPrg == 0) {

					if (fila1.equals(" ")) {
						fila1 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila2.equals(" ")) {
						fila2 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila3.equals(" ")) {
						fila3 = "X";
						jugadaPrg = 1;
						break;
					} else if (fila4.equals(" ")) {
						fila4 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila5.equals(" ")) {
						fila5 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila6.equals(" ")) {
						fila6 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila7.equals(" ")) {
						fila7 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila8.equals(" ")) {
						fila8 = "X";
						jugadaPrg = 1;
						continue;
					} else if (fila9.equals(" ")) {
						fila9 = "X";
						jugadaPrg = 1;
						continue;
					}
				}
			}

			if ((fila1 + fila2 + fila3).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila1 + fila5 + fila9).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila1 + fila4 + fila7).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila4 + fila5 + fila6).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila7 + fila8 + fila9).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila3 + fila6 + fila9).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila7 + fila5 + fila3).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila2 + fila5 + fila8).equals("OOO")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}

			if ((fila1 + fila2 + fila3).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila1 + fila5 + fila9).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila1 + fila4 + fila7).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila4 + fila5 + fila6).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila7 + fila8 + fila9).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila3 + fila6 + fila9).equals("XXX")) {
				System.out.println("Gana el Programa");
				fin = "si";
			}
			if ((fila7 + fila5 + fila3).equals("XXX")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}
			if ((fila2 + fila5 + fila8).equals("XXX")) {
				System.out.println("Gana el usuario");
				fin = "si";
			}

			
			
			jugadaPrg = 0;

			System.out.println(fila1 + " | " + fila2 + " | " + fila3);
			System.out.println(fila4 + " | " + fila5 + " | " + fila6);
			System.out.println(fila7 + " | " + fila8 + " | " + fila9);
		}
		teclado.close();
	}
}
