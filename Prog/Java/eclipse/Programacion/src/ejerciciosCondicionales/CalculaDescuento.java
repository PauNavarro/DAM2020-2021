package ejerciciosCondicionales;

import java.util.Scanner;

public class CalculaDescuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5.- Escribe un programa que dado el precio de un art�culo y el precio de venta
		// real nos muestre el porcentaje de descuento realizado

		Scanner teclado = new Scanner(System.in);

		double precioReal;
		double precioFinal;
		double descuento;
		double aux1 = 0;
		double aux2 = 0;

		System.out.println("Dame el precio original del producto");
		precioReal = teclado.nextInt();

		System.out.println("Dame el precio final del producto");
		precioFinal = teclado.nextInt();

		// Desc = PrecioF - PrecioReal) / PrecioF

		aux1 = precioReal - precioFinal;

		aux2 = aux1 / precioReal;

		descuento = aux2 * 100;

		System.out.println("El descuento realizado es de un " + descuento + "%");

		teclado.close();

	}

}