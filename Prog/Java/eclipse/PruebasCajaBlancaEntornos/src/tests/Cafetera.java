package tests;

public class Cafetera {

	// Atributos

	private int capacidadMaxima;
	private int capacidadActual;

	// Constructor principal

	public Cafetera() {

		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;

	}

	// Constructor para la cafetera al maximo de su capacidad

	public Cafetera(int capacidadMax) {

		capacidadActual = capacidadMaxima;

	}

	// Constructor para que la capacidad actual no sea superior a la maxima

	public Cafetera(int capacidadMax, int capacidadAct) {

		if (capacidadActual > capacidadMaxima) {

			capacidadActual = capacidadMaxima;

		}

	}

	// Getters

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	// Declaración de los metodos

	public int llenarCafetera() {

		capacidadActual = capacidadMaxima;

		// se equiparan la cantidad actual y la cantidad maxima

		return capacidadActual;
	}

	public void servirTaza(int taza) {

		if (taza > capacidadActual) {

			vaciarCafetera();

		} else
			capacidadActual -= taza;

		// cantidadActual - tazaServida = cantidadActual

	}

	public void vaciarCafetera() {

		capacidadActual = 0;

	}

	public void agregarCafe(int relleno) {

		capacidadActual += relleno;
		
		// capacidadActual + relleno = capacidad una vez ya rellenada
		

	}

}
