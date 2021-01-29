package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CafeteraTest {

	@Test
	public void testLlenarCafetera() {
		Cafetera f1 = new Cafetera();
		f1.llenarCafetera();
		assertEquals(1000, f1.getCapacidadActual());
		
		Cafetera f2 = new Cafetera(2500);
		f2.llenarCafetera();
		assertEquals(0, f2.getCapacidadActual());
		
		Cafetera f3 = new Cafetera(2500, 1000);
		f3.llenarCafetera();
		assertEquals(0, f3.getCapacidadActual());
	}

	@Test
	public void testServirTaza() {
		Cafetera f1 = new Cafetera();
		f1.servirTaza(100);
		assertEquals(0, f1.getCapacidadActual());
		
		Cafetera f2 = new Cafetera(2500, 1000);
		f2.servirTaza(100);
		assertEquals(0, f2.getCapacidadActual());
		
		Cafetera f3 = new Cafetera(2500, 80);
		f3.servirTaza(100);
		assertEquals(0, f3.getCapacidadActual());
	}

	@Test
	public void testVaciarCafetera() {
		Cafetera f1 = new Cafetera();
		f1.vaciarCafetera();
		assertEquals(0, f1.getCapacidadActual());
		
		Cafetera f2 = new Cafetera(2500);
		f2.vaciarCafetera();
		assertEquals(0, f2.getCapacidadActual());
		
		Cafetera f3 = new Cafetera(2500, 1000);
		f3.vaciarCafetera();
		assertEquals(0, f3.getCapacidadActual());
	}

	@Test
	public void testAgregarCafe() {
		Cafetera f1 = new Cafetera();
		f1.agregarCafe(100);
		assertEquals(100, f1.getCapacidadActual());
		
		Cafetera f2 = new Cafetera(2500);
		f2.agregarCafe(100);
		assertEquals(100, f2.getCapacidadActual());
		
		Cafetera f3 = new Cafetera(2500, 1000);
		f3.agregarCafe(100);
		assertEquals(100, f3.getCapacidadActual());
	}

	@Test
	public void testGetNumeroCafeteras() {
		Cafetera f1 = new Cafetera();
		Cafetera f2 = new Cafetera(2500);
		Cafetera f3 = new Cafetera(2500, 1000);
		
		//System.out.println( Cafetera.getNumeroCafeteras() );
		assertEquals(1000, f1.getCapacidadMaxima());	
	}

}
