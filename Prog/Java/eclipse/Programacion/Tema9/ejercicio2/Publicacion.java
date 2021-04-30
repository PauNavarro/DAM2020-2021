package ejercicio2;

public class Publicacion implements Acciones {

	private int codigo;
	private String year;
	private boolean prestado;
	
	public Publicacion(int codigo, String year, boolean prestado) {

		this.codigo = codigo;
		this.year = year;
		this.prestado = prestado;
	
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}



	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}



	/**
	 * @return the prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}



	/**
	 * @param prestado the prestado to set
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}



	@Override
	public void prestar() {
		
		this.setPrestado(true);
		
	}

	@Override
	public void devolver() {
		
		this.setPrestado(false);
		
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", year=" + year + ", prestado=" + prestado + "]";
	}
	
	
	
}
