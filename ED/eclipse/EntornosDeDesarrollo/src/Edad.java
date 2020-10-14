import java.util.Scanner;
public class Edad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad");

		int edad = teclado.nextInt();
		if(edad<18) {
		System.out.println("Tienes" + edad + "años, eres menor de edad");
	} else {
		if(edad>99){
		System.out.println("El rango de edades es de 0 a 99");
		           }else {
		       		System.out.println("Tienes " + edad + " años, eres Mayor de edad");
		           }
	}
		teclado.close();
	}
}
