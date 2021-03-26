package ejercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		
		System.out.println("Dame las notas del alumno 2");
		Notas notasAlum2 = new Notas();
		
		notasAlum2.leer();
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno("Pepe", 02, notasAlum2);
		
		System.out.println("Dame los datos del alumno 1");
		
		System.out.println("Nombre:");
		alumno1.setNombre(c.next());
		System.out.println("Numero de expediente:");
		alumno1.setNumExpediente(c.nextInt());
		System.out.println("Dame las notas del alumno 1");
		Notas notasAlum1 = new Notas();
		
		notasAlum1.leer();
		
		alumno1.setNotasAlumno(notasAlum1);
		
		System.out.println(alumno1.toString());
		System.out.println();
		System.out.println(alumno2.toString());
		
		c.close();
	}

}
