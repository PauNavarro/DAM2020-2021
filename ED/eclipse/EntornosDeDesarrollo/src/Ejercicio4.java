import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el numero de ni�os");

		int A = teclado.nextInt();

		System.out.println("Dame el numero de ni�as");

		int B = teclado.nextInt();

		int T = A + B;
		int PNi�os;
		int PNi�as;

		PNi�os = (int) ((A * 100) / T);
		PNi�as = (int) ((B * 100) / T);

		System.out
				.println("El porcentaje de ni�os es de " + PNi�os + "% , El porcentaje de ni�as es de " + PNi�as + "%");

		teclado.close();
	}

}
