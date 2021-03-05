package gente;

public class Coche {

	private String marca;
	private String color;
	private String modelo;

	public Coche(String marca, String color, String modelo) {

		this.marca  = marca;
		this.color  = color;
		this.modelo = modelo;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
