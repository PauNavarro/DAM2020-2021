package ejerciciosCondicionales;

import java.util.Scanner;

public class PideFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// 23.- Escribir un programa que pida al usuario el d�a, el mes y el a�o correcta y
		// mostrar la fecha del d�a siguiente. Suponer que todos los meses tienen 30
		// d�as...

		int dia;
		int mes;
		int a�o;
		int diaFinal;

		System.out.println("Dame el dia");
		dia = teclado.nextInt();

		System.out.println("Dame el mes(Numerico)");
		mes = teclado.nextInt();

		System.out.println("Dame el a�o");
		a�o = teclado.nextInt();

		System.out.println("La fecha introducida es :" + dia + "-" + mes + "-" + a�o + ".");

		switch (mes) {

		case 1:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
		
		case 2:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 3:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 4:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 5:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 6:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 7:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 8:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 9:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 10:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 11:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		case 12:
			diaFinal = dia + 1;
			if (diaFinal >= 31) {
				mes = mes + 1;
				diaFinal = 1;
			}
			System.out.println("El dia siguiente sera :" + diaFinal + "-" + mes + "-" + a�o + ".");
			break;
			
		default: System.out.println("La fecha introducida no es valida");
			
		}

		teclado.close();
	}

}
