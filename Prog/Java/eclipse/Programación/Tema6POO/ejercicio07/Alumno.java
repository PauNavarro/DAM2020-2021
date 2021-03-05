package ejercicio07;

public class Alumno {

	private String nombre;
	private int numExpediente;
	private Notas notasAlumno;

	public Notas getNotasAlumno() {
		return notasAlumno;
	}

	public void setNotasAlumno(Notas notasAlumno) {
		this.notasAlumno = notasAlumno;
	}

	public Alumno() {

	}

	public Alumno(String nombre, int numeroExp, Notas notas) {

		this.nombre = nombre;
		numExpediente = numeroExp;
		notasAlumno = notas;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String toString() {

		String datos;
		int a = 1;

		datos = "Alumno: " + nombre + "\n";
		datos = datos + "Num Expediente: " + numExpediente + "\n";
		datos = datos + "--- Notas ---\n";
		for (int i = 0; i < 5; i++) {
			datos = datos + "\t Nota asignatura " + a + " = " + notasAlumno.getNotas(i) + "\n";
			a++;
		}
		datos = datos + "-- Nota Media:" + notasAlumno.media();

		return datos;
	}

}
