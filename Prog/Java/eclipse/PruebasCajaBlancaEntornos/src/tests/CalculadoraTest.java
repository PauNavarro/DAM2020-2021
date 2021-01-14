package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(10.5,10.5,0);
		double rdoSuma = c.suma();
		assertEquals(21, rdoSuma);
	}

	@Test
	void testResta() {
		Calculadora c2 = new Calculadora(10.5,10.5,0);
		double rdoResta = c2.resta();
		assertEquals(0, rdoResta);
	}

	@Test
	void testMultiplicacion() {
		Calculadora c3 = new Calculadora(10.5,10.5,0);
		double rdoMult = c3.multiplicacion();
		assertEquals(110,25, rdoMult);
		}

	@Test
	void testDivision() {
		Calculadora c4 = new Calculadora(10.5,10.5,0);
		double rdoDiv = c4.division();
		assertEquals(1, rdoDiv);
	}

	@Test
	void testMaximo() {
		Calculadora c5 = new Calculadora(11,10.5,24.9);
		Calculadora c6 = new Calculadora(11,10.5,4.9);
		Calculadora c7 = new Calculadora(1,10.5,2.9);
		double rdoMaximo = c5.maximo();
		double rdoMaximo2 = c6.maximo();
		double rdoMaximo3 = c7.maximo();
		assertEquals(24.9, rdoMaximo);
		assertEquals(11, rdoMaximo2);
		assertEquals(10.5, rdoMaximo3);
	
	}
}
