package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangulosTest {

	@Test
	void testValidarTriangulo() {

		String resultado;

		// ---------- 01 ---------- //
		resultado = Triangulos.ValidarTriangulo(0, 5, 2);
		assertEquals("Triangulo inválido, lados negativos o nulos", resultado);
		// ---------- 02 ---------- //
		resultado = Triangulos.ValidarTriangulo(1, 0, 5);
		assertEquals("Triangulo inválido, lados negativos o nulos", resultado);
		// ---------- 03 ---------- //
		resultado = Triangulos.ValidarTriangulo(1, 5, 0);
		assertEquals("Triangulo inválido, lados negativos o nulos", resultado);

		// - Hasta aqui el primer if - Caminos totales : 3 - //

		// ---------- 04 ---------- //
		resultado = Triangulos.ValidarTriangulo(4, 1, 1);
		assertEquals("Triangulo inválido, no desigualdad triangular", resultado);
		// ---------- 05 ---------- //
		resultado = Triangulos.ValidarTriangulo(1, 4, 1);
		assertEquals("Triangulo inválido, no desigualdad triangular", resultado);
		// ---------- 06 ---------- //
		resultado = Triangulos.ValidarTriangulo(1, 1, 4);
		assertEquals("Triangulo inválido, no desigualdad triangular", resultado);

		// - Hasta aqui el segundo if - Caminos totales : 6 - //

		// ---------- 07 ---------- //
		resultado = Triangulos.ValidarTriangulo(4, 4, 4);
		assertEquals("Triangulo equilatero", resultado);

		// - Hasta aqui el tercer if - Caminos totales : 7 - //

		// ---------- 08 ---------- //
		resultado = Triangulos.ValidarTriangulo(4, 4, 1);
		assertEquals("Triangulo isosceles", resultado);
		// ---------- 09 ---------- //
		resultado = Triangulos.ValidarTriangulo(1, 4, 4);
		assertEquals("Triangulo isosceles", resultado);
		// ---------- 10 ---------- //
		resultado = Triangulos.ValidarTriangulo(4, 1, 4);
		assertEquals("Triangulo isosceles", resultado);

		// - Hasta aqui el cuarto if - Caminos totales : 10 - //

		// ---------- 11 ---------- //
		resultado = Triangulos.ValidarTriangulo(4, 5, 3);
		assertEquals("Triangulo escaleno", resultado);

		// - Fin de la prueba - //

	}

}
