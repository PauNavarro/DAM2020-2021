package Ejercicio5;

public class Main {

	public static void main(String[] args) {

		Producto arrPr[] = new Producto[5];

		Producto p0 = new Perecedero("Producto 1", 25, 3);
		Producto p1 = new Perecedero("Producto 2", 100, 1);
		Producto p2 = new Perecedero("Producto 3", 100, 10);
		Producto p3 = new NoPerecedero("Producto 4", 50, "2");
		Producto p4 = new NoPerecedero("Producto 5", 45, "3");

		System.out.println(p0.calcular(5) + " = " + p0.getPrecio() + " x " + 5);
		System.out.println(p1.calcular(5) + " = " + p1.getPrecio() + " x " + 5);
		System.out.println(p2.calcular(5) + " = " + p2.getPrecio() + " x " + 5);
		System.out.println(p3.calcular(5) + " = " + p3.getPrecio() + " x " + 5);
		System.out.println(p4.calcular(5) + " = " + p4.getPrecio() + " x " + 5);
	}

}
