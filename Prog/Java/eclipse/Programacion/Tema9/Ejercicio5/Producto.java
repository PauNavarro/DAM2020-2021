package Ejercicio5;

/**
 * @author Pau Navarro
 *
 * @since 19/04/2021
 *
 */
public class Producto {

	private String nombre;
	private int precio;
	
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
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio El precio a guardar
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Producto() {}
	
	/**
	 * @param nombre El nombre
	 * @param precio El precio
	 */
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	/**
	 * Constructor Copia
	 * 
	 * @param p Producto a copiar
	 */
	public Producto(Producto p) {
		this.nombre = p.getNombre();
		this.precio = p.getPrecio();
	}
	
	/**
	 * Metodo toString
	 * @return los valores del producto en forma de string
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	/**
	 * 
	 * @param cantidad El numero de productos
	 * @return el Precio multiplicado por la Cantidad
	 */
	public int calcular(int cantidad) {
	
		int precioFinal = precio * cantidad;
		
		return precioFinal;
	}
	
}
