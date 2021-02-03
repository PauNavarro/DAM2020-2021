package tema6POO;

public class PrincipalPersona {

	public static void main(String[] args) {

		String nombre1 = "pepe";
		String nombre2 = "Luis";
		String nombre3 = "Maria";

		Persona persona1 = new Persona(nombre1);
		Persona persona2 = new Persona(nombre2);
		Persona persona3 = new Persona(nombre3);

		persona1.setEdad(10);
		persona2.setEdad(25);
		persona3.setEdad(20);

		System.out.println(
				"La persona1 se llama: " + persona1.getNombre() + " y tiene : " + persona1.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona2.getNombre() + " y tiene : " + persona2.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona3.getNombre() + " y tiene : " + persona3.getEdad() + " años");

		// ------------------------------------------------------- //

		System.out.println();
		System.out.println();

		// ------------------------------------------------------- //

		persona2.setEdad(persona2.getEdad() + persona3.getEdad() - persona1.getEdad());

		System.out.println(
				"La persona1 se llama: " + persona1.getNombre() + " y tiene : " + persona1.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona2.getNombre() + " y tiene : " + persona2.getEdad() + " años");
		System.out.println(
				"La persona1 se llama: " + persona3.getNombre() + " y tiene : " + persona3.getEdad() + " años");

	}

}
