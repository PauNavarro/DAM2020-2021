/**
 * 
 */
package ejercicio1;

/**
 * @author Pau Navarro
 *
 */
public class Main {

public static void main(String[] args) {
		
		Producto S = new Software('B', "Juego", "ProgramaJuegos");
		Producto H = new Hardware('A', "Raton", true);
		
		char sCodigo = S.getCodigo();
		char hCodigo = H.getCodigo();
		
		System.out.println(S.getPrecio(sCodigo));
		System.out.println(H.getPrecio(hCodigo));
		
	}

	
}
