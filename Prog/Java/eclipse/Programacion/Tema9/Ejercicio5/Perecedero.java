package Ejercicio5;

/**
 * @author Pau Navarro
 *
 */
public class Perecedero extends Producto {

	private int diasACaducar;

	/**
	 * @return the diasACaducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * @param diasACaducar the diasACaducar to set
	 */
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Constructor por defecto
	 */
	public Perecedero() {
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre El nombre del producto
	 * @param precio El precio del producto
	 * @param diasACaducar Dias hasta que caduque el producto
	 */
	public Perecedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	/**
	 * Constructor copia
	 * 
	 * @param p El producto a copiar
	 * @param diasACaducar Dias hasta que caduque el producto
	 */
	public Perecedero(Producto p, int diasACaducar) {
		super(p);
		this.diasACaducar = diasACaducar;
	}
	
	public int calcular(int cantidad) {
		
		int precioFinal = getPrecio() * cantidad;
		
		if (diasACaducar == 3) {
			precioFinal *= 0.5;
		}
	
		if (diasACaducar == 2) {
			precioFinal *= 0.66;
		}
		
		if (diasACaducar == 1) {
			precioFinal *= 0.75;
		}
		
		return precioFinal;
	}

}
