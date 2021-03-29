package modelo;

public class Calculadora {

	// Atributos
	private String operacion;
	private  String numActual = "";
	private  String numMemoria = "";
	private boolean hayComa = false; // si hayComa == true, indica que ya se ha introducido una comma

	// Constructor
	public Calculadora() {
	}

	// Getters and Setters

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getNumActual() {
		return numActual;
	}

	public void setNumActual(String numActuall) {
		numActual = numActuall;
	}

	public String getNumMemoria() {
		return numMemoria;
	}

	public void setNumMemoria(String numEnMemoria) {
		numMemoria = numEnMemoria;
	}
	
	public boolean getComa() {
		return hayComa;
	}
	
	public void setComa(boolean a) {
		
		hayComa = a;
		
	}

	// Metodos

	public void sumar(double num1, double num2) {

		double calculo;

		calculo = num1 + num2;
		
		setNumActual(calculo + "");

	}

	public void restar(double num1, double num2) {

		double calculo;

		calculo = num1 - num2;

		numActual = "" + calculo;

	}

	public void multiplicar(double num1, double num2) {

		double calculo;

		calculo = num1 * num2;

		numActual = "" + calculo;

	}

	public void dividir(double num1, double num2) {

		double calculo;

		calculo = num1 / num2;

		if (num1 != 0 && num2 != 0) {

			numActual = "" + calculo;
		
		}
		
		else numActual = "Error, no se puede dividir por 0";
		
	}

}
