package tdd;

public class Euro extends Moneda {

	public int getCantidad() {
		return super.cantidad;
	}

	public void setCantidad(int cantidad) {
		super.cantidad = cantidad;
	}

	public Euro(int cantidad, String denominacion) {
		//setCantidad(cantidad);
		//this.denominacion = denominacion;
		super(cantidad, denominacion);
	}

	public /*Euro*/ Moneda multiplicarPor(int multiplicador) {

		return /*new Euro*/Moneda.euro(super.cantidad * multiplicador);
	}
	
	String denominacion() {
		return "EUR";
	}

//	public boolean equals(Object object) {
//
//		// return true;
//
//		if (this.cantidad == ((Euro) object).getCantidad()) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}

}
