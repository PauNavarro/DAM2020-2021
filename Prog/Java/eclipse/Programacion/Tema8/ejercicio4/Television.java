package ejercicio4;

/**
 * 
 * @author Pau Navarro
 * @since 2021/04/14
 * @see Electrodomestico otros parametros disponibles para la clase.
 */

public class Television extends Electrodomestico {

	/**
	 * La resolucion es un doble representado en pulgadas.
	 */
	double resolucion = 20;
	/**
	 * El boolean smartTv equivale a que la television incorpora smartTV si se encuentra en True, de otro modo sera False.
	 */
	boolean smartTv = false; // True = si es smartTv, False = no lo es
	
	// ---- Getters y setters ---- //
	
	/**
	 * 
	 * @return devuelve la resolucion actual de la television
	 */
	public double getPulgadas() {
		return resolucion;
	}
	/**
	 * 
	 * @param pulgadas la resolucion nueva a guardar
	 */
	public void setPulgadas(double pulgadas) {
		this.resolucion = pulgadas;
	}
	/**
	 * 
	 * @return devuelve si la television tiene smartTV o no
	 */
	public boolean isSmartTv() {
		return smartTv;
	}
	
	/**
	 * 
	 * @param smartTv modifica si la television tiene o no smartTV
	 */
	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	
	// ---- Constructores ---- //
	
	/**
	 * Constructor por defecto.
	 */
	public Television() {}
	
	/**
	 * Constructor parametrizado con solo los parametros de la clase Televisor
	 * @param pulgadas Resolucion de la Television en pulgadas
	 * @param smartTv Boolean que define si la television tiene o no SmartTV "True = si, False = no"
	 */
	public Television(double pulgadas, boolean smartTv) {
		this.resolucion = pulgadas;
		this.smartTv = smartTv;
	}

	/**
	 * Constructor parametrizado con todos los parametros disponibles para la clase Televisor
	 * @param precioBase precio base de la television
	 * @param color color de la television
	 * @param peso peso de la television
	 * @param consumoEnergetico consumo energetico de la television
	 * @param smartTv si la television posee smartTV o no
	 * @param pulgadas resolucion de la television
	 * @see Electrodomestico Electrodomestico para mas informacion sobre los parametros
	 */
	public Television(double precioBase, String color, double peso, char consumoEnergetico,boolean smartTv, double pulgadas) {
		super(precioBase, color, peso, consumoEnergetico);
		this.smartTv=smartTv;
		this.resolucion=pulgadas;
	}
	
	// ---- Metodos ---- //
	
	/**
	 * Metodo que calcula el precio final de la television
	 * @return Devuelve el precio final basandose en si la television tiene smartTV o no
	 */
	@Override
	public double precioFinal() {

		double precioFinal;
		
		if (smartTv) {
			precioFinal = super.getPrecioBase() * 1.30;
		} else {
			precioFinal = super.getPrecioBase();
		}
		return precioFinal;
		
	}
	
}
