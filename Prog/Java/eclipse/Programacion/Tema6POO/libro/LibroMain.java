package libro;

import java.io.ObjectInputStream.GetField;

public class LibroMain {

	public static void main(String[] args) {

		String titulo;
		String autor;
		int numEjemplares;
		int numeroPrestados;

		// --- //

		titulo = "El quijote";
		autor = "Cervantes";
		numEjemplares = 50;
		numeroPrestados = 5;

		// --- //

		Libro libro = new Libro(titulo, autor, numEjemplares, numeroPrestados);

		System.out.println("Autor            : " + libro.getAutor());
		System.out.println("Titulo del libro : " + libro.getTituloLibro());
		System.out.println("Nº ejemplares    : " + libro.getNumeroEjemplares());
		System.out.println("Nº prestados     : " + libro.getNumeroPrestados());
		System.out.println("Nº disponibles   : " + libro.getDisponibles());

		// --- //
		System.out.println();
		System.out.println();
		// --- //
		
		// -- Prestamo -- //

		if (libro.prestamo(10)) {

			System.out.println("Prestamo realizado con exito");

			System.out.println("Imprimiendo los datos del libro");

			System.out.println("Autor            : " + libro.getAutor());
			System.out.println("Titulo del libro : " + libro.getTituloLibro());
			System.out.println("Nº ejemplares    : " + libro.getNumeroEjemplares());
			System.out.println("Nº prestados     : " + libro.getNumeroPrestados());
			System.out.println("Nº disponibles   : " + libro.getDisponibles());

		} else {

			System.out.println("Error al realizar el prestamo, no hay suficientes unidades");

			System.out.println("Imprimiendo los datos del libro");

			System.out.println("Autor            : " + libro.getAutor());
			System.out.println("Titulo del libro : " + libro.getTituloLibro());
			System.out.println("Nº ejemplares    : " + libro.getNumeroEjemplares());
			System.out.println("Nº prestados     : " + libro.getNumeroPrestados());
			System.out.println("Nº disponibles   : " + libro.getDisponibles());

		}
		
		// --- //
		System.out.println();
		System.out.println();
		// --- //
		
		// -- Devolucion -- //
		
		if (libro.devolucion(5)) {

			System.out.println("Devolucion realizada con exito");

			System.out.println("Imprimiendo los datos del libro");

			System.out.println("Autor            : " + libro.getAutor());
			System.out.println("Titulo del libro : " + libro.getTituloLibro());
			System.out.println("Nº ejemplares    : " + libro.getNumeroEjemplares());
			System.out.println("Nº prestados     : " + libro.getNumeroPrestados());
			System.out.println("Nº disponibles   : " + libro.getDisponibles());

		} else {

			System.out.println("Error al realizar la devolucion, no se han prestado tantas unidades");

			System.out.println("Imprimiendo los datos del libro");

			System.out.println("Autor            : " + libro.getAutor());
			System.out.println("Titulo del libro : " + libro.getTituloLibro());
			System.out.println("Nº ejemplares    : " + libro.getNumeroEjemplares());
			System.out.println("Nº prestados     : " + libro.getNumeroPrestados());
			System.out.println("Nº disponibles   : " + libro.getDisponibles());

		}
	}

}
