package ejercicio0;

import gente.Persona;

public class Profesor extends Persona {

	private String despacho;
	private String horarioTutorias;

	public Profesor(String nombre, String despacho) {
		super(nombre);
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + super.getNombre() + ", edad=" + super.getEdad() 
		+ ", vehiculo=" + getVehiculo().toString() + ", Despacho=" + despacho +", " + getConsultas();
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}

	public String getConsultas() {

		return (super.getNombre() + " tiene tutoria " + getHorarioTutorias() + " en la sala de profesores");

	}

}
