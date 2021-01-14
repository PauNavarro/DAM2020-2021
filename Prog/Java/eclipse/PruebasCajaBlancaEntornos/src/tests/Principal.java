package tests;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora(10.5,10.5,0);
		
		double rdoSuma = c.suma();
		double rdoResta = c.resta();
		double rdoMulti = c.multiplicacion();
		double rdoDiv = c.division();
		
		
	}

}
