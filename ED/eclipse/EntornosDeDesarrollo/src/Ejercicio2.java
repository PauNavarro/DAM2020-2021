import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		//Petición de valores
		
		System.out.println("Dame el primer numero");
		
		int A = teclado.nextInt();
		
		System.out.println("Dame el Segundo numero");
		
		int B = teclado.nextInt();
		
		System.out.println("Dame la operación que quieres realizar, 1=Suma, 2=Resta, 3=Multiplicación, 4=Division y resto");
		
		int Operacion = teclado.nextInt();
		
		//Realización de las operaciones
		if(Operacion>4)
			System.out.println("El operador introducido no es valido");
		if(Operacion==1) {
			int resultado =	A + B;
			System.out.println("El resultado de la suma es " + resultado);
		} else 
			
		{if(Operacion==2) {
			int resultado = A - B;
			System.out.println("El resultado de la resta es " + resultado);
		} else
			
		{if(Operacion==3) {
			int resultado = A * B;
			System.out.println("El resultado de la multiplicación es " + resultado);
		} else 
			
		{if(Operacion==4) {
			int resultado = A / B;
			int resto = A % B;
			System.out.println("El resultado de la Division es " + resultado + " y su resto "+ resto);
		}}}}
			
		teclado.close();
	}
}
