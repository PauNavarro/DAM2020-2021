package persona;

import gente.*;

public class Principal {

	public static void main(String[] args) {
 
		String nombre1 = "pepe";
		String nombre2 = "Luis";
		String nombre3 = "Maria";

		Persona persona1 = new Persona(nombre1);
		Persona persona2 = new Persona(nombre2);
		Persona persona3 = new Persona(nombre3);

		persona1.setEdad(10);
		persona2.setEdad(25);
		persona3.setEdad(20);

		System.out.println(
				"La persona1 se llama: " + persona1.getNombre() + " y tiene : " + persona1.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona2.getNombre() + " y tiene : " + persona2.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona3.getNombre() + " y tiene : " + persona3.getEdad() + " años");

		// ------------------------------------------------------- //

		System.out.println();
		System.out.println();

		// ------------------------------------------------------- //
		
		persona2.setEdad(persona2.getEdad() + persona3.getEdad() - persona1.getEdad());

		System.out.println(
				"La persona1 se llama: " + persona1.getNombre() + " y tiene : " + persona1.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona2.getNombre() + " y tiene : " + persona2.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona3.getNombre() + " y tiene : " + persona3.getEdad() + " años");
		
		// ------------------------------------------------------- //
		
		System.out.println();
		System.out.println();
		
		// ------------------------------------------------------- //

		Coche vehiculo1 = new Coche("Renault", "Rojo", "Clio");
		Coche vehiculo2 = new Coche("Ford", "Azul", "Fiesta");

		persona1.setVehiculo(vehiculo1);
		persona2.setVehiculo(vehiculo1);
		persona3.setVehiculo(vehiculo2);

		System.out.println("Pepe tiene un  : " + persona1.getVehiculo().getMarca() + " "
				+ persona1.getVehiculo().getModelo() + " " + persona1.getVehiculo().getColor());
		System.out.println("Luis tiene un  : " + persona2.getVehiculo().getMarca() + " "
				+ persona2.getVehiculo().getModelo() + " " + persona2.getVehiculo().getColor());
		System.out.println("Maria tiene un : " + persona3.getVehiculo().getMarca() + " "
				+ persona3.getVehiculo().getModelo() + " " + persona3.getVehiculo().getColor());

	}

}
