package ejercicio0;

import gente.Coche;

public class Principal {

	public static void main(String[] args) {

		Estudiante estudiante1 = new Estudiante("Juan", "1ºDAM", 12345);
		Coche vehiculo1 = new Coche("Renault", "Rojo", "Clio");
		
		double[] notas = new double[] {7,8.5,4,8,6,7.5,5};
		
		estudiante1.setEdad(20);
		estudiante1.setVehiculo(vehiculo1);
		estudiante1.setNotas(notas);
		
		// ------------------------------------------------------ //
		
		Profesor profesor1 = new Profesor("Feranando", "D104");
		Coche vehiculo2 = new Coche("Opel", "Blanco", "Corsa");
		
		profesor1.setEdad(45);
		profesor1.setVehiculo(vehiculo2);
		profesor1.setHorarioTutorias("Lunes de 10:00 a 13:00");
		
		// ------------------------------------------------------ //

		System.out.println(estudiante1);
		System.out.println(profesor1);
		
	}

}
