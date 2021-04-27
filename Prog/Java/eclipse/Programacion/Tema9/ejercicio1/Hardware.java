/**
 * 
 */
package ejercicio1;

/**
 * @author Pau Navarro
 *
 */
public class Hardware extends Producto {

	boolean periferico;

	public Hardware(char codigo, String descrp, boolean perif) {
		super(codigo, descrp);
		periferico = perif;

	}

	/**
	 * @return the periferico
	 */
	public boolean isPeriferico() {
		return periferico;
	}

	/**
	 * @param periferico the periferico to set
	 */
	public void cambiarPeriferico(boolean periferico) {
		this.periferico = periferico;
	}

	@Override
	public double getPrecio(char codigo) {
		
		double precio;
		
		precio = super.getPrecio(codigo);
		
		if (periferico) {
			precio = precio * 1.10;
		}
		
		return precio;
	}

}
