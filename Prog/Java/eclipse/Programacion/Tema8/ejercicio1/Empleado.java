package ejercicio1;

public class Empleado {

	private String nombre;
	private String dni;
	private int edad;
	private boolean casado; // true -> Si, false -> No.
	private double salario;

	// ---------------------------------------------------- //

	public Empleado() {
	}

	public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {

		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;

	}

	// ---------------------------------------------------- //

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String isCasado() {
		return casado?"Si":"No";
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// ---------------------------------------------------- //

	public String clasificacion() {

		String clasificacion = "";

		if (edad < 18) {
			clasificacion = "Novato";
		} else if (edad < 25) {
			clasificacion = "Junior";
		} else if (edad > 25) {
			clasificacion = "Senior";
		}

		return clasificacion;

	}

	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + isCasado() + ", salario="
				+ salario + ", Clasificacion=" + clasificacion() +"]";
	}

	public void aumentarSueldo(int porcentajeAumento) {

		double porcentaje = 0;

		porcentaje = porcentajeAumento / 100;

		porcentaje += 1;

		salario *= porcentaje;

	}

	public void mostrarMensaje(String mensaje) {

		System.out.println(mensaje);

	}
	

}
