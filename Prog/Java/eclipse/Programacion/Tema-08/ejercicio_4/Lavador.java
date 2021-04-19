package ejercicio_4;

/**
 * 
 * @author Pau Navarro
 * @since 2021/04/14
 * @see Electrodomestico otros parametros disponibles para la clase.
 */

public class Lavador extends Electrodomestico {

	/**
	 * La carga es representada por un numero entero en Kg.
	 */
	int carga = 5; 

	// ---- Getters y setters ---- //

	/**
	 * Metodo para obtener la carga actual de la lavadora
	 * @return Carga actual de la lavadora
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo para modificar la carga maxima de la lavadora
	 * @param carga  la carga que se desea guardar en la lavadora
 	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	// ---- Constructores ---- //

	/**
	 * Constructor por defecto
	 */
	public Lavador() {}

	/**
	 * 
	 * Constructor parametrizado con solo los parametros de Electrodomestico peso y precio base
	 * @param peso  peso de la lavadora
	 * @param precio  precio Base de la lavadora
	 * @see Electrodomestico  Electrodomestico para mas informacion sobre los parametros
	 */
	public Lavador(int peso, double precio) {
		super.setPeso(peso);
		super.setPrecioBase(precio);
	}

	/**
	 * Constructor con todos los parametros de Electrodomestico y el parametro de carga.
	 * @param precioBase  precio Base de la lavadora 
	 * @param color  color de la lavadora 
	 * @param peso  peso de la lavadora 
	 * @param consumoEnergetico  consumo energetico de la lavadora
	 * @param carga  carga maxima de la lavadora
	 * @see Electrodomestico  Electrodomestico para mas informacion sobre los parametros
	 */ 
	public Lavador(double precioBase, String color, double peso, String consumoEnergetico, int carga) {		
		super(precioBase, color, peso, consumoEnergetico);
		this.carga = carga;
	}

	// ---- Metodos ---- //

	/**
	 * Metodo utilizado para calcular el precio final de la lavadora
	 * @return Precio final de la lavadora teniendo en cuenta la carga maxima de esta.
	 */
	@Override
	public double precioFinal() {
		
		double precioFin;

		if (this.carga > 30) {
			precioFin = super.getPrecioBase() + 50;
		} else {
			precioFin = super.getPrecioBase();
		}
		
		return precioFin;

	}

}
