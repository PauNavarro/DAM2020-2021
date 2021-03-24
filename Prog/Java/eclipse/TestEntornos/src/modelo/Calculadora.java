package modelo;

public class Calculadora {

	// Atributos
	private double num1;
	private double num2;
	private String operacion;
	private static String numActual = "";
	private static String numMemoria = "";

	// Constructor
	public Calculadora() {
	}

	// Getters and Setters

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public static String getNumActual() {
		return numActual;
	}

	@SuppressWarnings("static-access")
	public static void setNumActual(String numActuall) {
		numActual = numActuall;
	}

	public static String getNumMemoria() {
		return numMemoria;
	}

	public static void setNumMemoria(String numEnMemoria) {
		numMemoria = numEnMemoria;
	}

	// Metodos

	public void sumar() {

		double calculo;

		calculo = num1 + num2;

		numActual = "" + calculo;

	}

	public void restar() {

		double calculo;

		calculo = num1 - num2;

		numActual = "" + calculo;

	}

	public void multiplicar() {

		double calculo;

		calculo = num1 * num2;

		numActual = "" + calculo;

	}

	public void dividir() {

		double calculo;

		calculo = num1 / num2;

		if (num1 != 0 && num2 != 0) {

			numActual = "" + calculo;
		
		}
		
		else numActual = "Error, no se puede dividir por 0";
		
	}

}
