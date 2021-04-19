package Ejercicio5;

/**
 * @author DAM
 *
 * @since 19/04/2021
 *
 */
public class Producto {

	private String nombre;
	private double precio;
	
	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre El nombre a guardar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return El precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio El precio a guardar
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 */
	public Producto() {}
	
	/**
	 * @param nombre El nombre
	 * @param precio El precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	
}
