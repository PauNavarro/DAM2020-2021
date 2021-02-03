package tema6POO;

public class Persona {

	private String nombre;
	private int edad;

	public Persona(String nombreIntr) {

		this.edad = 0;
		this.nombre = nombreIntr;

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
