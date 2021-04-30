package ejercicio2;

public class Libro extends Publicacion {

	private String autor;
	
	public Libro(int codigo, String year, boolean prestado, String autor) {
		super(codigo, year, prestado);
		this.setAutor(autor);
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + " Atributos heredados=" + super.toString() +"]";
	}

	
	
}
