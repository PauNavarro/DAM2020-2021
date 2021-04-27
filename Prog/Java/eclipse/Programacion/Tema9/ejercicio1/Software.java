package ejercicio1;

public class Software extends Producto {

	String tipo;

	public Software(char codigo, String descrp, String string) {
		super(codigo, descrp);
		this.tipo = string;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void cambiarTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double getPrecio(char codigo) {
		
		double precio;

		precio = super.getPrecio(codigo);

		if (tipo.equals("ProgramaJuegos")) {
			precio = precio * 1.10;
		}

		return precio;
	}

}
