package ejercicio_4;

/**
 * 
 * @author Pau Navarro
 * @since 2021/04/14
 *
 */

public class Electrodomestico {

	/**
	 * El precio base es un doble representado en €
	 */
	private double precioBase = 100;
	/**
	 * El color es un String, de los cuales son validos : "blanco", "negro", "rojo", "azul", "gris" .
	 * No importan las mayusculas o minusculas
	 */
	private String color = "blanco";
	/**
	 * El peso es un doble representado en Kg
	 */
	private double peso = 5;
	/**
	 * El consumo energetico es un char, de los cuales son validos los caracteres "A", "B", "C", "D", "E", "F"
	 */
	private String consumoEnergetico;

	// ---- Getters y Setters ---- //

	/**
	 * Metodo para obtener el precio base guardado
	 * 
	 * @return precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Metodo para alternar el precio base
	 * @param precioBase es el precio base que se desea poner
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * Metodo para obtener el color guardado
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo para alternar el color
	 * @param color es el color que se desea aplicar
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo para obtener el peso guardado
	 * 
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo para alterar el peso
	 * @param peso es el peso que se desea guardar
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/**
	 * Metodo para obtener el consumo energetico
	 * 
	 * @return consumo Energetico
	 */
	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	/**
	 * Metodo para alterar el consumo energetico
	 * @param consumoEnergetico es el consumo energetico que deseas guardar
	 */
	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	// ---- Constructores ---- //
	
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {}
	
	/**
	 * Constructor solo con el precio base y el peso
	 * @param precioBase es el precio con el que deseas iniciar objeto
	 * @param peso es el peso inicial del objeto
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	/**
	 * Constructor parametrizado con todos los parametros disponibles y con dos metodos de control.
	 * @param precioBase es el precio con el que deseas iniciar objeto
	 * @param peso es el peso inicial del objeto
	 * @param color es el color con el que se iniciara el objeto
	 * @param string es el consumo con el que se iniciara el objeto
	 * @see comprobarConsumo
	 * @see comprobarColor
	 * 
	 */
	public Electrodomestico(double precioBase, String color, double peso, String string) {
		this.precioBase = precioBase;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = string;
		comprobarConsumo(string);
		comprobarColor(color);
	}

	// ---- Metodo para comprobar el consumo ---- //

	/**
	 * Metodo de control para comprobar que el char del consumo es correcto, si el consumo introducido es igual a :
	 * <ul>
	 * 	<li>"A"</li>
	 * 	<li>"B"</li>
	 * 	<li>"C"</li>
	 * 	<li>"D"</li>
	 *	<li>"E"</li>
	 *	<li>"F"</li>
	 * </ul>
	 * 
	 * En caso de que el consumo no sea correcto se aplicara un consumo de "F" como consumo por defecto.
	 * @param string Es el consumo a comprobar
	 */
	private void comprobarConsumo(String string) {

		boolean consumoCorrecto = false;

		String consumoStr = string + "";

		String consumoV[] = new String[] { "A", "B", "C", "D", "E", "F" };

		for (int i = 0; i < consumoV.length; i++) {
			if (consumoStr.equalsIgnoreCase(consumoV[i]) && consumoCorrecto == false) {

				consumoCorrecto = true;

			}
		}

		if (!consumoCorrecto) {
			consumoStr = "F";
		}

		;
		
		this.consumoEnergetico = consumoStr;
	}

	// ---- Metodo para comprobar el color ---- //

	/**
	 * Metodo de control para comprobar que el color introducido es correcto
	 * @param color Es el color que se desea comprobar, solo se aceptan como validos los colores listados a continuación:
	 * <ul>
	 * 	<li>"blanco"</li>
	 * 	<li>"negro"</li>
	 * 	<li>"rojo"</li>
	 * 	<li>"azul"</li>
	 *	<li>"gris"</li>
	 * </ul>
	 * 
	 * En caso de que el color introducido no sea correcto se aplicara el color blanco como color por defecto. 
	 */
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

	/**
	 * Metodo para establecer el precio final basandose en el consumo energetico y el peso
	 * 
	 * @return precioFinal - El precio final es un doble sacado de añadir los incrementos necesarios a el precio base
	 */
	public double precioFinal() {
		
		double precioFinal;
		int incEnerg = 0;
		int incPeso = 0;
		String consumoStr = consumoEnergetico+"";

		String tablaEnergia[][] = new String[][] { { "a", "b", "c", "d", "e", "f" },
				{ "100", "80", "60", "50", "30", "10" } };

		for (int i = 0; i < tablaEnergia.length; i++) {
			if (consumoStr.equalsIgnoreCase(tablaEnergia[i][0])) {

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

		return precioFinal = precioBase + incPeso + incEnerg;
		
	}

}