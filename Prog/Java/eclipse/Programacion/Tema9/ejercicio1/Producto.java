package ejercicio1;

public abstract class Producto implements IPrecios {

	char codigo;
	String descripcion;

	public Producto(char codigo, String descrp) {
		this.codigo = codigo;
		this.descripcion = descrp;
	}

	/**
	 * @return the codigo
	 */
	public char getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void cambiarCodigo(char codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void cambiarDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
