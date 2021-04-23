package Ejercicio0;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		MiembroUPV prof1 = new Profesor("Pepe", "A15", 2500);
		MiembroUPV estu1 = new Estudiante("Ramon", "3º", 10151225);

		prof1.menuIntranet();

		System.out.println("/ --- --- --- --- --- --- --- /");
		Thread.sleep(50);

		try {
			estu1.menuIntranet();
		} catch (java.util.NoSuchElementException e) {
			
		}

	}

}
