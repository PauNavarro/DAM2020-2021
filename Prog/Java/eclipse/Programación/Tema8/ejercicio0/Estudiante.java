package ejercicio0;

import java.util.Arrays;

import gente.Persona;

public class Estudiante extends Persona {

	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];
	
	public Estudiante(String nombre, String Curso, int expediente) {
		super(nombre);
		cursoActual = Curso;
		numeroExpediente = expediente;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", vehiculo=" + getVehiculo().toString() 
				+", numeroExpediente=" + numeroExpediente + ", cursoActual=" + cursoActual + ", notas=" + Arrays.toString(notas) + "]" 
				+", Nota media=" + getNotaMedia() ;
	}

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public String getCursoActual() {
		return cursoActual;
	}

	public void setCursoActual(String cursoActual) {
		this.cursoActual = cursoActual;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double getNotaMedia() {
		
		double notaMedia = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notaMedia += notas[i];
		}
		
		notaMedia /= 7;
		
		return notaMedia;
	}
	
}
