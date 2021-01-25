package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SiguienteMatriculaTest {

	@Test
	void testSiguienteMatricula() {

		String res = SiguienteMatricula.siguienteMatricula("0000BBB");

		assertEquals("0001BBB", res);

		res = SiguienteMatricula.siguienteMatricula("9999JKZ");

		assertEquals("0000JLB", res);

	}

	@Test
	void testSiguienteNumero() {

		String res = SiguienteMatricula.siguienteNumero("0000");

		assertEquals("0001", res);
	
		res = SiguienteMatricula.siguienteNumero("1454");

		assertEquals("1455", res);

	}

	@Test
	void testSiguientesLetras() {
		
		String res = SiguienteMatricula.siguientesLetras("BBB");

		assertEquals("BBC", res);
	
		res = SiguienteMatricula.siguientesLetras("YZZ");

		assertEquals("ZBB", res);
		
		res = SiguienteMatricula.siguientesLetras("JKB");

		assertEquals("JKC", res);

	}

}
