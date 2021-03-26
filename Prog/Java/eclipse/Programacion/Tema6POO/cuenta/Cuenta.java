package cuenta;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double interes;
	private double saldo;
	
	public Cuenta() {

	}

	public Cuenta(String nombreCliente, String numeroCuenta, double interes, double saldo) {

		setNombreCliente(nombreCliente);
		setNumeroCuenta(numeroCuenta);
		setInteres(interes);
		setSaldo(saldo);

	}

	public Cuenta(Cuenta cuenta1) {
		setNombreCliente(cuenta1.getNombreCliente());
		setNumeroCuenta(cuenta1.getNumeroCuenta());
		setInteres(cuenta1.getInteres());
		setSaldo(cuenta1.getSaldo());
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double ingresado) {

		boolean posible;

		if (ingresado > 0) {

			saldo += ingresado;

			posible = true;

		} else {

			posible = false;

		}

		return posible;
	}

	public boolean reintegro(double aRestar) {
		boolean posible;

		if (saldo > aRestar) {

			saldo -= aRestar;

			posible = true;

		} else {

			posible = false;

		}

		return posible;
	}

	public void transferencia(Cuenta cuenta2, int aTransferir) {

		if (saldo > aTransferir) {

			cuenta2.ingreso(aTransferir);
			
			saldo -= aTransferir;

			System.out.println("Transferencia realizada adequadamente");

		} else {

			System.out.println("La transferencia no se ha podido efectuar por falta de saldo");

		}

	}

	
}
