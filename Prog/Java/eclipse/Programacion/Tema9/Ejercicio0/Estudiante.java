package Ejercicio0;

import java.util.Arrays;
import java.util.Scanner;

public class Estudiante extends MiembroUPV {

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
		return "Estudiante [nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", vehiculo="
				+ getVehiculo().toString() + ", numeroExpediente=" + numeroExpediente + ", cursoActual=" + cursoActual
				+ ", notas=" + Arrays.toString(notas) + "]" + ", Nota media=" + getNotaMedia();
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

	@Override
	public void menuIntranet() {

		Scanner b = new Scanner(System.in);
		
		boolean end = false;

		System.out.println("");
		
		do {
			System.out.println("Bienvenido al menú Intranet estudiante, seleccione la operación que desee hacer: ");
			System.out.println("1-Ver Expediente estudiante");
			System.out.println("2-¿A que actividades deportivas desea apuntarse?");
			System.out.println("3-Salir");
	
			
			int pulsacion = b.nextInt();
					
			switch (pulsacion) {
			case 1:
				// Al pulsar 1 mostrará el Nombre, la edad, el número de Expediente y el curso
				// en el que está el alumno.
				toString();
				break;

			case 2:
				// Al pulsar 3 pide al estudiante que introduzca las actividades a la que es
				// quiere apuntar
				String actividad = b.next();
				System.out.println("Te has apuntado a " + actividad);
				break;

			case 3:
				// Al pulsar 4 imprime HASTA LUEGO!Gracias por utilizar la Intranet de estudiante
				System.out.println("Hasta luego! Gracias por utilizar la Intranet de estudiante");
				end = true;
				break;

			default:
				System.out.println("Error, introduce una opcion valida;");
				break;
			}
		} while (!end);
		
		b.close();
	
	}

}