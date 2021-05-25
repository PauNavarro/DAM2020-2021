package Ejercicio0;
/**
 * @author Pau Navarro
 * @since 15/04/2021
 */
public abstract class MiembroUPV extends Persona{

	public MiembroUPV(String nombre) {
		super(nombre);
		
	}

	private String carnet;

	/**
	 * @return El carnet actual
	 */
	public String getCarnet() {
		return carnet;
	}

	/**
	 * @param carnet El carnet carnet que quieres poner
	 */
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	public abstract void menuIntranet();

}
