/**
 * 
 */
package contador;

/**
 * @author Pau Navarro
 *
 */
public class Contador {

	private int cont;

	public Contador() {

	}

	public Contador(int valorInicial) {

		if (valorInicial > 0) {

			cont = valorInicial;

		} else {

			cont = 0;

		}

	}

	public Contador(Contador cont1) {
		setCont(cont1.getCont());
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void incrementar(int aIncrementar) {

		setCont(getCont() + aIncrementar);

	}

	public void decrementar(int aRestar) {

		if (getCont() - aRestar >= 0) {

			setCont(getCont() - aRestar);

		} else {

			setCont(0);

		}

	}

}
