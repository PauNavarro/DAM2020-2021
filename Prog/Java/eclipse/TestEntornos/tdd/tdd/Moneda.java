package tdd;

public abstract class Moneda {

	protected int cantidad;
	protected String denominacion;
	
	public Moneda(int cantidad, String denominacion) {
		this.cantidad = cantidad;
		this.denominacion = denominacion;
	}

	public boolean equals(Object object) {

		Moneda moneda = (Moneda) object;

		if (this.getClass().equals(moneda.getClass())) {

			return cantidad == moneda.cantidad;

		} else {

			return false;

		}

	}

	static Moneda dolar(int cantidad) {
		return new Dolar(cantidad, "USD");
	}

	static Moneda euro(int cantidad) {
		return new Euro(cantidad, "EUR");
	}

	abstract Moneda multiplicarPor(int multiplicador);

	String denominacion() {
		return denominacion;
	}

}
