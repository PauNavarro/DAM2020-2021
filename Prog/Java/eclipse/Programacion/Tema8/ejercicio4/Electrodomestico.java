/**
 * 
 */
package ejercicio4;

/**
 * @author PauNavarro
 * 
 *         Github : https://github.com/PauNavarro
 *
 */

public class Electrodomestico {

	private double precioBase = 100;
	private String color = "blanco";
	private double peso = 5;
	private String consumoEnergetico = "F";

	// ---- Getters y Setters ---- //

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	// ---- Metodo para comprobar el consumo ---- //

	private void comprobarConsumo(char consumoChar) {

		boolean consumoCorrecto = false;

		String consumoStr = consumoChar + "";

		String consumoV[] = new String[] { "A", "B", "C", "D", "E", "F" };

		for (int i = 0; i < consumoV.length; i++) {
			if (consumoStr.equals(consumoV[i]) && consumoCorrecto == false) {

				consumoCorrecto = true;

			}
		}

		if (!consumoCorrecto) {
			consumoStr = "F";
		}

		this.consumoEnergetico = consumoStr;
	}

	// ---- Metodo para comprobar el color ---- //

	private void comprobarColor(String color) {

		boolean colorCorrecto = false;

		String colorV[] = new String[] { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colorV.length; i++) {
			if (color.equalsIgnoreCase(colorV[i]) && colorCorrecto == false) {

				colorCorrecto = true;

			}
		}

		if (!colorCorrecto) {
			color = "blanco";
		}
		this.color = color;

	}

	// ---- Metodo para establecer el precio final --- //

	public void precioFinal() {

		int precioFinal;
		int incEnerg;
		int incPeso;

		String tablaEnergia[][] = new String[][] { { "a", "b", "c", "d", "e", "f" },
				{ "100", "80", "60", "50", "30", "10" } };

		for (int i = 0; i < tablaEnergia.length; i++) {
			if (consumoEnergetico.equalsIgnoreCase(tablaEnergia[i][0])) {

				incEnerg = Integer.parseInt(tablaEnergia[1][i]);

			}
		}

		int tablaPeso[] = new int[] { 10, 50, 80, 100 };

		if (peso <= 19) {
			incPeso = tablaPeso[0];
		} else if (peso >= 20 && peso <= 49) {
			incPeso = tablaPeso[1];
		} else if (peso >= 50 && peso <= 79) {
			incPeso = tablaPeso[2];
		} else if (peso > 79) {
			incPeso = tablaPeso[3];
		}

	}

}