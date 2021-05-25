package ejerciciosCondicionales;

import java.util.Scanner;

public class ConversorMillasNaut {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);

		// 6.- Escribe un programa que lea un valor correspondiente a una distancia en
		// millas marinas y escriba la distancia en metros. Sabiendo que una milla
		// marina equivale a 1.852 metros

		double millas;
		double resultadoMetros;
		int millasAMetros = 1852;
		
		System.out.println("Dame las Millas Nauticas a convertir");
		millas = teclado.nextDouble();
		
		resultadoMetros = millas * millasAMetros ;
		
		System.out.println(millas + " Millas equivalen a " + resultadoMetros + "m");
		
		teclado.close();

	}

}
