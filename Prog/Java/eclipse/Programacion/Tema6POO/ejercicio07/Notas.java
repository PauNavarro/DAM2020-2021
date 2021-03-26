package ejercicio07;

import java.util.Scanner;

public class Notas {

	private double[] notas;

	public double getNotas(int i) {
		return notas[i];
	}

	public Notas() {

		notas = new double[5];

	}

	public void leer() {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Dame 5 notas");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(i+1+".-");
			notas[i] = c.nextDouble();
		}
		c.close();
	}
	
	public double media() {
		
		double media;
		double sumatorio = 0;
		
		
		for (int i = 0; i < notas.length; i++) {
			
			sumatorio = notas[i] + sumatorio;
			
		}
		
		media = sumatorio / notas.length;
		
		return media;
	}

	public void mostrar() {
		
		int a = 1;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota de la asignatura " + a + " : " + notas[i]);
			a++;
		}
		
	}
	
}
