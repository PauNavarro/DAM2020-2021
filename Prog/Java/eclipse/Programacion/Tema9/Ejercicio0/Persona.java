package Ejercicio0;
import gente.Coche;

public class Persona {

	private String nombre;
	private int edad;
	private Coche vehiculo;
	
	public Persona(String nombre) {

		this.edad = 0;
		this.nombre = nombre;
		this.vehiculo = null;

	}

	public Coche getVehiculo() {
	
		return vehiculo;
	
	}

	public void setVehiculo(Coche vehiculo1) {
	
		this.vehiculo = vehiculo1;
	
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return nombre;

	}

	public int getEdad() {

		return edad;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

}

