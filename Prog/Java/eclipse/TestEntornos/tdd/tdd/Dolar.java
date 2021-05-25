package tdd;

//public class Dolar {
public class Dolar extends Moneda {

	public int getCantidad() {
		return super.cantidad;
	}

	public void setCantidad(int cantidad) {
		super.cantidad = cantidad;
	}

	public Dolar(int cantidad, String denominacion) {
		// setCantidad(cantidad);
		// this.denominacion = denominacion;
		super(cantidad, denominacion);
	}

	// public int multiplicarPor(int multiplicador) {
	public /* Dolar */Moneda multiplicarPor(int multiplicador) {

		// return cantidad *= multiplicador;
		return /* new Dolar */Moneda.dolar(cantidad * multiplicador);
	}

	String denominacion() {
		return "USD";
	}

	// public boolean equals(Object object) {
	//
	// // return true;
	//
	// if (this.cantidad == ((Dolar) object).getCantidad()) {
	// return true;
	// } else {
	// return false;
	// }
	//
	// }

}
