/**
 * 
 */
package ejercicio4;

/**
 * @author PauNavarro
 * 
 *  Github : https://github.com/PauNavarro
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
		
		String coloresV[] = new String[] {"blanco","negro","rojo","azul",""};
		
		if (color.equals()) {
			
		}
		
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
	
	private boolean comprobarConsumo() {

		boolean consumoCorrecto = false;
		
		return consumoCorrecto;
	}
	
}
