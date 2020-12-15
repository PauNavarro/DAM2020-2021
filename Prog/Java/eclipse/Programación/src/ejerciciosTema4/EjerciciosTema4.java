package ejerciciosTema4;

import java.util.Scanner;

public class EjerciciosTema4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("|==============================================================================================|");
			System.out.println("| 1) Sumar dos numeros                           10) Realiza el sumatorio de los N numeros     |");
			System.out.println("| 2) Restar dos numeros                          11) Muestra todos los numeros entre n1 y n2   |");
			System.out.println("| 3) Multiplicar dos numeros                     12) Calcula el volumen de un cilindro         |");
			System.out.println("| 4) Dividir dos numeros                         13) Calcula el área de un cilindro            |");
			System.out.println("| 5) Sacar el maximo entre dos numeros           14) Calcula la suma de los N primeros impares |");
			System.out.println("| 6) Imprimir una piramide                       15) Producto de N numeros consecutivos        |");
			System.out.println("| 7) Comprobar numeros Primos                    16) Imprime un rectangulo                     |");
			System.out.println("| 8) Mostrar el factorial de un numero           17) Imprime un Triangulo                      |");
			System.out.println("| 9) Suma desde el 1 hasta un numero N           18) Cuenta la cantidad de cifras de un numero |");
			System.out.println("|==============================================================================================|");
			System.out.println("| 19) Darle la vuelta a un numero                28)                                           |");
			System.out.println("| 20) Buscar en que posiciones aparece un numero 29)                                           |");
			System.out.println("| 21) Imprime una L                              30)                                           |");
			System.out.println("| 22) Suma las cifras pared de un numero         31)                                           |");
			System.out.println("| 23)                                            32)                                           |");
			System.out.println("| 24)                                            33)                                           |");
			System.out.println("| 25)                                            34)                                           |");
			System.out.println("| 26)                                            35)                                           |");
			System.out.println("| 27)                                            36)                                           |");
			System.out.println("|==============================================================================================|");
		
			System.out.println("0) Cerrar el programa");
			
			opcion = teclado.nextInt();

			switch (opcion) {

			case 0:
				break;

			case 1:
				System.out.println("El resultado es = " + Funciones.suma());
				break;

			case 2:
				System.out.println("El resultado es = " + Funciones.resta());
				break;

			case 3:
				System.out.println("El resultado es = " + Funciones.multiplicar());
				break;

			case 4:
				System.out.println("El resultado es = " + Funciones.dividir());
				break;

			case 5:
				System.out.println("El numero mas alto es = " + Funciones.numeroMaximo());
				break;

			case 6:
				Funciones.imprimePiramide();
				break;

			case 7:
				Funciones.primo();
				break;

			case 8:
				System.out.println("El resultado es = " + Funciones.factorial());
				break;

			case 9:
				Funciones.sumarHastaN();
				break;

			case 10:
				Funciones.sumatorio();
				break;
				
			case 11:
				Funciones.mostrarRangoNumeros();
				break;
				
			case 12:
				System.out.println("El resultado es = " + Funciones.volumenCilindro() + "cm3");
				break;
				
			case 13:
				System.out.println("El resultado es = " + Funciones.areaCilindro() + "cm2");
				break;
				
			case 14:
				System.out.println("El resultado es = " + Funciones.sumaNumerosImpares());
				break;
				
			case 15:
				System.out.println("El resultado es = " + Funciones.rangoDeProductos());
				break;
				
			case 16:
				Funciones.imprimeRectangulo();
				break;
				
			case 17:
				Funciones.imprimerTriangulo();
				break;
			
			case 18:
				Funciones.cuentaCifras();
				break;
				
			case 19:
				Funciones.volteaNumeros();
				break;
				
			case 20:
				Funciones.BuscaCifra();
				break;
				
			case 21:
				Funciones.ImprimeL();
				break;
				
			case 22:
				Funciones.SumaCifrasPares();
				break;
				
			default:
				System.out.println("La opcion introducida no es valida, introduce una opcion valida");
			}

			if (opcion != 0) {
				System.out.println();
				System.out.println("Pulsa 0 para finalizar el programa, cualquier otro numero te devolvera al menu");
				opcion = teclado.nextInt();
			}
		
		} while (opcion != 0);

		System.out.println("El programa se va a detener, muchas gracias por usarlo.");

		teclado.close();

	}

}