package ejercicio1;

public class Programador extends Empleado {

	private int lineasPorHora;
	private String lenguajeDominante;

	// ---------------------------------------------------- //

	public Programador() {
	}

	public Programador(String nombre, String DNI, int edad, boolean casado, double salario, int lineasPorHora, String lenguaje) {

		super(nombre, DNI, edad, casado, salario);
		this.lineasPorHora = lineasPorHora;
		this.lenguajeDominante = lenguaje;

	}

	// ---------------------------------------------------- //

	public int getLineasPorHora() {
		return lineasPorHora;
	}

	public void setLineasPorHora(int lineasPorHora) {
		this.lineasPorHora = lineasPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	// ---------------------------------------------------- //

	public String nivelProgramacion() {

		String nivel = "";

		if (lineasPorHora < 200) {

			nivel = "Level 1";

		} else if (lineasPorHora >= 200 && lineasPorHora < 500) {

			nivel = "Level 2";

		} else if (lineasPorHora >= 500) {

			nivel = "Level 3";

		}

		return nivel;

	}

	@Override
	public String toString() {
		return "Programador [lineasPorHora=" + lineasPorHora + ", lenguajeDominante=" + lenguajeDominante
				+ ", nivelProgramacion=" + nivelProgramacion() + ", " +  super.toString() + "]";
	}

	
	
	

}
