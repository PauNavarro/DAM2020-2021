package boletinT3;

import java.util.Scanner;

public class N3B14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
		 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
		 * más de 1.75.
		 */

		// Variables

		Scanner teclado = new Scanner(System.in);

		int cont;
	
		int contAdultos = 0;
		int contAltos = 0;
		
		int edad = 0;
		int edadLast = 0;	
		double altura = 0;
		double alturaLast = 0;

		// Codigo

		for (cont = 1; cont <= 5; cont++) {

			System.out.println("Dame la altura del alumno " + cont);
			alturaLast = teclado.nextDouble();

					if (alturaLast > 1.75)
						contAltos++;
			
			altura = alturaLast + altura;
			
			System.out.println("Dame la edad del alumno " + cont);
			edadLast = teclado.nextInt();
				
					if (edadLast >= 18)
						contAdultos++;
					
			edad = edadLast + edad;
		}
		cont--;

		altura = altura / cont;
		edad = edad / cont;

		System.out.println("La altura media para los " + cont + " alumnos es de " + altura + " metros");
		System.out.println("La edad media para los " + cont + " alumnos es de " + edad + " años");
		System.out.println("Entre los " + cont + " alumnos, " + contAltos + " miden mas de 1.75m");
		System.out.println("Entre los " + cont + " alumnos, " + contAdultos + " son mayores de edad");


		teclado.close();
	}

}
