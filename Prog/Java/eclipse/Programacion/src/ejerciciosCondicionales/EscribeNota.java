package ejerciciosCondicionales;

import java.util.Scanner;

public class EscribeNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// 16.- Escribe un programa que lea una calificaci�n num�rica entre 0 y 10 y la
		// transforma en calificaci�n alfab�tica, escribiendo el resultado.
		
		int nota;
		String notaTexto;
	
		System.out.println("Dime la calificaci�n num�rica");
		nota = teclado.nextInt();
		
		switch(nota) {
		
		case 1 : notaTexto = "Muy deficiente";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 2 : notaTexto = "Muy deficiente";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 3 : notaTexto = "Insuficiente";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 4 : notaTexto = "Insuficiente";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 5 : notaTexto = "Bien";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 6 : notaTexto = "Bien";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 7 : notaTexto = "Notable";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 8 : notaTexto = "Notable";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 9 : notaTexto = "Sobresaliente";
		System.out.println("La nota es " + notaTexto);
		break;
		
		case 10 : notaTexto = "Sobresaliente";
		System.out.println("La nota es " + notaTexto);
		break;
		}
		teclado.close();
	}

}