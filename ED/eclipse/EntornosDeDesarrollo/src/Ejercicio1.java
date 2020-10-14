import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el primer numero");
		
		int A = teclado.nextInt();
		
		System.out.println("Dame el segundo numero");
		
		int B = teclado.nextInt();
			
		A = A + B;
		B = A - B;
		A =	A - B;
		
		System.out.println("Despues del cambio A: " + A + ", B: "+ B);
		
		teclado.close();
	}
}