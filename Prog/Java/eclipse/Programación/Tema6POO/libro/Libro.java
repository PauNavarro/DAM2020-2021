/**
 * 
 */
package libro;

/**
 * @author DAM
 *
 */
public class Libro {

	private String tituloLibro;
	private String autor;
	private int numeroEjemplares;
	private int numeroPrestados;
	private int disponibles;

	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplaresAct, int ejemplaresPrestados) {
		tituloLibro = titulo;
		this.autor = autor;
		numeroEjemplares = ejemplaresAct;
		numeroPrestados = ejemplaresPrestados;
		setDisponibles();
	}

	public int getDisponibles() {
		setDisponibles();
		return disponibles;
	}
	
	public void setDisponibles() {
		
		if(getNumeroEjemplares() - getNumeroPrestados() >= 0) {
			this.disponibles = getNumeroEjemplares() - getNumeroPrestados();
		} else {
			this.disponibles = 0;
		}
		
	}
	
	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	public int getNumeroPrestados() {
		return numeroPrestados;
	}

	public void setNumeroPrestados(int numeroPrestados) {
		this.numeroPrestados = numeroPrestados;
	}

	public boolean prestamo(int aPrestar) {

		boolean posible = false;

		if (getNumeroEjemplares() - aPrestar >= 0) {

			setNumeroPrestados(getNumeroPrestados() + aPrestar);

			posible = true;

		}

		return posible;

	}

	public boolean devolucion(int aDevolver) {

		boolean posible = false;

		if (getNumeroPrestados() > aDevolver) {

			setNumeroPrestados(getNumeroPrestados() - aDevolver);
			
			posible = true;

		}

		return posible;

	}

}
