package ejerciciosEntornos;

import static org.junit.jupiter.api.Assertions.*;
import ejerciciosEntornos.ContarParesEnImpares;

import org.junit.jupiter.api.Test;

class ContarParesEnImparesTest {

	@Test
	void testParesEnImpares() {

		// Prueba 1

		int numeros1[] = { 2, 8, 6, 8, 5, 4, 3, 8, 35, 4, 2, 5 };

		int nppi1 = ContarParesEnImpares.ParesEnImpares(numeros1);

		System.out.println();
		System.out.println("Hay un total de " + nppi1 + " numeros pares en posiciones impares");

		assertEquals(3, nppi1);
		System.out.println();

		// Prueba 2
		
		int numeros2[] = {};

		int nppi2 = ContarParesEnImpares.ParesEnImpares(numeros2);

		System.out.println();
		System.out.println("Hay un total de " + nppi2 + " numeros pares en posiciones impares");

		assertEquals(0, nppi2);
		System.out.println();

		// Prueba 3

		int numeros3[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 6, 8 };

		int nppi3 = ContarParesEnImpares.ParesEnImpares(numeros3);

		System.out.println();
		System.out.println("Hay un total de " + nppi3 + " numeros pares en posiciones impares");

		assertEquals(7, nppi3);
		System.out.println();

		// Prueba 4

		int numeros4[] = { 3, 3, 3, 3, 3, 3 };

		int nppi4 = ContarParesEnImpares.ParesEnImpares(numeros4);

		System.out.println();
		System.out.println("Hay un total de " + nppi4 + " numeros pares en posiciones impares");

		assertEquals(0, nppi4);

	}

}
