package ejercicio2;

public class Revista extends Publicacion {

	private int numero;

	public Revista(int codigo, String year, boolean prestado, int numero) {
		super(codigo, year, prestado);
		this.setNumero(numero);
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + " Atributos heredados=" + super.toString() + "]";
	}
	
}
