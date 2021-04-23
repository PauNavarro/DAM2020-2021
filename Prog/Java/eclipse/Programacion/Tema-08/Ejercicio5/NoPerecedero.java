
package Ejercicio5;

/**
 * @author Pau Navarro
 *
 */
public class NoPerecedero extends Producto {

	private String tipo;
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Constructor por defecto
	 */
	public NoPerecedero() {
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre El nombre del producto
	 * @param precio El precio del producto
	 * @param tipo tipo de producto
	 */
	public NoPerecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.setTipo(tipo);
	}

	/**
	 * Constructor copia
	 * 
	 * @param p producto a copiar
	 * @param tipo tipo de producto
	 */
	public NoPerecedero(Producto p, String tipo) {
		super(p);
		this.setTipo(tipo);
	}

}
