package ejercicio1;

public interface IPrecios {

	double A = 100;
	double B = 50.3;
	double C = 150.5;

	default double getPrecio(char codigo) {

		double precio = 0;

		if (String.valueOf(codigo).equalsIgnoreCase("A")) {

			precio = A;

		} else if (String.valueOf(codigo).equalsIgnoreCase("B")) {

			precio = B;

		} else if (String.valueOf(codigo).equalsIgnoreCase("C")) {

			precio = C;

		}

		return precio;
	}
}
