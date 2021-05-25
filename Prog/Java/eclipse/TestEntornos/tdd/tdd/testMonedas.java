package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMonedas {

	@Test
	void testCrearMoneda() {
		// Dolar cinco = new Dolar(5);
		// assertEquals(5, cinco.cantidad);
		// assertEquals(5, cinco.getCantidad());
		//assertEquals(new Dolar(5), new Dolar(5));
		assertEquals(Moneda.dolar(5), Moneda.dolar(5));
	}

	@Test
	void testMultiplicacion() {
		/*Dolar*/Moneda cinco = /* new Dolar */Moneda.dolar(5);
		// cinco.multiplicarPor(2);
		// assertEquals(10, cinco.cantidad);
		// assertEquals(10, cinco.getCantidad());
		// Dolar resultado = cinco.multiplicarPor(2);
		// assertEquals(10, resultado.getCantidad());
		// resultado = cinco.multiplicarPor(3);
		// assertEquals(15, resultado.getCantidad());
		assertEquals(/* new Dolar */Moneda.dolar(10), cinco.multiplicarPor(2));
		assertEquals(/* new Dolar */Moneda.dolar(15), cinco.multiplicarPor(3));

	}

	@Test
	void testIgualdad() {
		//assertTrue(new Dolar(5).equals(new Dolar(5)));
		//assertFalse(new Dolar(5).equals(new Dolar(6)));
		//assertTrue(new Euro(5).equals(new Euro(5)));
		//assertFalse(new Euro(5).equals(new Euro(6)));
		//assertFalse(new Euro(5).equals(new Dolar(5)));
		assertTrue(Moneda.dolar(5).equals(Moneda.dolar(5)));
		assertFalse(Moneda.dolar(5).equals(Moneda.dolar(6)));
		assertTrue(Moneda.euro(5).equals(Moneda.euro(5)));
		assertFalse(Moneda.euro(5).equals(Moneda.euro(6)));
		assertFalse(Moneda.euro(5).equals(Moneda.dolar(5)));
		
		
	}

	@Test
	void testMultiplicacionEuros() {
		/*Euro*/Moneda cinco = /*new Euro*/Moneda.euro(5);
		assertEquals(/*new Euro*/Moneda.euro(10), cinco.multiplicarPor(2));
		assertEquals(/*new Euro*/Moneda.euro(15), cinco.multiplicarPor(3));
	}
	
	@Test
	void testDenominacion() {
		assertEquals("USD", Moneda.dolar(1).denominacion());
		assertEquals("EUR", Moneda.euro(1).denominacion());

	}

}
