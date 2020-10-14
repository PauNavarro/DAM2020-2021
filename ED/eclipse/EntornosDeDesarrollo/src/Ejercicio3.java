import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		
		int A = teclado.nextInt();
		
		if(A % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
			
		teclado.close();
	}
}
