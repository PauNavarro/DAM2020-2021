package extra;

import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String horaIntr;
		String horaIntrhora;
		String horaIntrmin;
		int horaFin;
		String momDia;


		do {

			System.out.println("Dame la hora (por ejemplo 00:00)");
			horaIntr = sc.next();

			if (horaIntr.length() != 5)

				System.out.println("La hora introducida no es valida");

		} while (horaIntr.length() != 5);

		horaIntrhora = horaIntr.substring(0, 2);
		horaIntrmin = horaIntr.substring(3);

		horaFin = Integer.parseInt(horaIntrhora);

		if (horaFin >= 12)
			momDia = "P.M";
		else
			momDia = "A.M";

		if (horaFin > 12) {
			horaFin -= 12;
		}

		if (horaFin == 00)
			horaFin = 12;

		if (horaFin == 12 && horaIntrmin.equals("00")) {
			if (momDia.equals("A.M"))
				System.out.println(horaFin + ":" + horaIntrmin + " " + momDia + " (midnight)");
			else
				System.out.println(horaFin + ":" + horaIntrmin + " " + momDia + " (midday)");
		} else if (horaFin < 10)
			System.out.println("0" + horaFin + ":" + horaIntrmin + " " + momDia);
		else
			System.out.println(horaFin + ":" + horaIntrmin + " " + momDia);

		sc.close();
	}
}
