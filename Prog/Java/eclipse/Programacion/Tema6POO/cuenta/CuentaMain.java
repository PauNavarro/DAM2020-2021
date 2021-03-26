package cuenta;

import java.util.Scanner;

public class CuentaMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;

		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre : ");
		nombre = sc.nextLine();
		System.out.print("Número de cuenta : ");
		numero = sc.nextLine();
		System.out.print("Tipo de interes : ");
		tipo = sc.nextDouble();
		System.out.print("Saldo: ");
		importe = sc.nextDouble();
		cuenta1.setNombreCliente(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setInteres(tipo);
		cuenta1.setSaldo(importe);

		Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);
		Cuenta cuenta3 = new Cuenta(cuenta1);

		System.out.println("Datos de la cuenta 1");
		System.out.println("Nombre del titular: " + cuenta1.getNombreCliente());
		System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta1.getInteres());
		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println();

		cuenta1.ingreso(4000);

		System.out.println("Saldo: " + cuenta1.getSaldo());
		System.out.println("Datos de la cuenta 2");
		System.out.println("Nombre del titular: " + cuenta2.getNombreCliente());
		System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta2.getInteres());
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		System.out.println("Datos de la cuenta 3");
		System.out.println("Nombre del titular: " + cuenta3.getNombreCliente());
		System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
		System.out.println("Tipo de interés: " + cuenta3.getInteres());
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();

		cuenta3.transferencia(cuenta2, 50);

		System.out.println("Saldo de la cuenta 2");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();
		System.out.println("Saldo de la cuenta 3");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();
	
		
		sc.close();
	}

}
