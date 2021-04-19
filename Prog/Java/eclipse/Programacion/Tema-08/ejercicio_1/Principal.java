package ejercicio_1;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Ramon", "12345678A", 28, true, 1400);
		Programador programador1 = new Programador("Pepe", "23456789B", 21, false, 1150, 215, "Python");
		
		System.out.println("// ------------ //");
		System.out.println("");
		System.out.println(empleado1);
		System.out.println("");
		System.out.println("// ------------ //");
		System.out.println("");
		System.out.println(programador1);
		System.out.println("");
		System.out.println("// ------------ //");
		
		programador1.mostrarMensaje("Mensaje de : " + programador1.getNombre());
		
		empleado1.mostrarMensaje("Mensaje de : " + empleado1.getNombre());
		
	}

}
