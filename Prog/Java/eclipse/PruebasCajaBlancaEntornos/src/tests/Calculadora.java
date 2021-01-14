package tests;

public class Calculadora {

	private double num1;
	private double num2;
	private double num3;

	public Calculadora(double a, double b, double c) {
		num1 = a;
		num2 = b;
		num3 = c;
	}

	public double suma() {
		double resultado = num1 + num2;
		return resultado;
	}

	public double resta() {
		double resultado = num1 - num2;
		return resultado;
	}

	public double multiplicacion() {
		double resultado = num1 * num2;
		return resultado;
	}

	public double division() {
		double resultado = num1 / num2;
		return resultado;
	}

	public double maximo() {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else return num3;
		

	}

}
