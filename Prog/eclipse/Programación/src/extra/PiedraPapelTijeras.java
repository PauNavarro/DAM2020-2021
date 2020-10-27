package extra;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int jugar = 1;
		String jugadaUsuario;
		int jugadaNum = 999;
		int jugadaPrograma;
		int vicProg = 0;
		int vicUsu = 0;
		int emp = 0;

		while (jugar == 1) {

			jugadaPrograma = (int) (Math.random() * 3);

			System.out.println("¿piedra, papel o tijeras?");
			jugadaUsuario = teclado.next();

			if (jugadaUsuario.equals("piedra")) {
				jugadaNum = 0;
			} else if (jugadaUsuario.equals("papel")) {
				jugadaNum = 1;
			} else if (jugadaUsuario.equals("tijeras")) {
				jugadaNum = 2;
			} else {
				System.out.println("Por favor, introduce un valor valido");
				jugar = 0;
			}

			if (jugadaPrograma == 0) {
				System.out.println("El programa juega piedra");
				if (jugadaNum == 0) {
					System.out.println("Empate");
					emp++;
				} else if (jugadaNum == 1) {
					System.out.println("Gana el usuario");
					vicUsu++;
				} else if (jugadaNum == 2) {
					System.out.println("Gana el programa");
					vicProg++;
				}
			} else if (jugadaPrograma == 1) {
				System.out.println("El programa juega papel");
				if (jugadaNum == 0) {
					System.out.println("Gana el programa");
					vicProg++;
				} else if (jugadaNum == 1) {
					System.out.println("Empate");
					emp++;
				} else if (jugadaNum == 2) {
					System.out.println("Gana el usuario");
					vicUsu++;
				}
			} else if (jugadaPrograma == 2) {
				System.out.println("El programa juega tijeras");
				if (jugadaNum == 0) {
					System.out.println("Gana el usuario");
					vicUsu++;
				} else if (jugadaNum == 1) {
					System.out.println("Gana el programa");
					vicProg++;
				} else if (jugadaNum == 2) {
					System.out.println("Empate");
					emp++;
				}
			}
			System.out.println("El resultado actual es:");
			System.out.println("Programa = " + vicProg);
			System.out.println("Usuario = " + vicUsu);
			System.out.println("Empates = " + emp);
			System.out.println("¿Quieres volver a jugar? (1 = si, 2 = no)");
			jugar = teclado.nextInt();
		}
		teclado.close();
	}
}