package ejercicios;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String usuario;
		String piedra = "piedra";
		String papel = "papel";
		String tijeras = "tijeras";
		int usuarioNum = 0;
		int random = (int) (Math.random() * 3);

		System.out.println("�piedra , papel o tijeras?");
		usuario = teclado.nextLine();

		if (usuario.equals(piedra)) {
			System.out.println("Has elegido piedra");
			usuarioNum = usuarioNum + 1;
			switch (usuarioNum) {

			case 1:
				if (random == 0) {
					System.out.println("Piedra / Piedra");
					System.out.println("Empate");
				}
				if (random == 1) {
					System.out.println("Piedra / Papel");
					System.out.println("Gana el programa");
				}
				if (random == 2) {
					System.out.println("Piedra / Tijeras");
					System.out.println("Gana el usuario");
				}
				break;
			}
		} else {
			if (usuario.equals(papel)) {
				System.out.println("Has elegido papel");
				usuarioNum = usuarioNum + 2;

				switch (usuarioNum) {

				case 2:
					if (random == 0) {
						System.out.println("Papel / Piedra");
						System.out.println("Gana el usuario");
					}
					if (random == 1) {
						System.out.println("Papel / Papel");
						System.out.println("Empate");
					}
					if (random == 2) {
						System.out.println("Papel / Tijeras");
						System.out.println("Gana el programa");
					}
					break;

				}
			} else {
				if (usuario.equals(tijeras)) {
					System.out.println("Has elegido tijeras");
					usuarioNum = usuarioNum + 3;

					switch (usuarioNum) {

					case 3:
						if (random == 0) {
							System.out.println("Tijeras / Piedra");
							System.out.println("Gana el programa");
						}
						if (random == 1) {
							System.out.println("Tijeras / Papel");
							System.out.println("Gana el usuario");
						}
						if (random == 2) {
							System.out.println("Tijeras / Tijeras");
							System.out.println("Empate");
						}
						break;
					}
				} else {
					System.out.println("El valor introducido no es valido, por favor, introduce piedra, "
							+ "papel o tijeras con todas las letras en minusculas");
				}
			}
		}
		teclado.close();
	}
}
