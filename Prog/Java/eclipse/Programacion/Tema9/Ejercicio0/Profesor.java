package Ejercicio0;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author DAM
 *
 */
public class Profesor extends MiembroUPV {

	private String despacho;
	private String horarioTutorias;
	private double nomina;

	/**
	 * 
	 * @param nombre   nombre del profesor
	 * @param despacho numero del despacho
	 * @param nomina   la nomina del profesor
	 */
	public Profesor(String nombre, String despacho, double nomina) {
		super(nombre);
		this.despacho = despacho;
		this.nomina = nomina;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", vehiculo="
				+ getVehiculo().toString() + ", Despacho=" + despacho + ", " + getConsultas();
	}

	/**
	 * 
	 * @return El despacho actual
	 */
	public String getDespacho() {
		return despacho;
	}

	/**
	 * 
	 * @param despacho El despacho a guardar
	 */
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	/**
	 * 
	 * @return El horario de tutorias actual
	 */
	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	/**
	 * 
	 * @param horarioTutorias El horario de tutorias a guardar
	 */
	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}

	/**
	 * 
	 * @return Las horas de tutoria del profesor
	 */
	public String getConsultas() {

		return (super.getNombre() + " tiene tutoria " + getHorarioTutorias() + " en la sala de profesores");

	}

	/**
	 * @return La nomina actual
	 */
	public double getNomina() {
		return nomina;
	}

	/**
	 * @param nomina La nomina a guardar
	 */
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	@Override
	public void menuIntranet() {

		Scanner c = new Scanner(System.in);

		boolean end = false;
		
		do {

			System.out.println("Bienvenido al menú Intranet profesor, seleccione la operación que desee hacer:");
			System.out.println("1-Ver la informacion del profesor");
			System.out.println("2-Ver la nomina del profesor");
			System.out.println("3-¿A que actividades deportivas desea apuntarse?");
			System.out.println("4-Salir");

			int pulsacion = c.nextInt();

			switch (pulsacion) {
			case 1:
				// Al pulsar 1 mostrará el Nombre, la edad, el despacho y el horario del
				// profesor
				toString();
				break;

			case 2:
				// Al pulsar 2 mostrará la nómina del profesor
				System.out.println(getNomina() + "€");
				break;

			case 3:
				// Al pulsar 3 pide al profesor que introduzca las actividades a la que es
				// quiere apuntar
				String actividad = c.next();
				System.out.println("Te has apuntado a " + actividad);
				break;

			case 4:
				// Al pulsar 4 imprime HASTA LUEGO!Gracias por utilizar la Intranet de profesor
				System.out.println("Hasta luego! Gracias por utilizar la Intranet de profesor");
				end = true;
				break;

			default:
				System.out.println("Error, introduce una opcion valida;");
				break;
			}
		} while (!end);
		
		c.close();
	
	}

}
