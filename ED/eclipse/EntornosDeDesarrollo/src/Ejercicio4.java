import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el numero de niños");

		int A = teclado.nextInt();

		System.out.println("Dame el numero de niñas");

		int B = teclado.nextInt();

		int T = A + B;
		int PNiños;
		int PNiñas;

		PNiños = (int) ((A * 100) / T);
		PNiñas = (int) ((B * 100) / T);

		System.out
				.println("El porcentaje de niños es de " + PNiños + "% , El porcentaje de niñas es de " + PNiñas + "%");

		teclado.close();
	}

}
