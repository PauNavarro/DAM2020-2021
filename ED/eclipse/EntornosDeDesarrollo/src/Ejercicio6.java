import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Suma todos los numeros introducidos hasta que se introduzca un -1, entonces
		// para y imprime el resultado.

		Scanner teclado = new Scanner(System.in);


		int N1 = 0;
		int N2 = 0;
		double suma = 0;
		double media = 0;
		boolean masnumeros = true;
		
		System.out.println("Introduce los numeros deseados para calcular su media aritmetica, para finalizar introduzca -1");
		
		while (masnumeros) {
			
			N1 = teclado.nextInt();
			
			if (N1 == -1) {
				masnumeros = false;
			}
			else {
				suma = N2 + N1;
				suma / media ;
			}
		}}}
	



