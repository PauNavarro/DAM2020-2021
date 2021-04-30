package ejercicio2;

public class Main {

	public static void main(String[] args) {

		Publicacion[] arrPubli = new Publicacion[5];
		
		arrPubli[0] = new Libro(01, "2000", true, "Rene ribera");
		arrPubli[1] = new Libro(01, "2001", true, "Rene ribera");
		arrPubli[2] = new Libro(01, "2002", true, "Rene ribera");
		arrPubli[3] = new Revista(01, "2000", true, 1);
		arrPubli[4] = new Revista(01, "2000", true, 2);
		
		for (int i = 0; i < arrPubli.length; i++) {
			System.out.println(arrPubli[i]);
		}

		
		
	}

}
