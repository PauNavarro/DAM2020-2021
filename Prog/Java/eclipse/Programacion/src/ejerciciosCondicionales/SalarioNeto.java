package ejerciciosCondicionales;

import java.util.Scanner;

public class SalarioNeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Escribe un programa que calcula el salario neto semanal de un trabajador en
		// funci�n del n�mero de horas trabajadas y la tasa de impuestos de acuerdo a
		// las siguientes hip�tesis.

		double salarioHora;
		double salarioHoraExtra = 0;
		int horasTrabajadas;
		int horasTrabajadasAux;
		double salarioBruto = 0;
		double salarioNeto;
		double salarioBrutoAux;

		System.out.println("�Cuanto cobra a la hora?");
		salarioHora = teclado.nextDouble();

		System.out.println("�Cuantas horas ha trabajado?");
		horasTrabajadas = teclado.nextInt();
		horasTrabajadasAux = horasTrabajadas;

		// Calculo Horas

		if (horasTrabajadas >= 35) {
			horasTrabajadasAux = horasTrabajadasAux - 35;
			salarioHoraExtra = (salarioHora * 1.5) * horasTrabajadasAux;
		}

		// Calculo Salario

		salarioBruto = (salarioHora * horasTrabajadas) + salarioHoraExtra;
		salarioBrutoAux = salarioBruto;

		if (salarioBruto > 500) {
			salarioNeto = 500;
			salarioBruto = salarioBruto - 500;
			salarioNeto = 300 + salarioNeto;
			salarioBruto = salarioBruto - 400;
			salarioNeto = (salarioBruto - (salarioBruto * 0.45)) + salarioNeto;
		} else {
			salarioNeto = salarioBruto;
		}
		System.out.println("El salario Neto es de : " + salarioNeto + "� , y el bruto de : " + salarioBrutoAux + "�.");

		teclado.close();
	}
}