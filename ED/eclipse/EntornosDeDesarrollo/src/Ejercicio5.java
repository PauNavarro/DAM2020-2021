import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Sabiendo la nota de el primer examen, el cual vale un 40%, calcula la nota que necesitamos
		// sacar en el segundo (60%), para sacar la nota final deseada

		Scanner teclado = new Scanner(System.in);
		
		 System.out.print("Introduce la nota del primer examen: ");
		
		 	double nota1 = teclado.nextInt();

		 System.out.print("¿Qué nota quieres sacar en el trimestre? ");
		 
		 	double notaFinal = teclado.nextInt();
		      
		 	double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
		    
		 System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
	
		 teclado.close();
	}
}