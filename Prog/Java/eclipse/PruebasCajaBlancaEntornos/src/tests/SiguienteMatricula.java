package tests;

public class SiguienteMatricula {

	public static void main(String[] args) {

		// Matricula actual
		String[] matriculas = { "0485FPR", "9999FPR", "9999FPZ", "0013FZZ", "9999FZZ", "0000FZS", "9999ZBZ" };

		// Imprimir matrículas siguientes
		for (int i = 0; i < matriculas.length; i++) {

			System.out.println(matriculas[i] + " - " + siguienteMatricula(matriculas[i]));
		}
	}

	public static String siguienteMatricula(String matricula) {

		String numeroRes = "";
		String letrasRes = "";

		String numero = matricula.substring(0, 4);
		String letras = matricula.substring(4);

		// Si es el último número...
		if (numero.equals("9999")) {

			// Cambiar número
			numeroRes = "0000";

			// Cambiar letras
			letrasRes = siguientesLetras(letras);
		} else {
			// Si NO es el último número

			// Cambiar número
			numeroRes = siguienteNumero(numero);

			// Mismas letras
			letrasRes = letras;
		}

		return numeroRes + letrasRes;
	}

	public static String siguienteNumero(String numero) {

		int numeroCalculo = Integer.parseInt(numero) + 1;
		String numeroRes = Integer.toString(numeroCalculo);

		if (numeroRes.length() < 4) {

			int n = 4 - numeroRes.length();
			for (int i = 0; i < n; i++) {
				numeroRes = "0" + numeroRes;
			}
		}

		return numeroRes;
	}

	public static String siguientesLetras(String letras) {

		String abc = "BCDFGHJKLMNPQRSTVWXYZ";
		char[] let = letras.toCharArray();
		String res = "";
		int index;

		for (int i = let.length - 1; i > 0; i--) {

			if (let[i] == 'Z') {

				let[i] = 'B';

				if (i == 1) {
					index = abc.indexOf(let[0]);
					let[0] = abc.charAt(index + 1);
				}
			} else {
				index = abc.indexOf(let[i]);
				let[i] = abc.charAt(index + 1);
				break;
			}
		}

		// Convertir el vector de letras a String
		for (int i = 0; i < let.length; i++) {
			res += let[i];
		}

		return res;
	}
}