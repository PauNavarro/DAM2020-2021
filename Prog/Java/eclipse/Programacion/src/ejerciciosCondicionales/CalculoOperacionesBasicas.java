package ejerciciosCondicionales;

import java.util.Scanner;

public class CalculoOperacionesBasicas {

	public static void main(String[] args) {
	

		Scanner teclado = new Scanner(System.in);

		// 10.- Escribe un programa que lee dos números, calcula y muestra el valor de su
		// suma, resta, producto y división. (Ten en cuenta la división por cero).

		int numero1;
		int numero2;
		int operacion;
		int resultado;
		int resto;
		int contador = 0;

		// Petición de valores

		System.out.println("Dame el primer numero");

		numero1 = teclado.nextInt();

		System.out.println("Dame el Segundo numero");

		numero2 = teclado.nextInt();

		System.out.println(
				"Dame la operación que quieres realizar, 1=Suma, 2=Resta, 3=Multiplicación, 4=Division y resto");

		operacion = teclado.nextInt();

		// Realización de las operaciones

		if (operacion > 4)
			System.out.println("El operador introducido no es valido");
		if (operacion == 1) {
			resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es " + resultado);
		} else

		{
			if (operacion == 2) {
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es " + resultado);
			} else

			{
				if (operacion == 3) {
					resultado = numero1 * numero2;
					System.out.println("El resultado de la multiplicación es " + resultado);
				} else

				{
					if (operacion == 4) {
						if (numero2 > 0) {
							contador++;
						
						while (contador > 0) {
							resultado = numero1 / numero2;
							resto = numero1 % numero2;
							contador = 0;
						System.out.println("El resultado de la Division es " + resultado + " y su resto " + resto);
						} }
						else{
						System.out.println("No es posible dividir un numero por 0");
					}
					}
				}
			}
		}

		teclado.close();
	}
}