package snake;

import java.awt.event.KeyEvent;

public class Movimiento {

	public static int[] movimiento(int pulsacion, int estadoPartida) {

		// La posicion 0 contiene X, la 1 contiene Y

		int[] xY = new int[3];

		xY[0] = Snake.getX();
		xY[1] = Snake.getY();

		int ultimoX = Snake.getUltimoX();
		int ultimoY = Snake.getUltimoY();

		if (pulsacion == KeyEvent.VK_D) {

			if (ultimoX == xY[0] + 40) {

				xY[0] -= 40;

			} else {

				xY[0] += 40;
			}

			if (ultimoX + 40 == 840) {

				estadoPartida = 1;

			}

		}

		if (pulsacion == KeyEvent.VK_A) {

			if (ultimoX == xY[0] - 40) {

				xY[0] += 40;

			} else {

				xY[0] -= 40;

			}

			if (ultimoX - 40 == 0) {

				estadoPartida = 1;

			}

		}

		if (pulsacion == KeyEvent.VK_W) {

			if (ultimoY == xY[1] - 40) {

				xY[1] += 40;

			} else {

				xY[1] -= 40;

			}

			if (ultimoY + 40 == 840) {

				estadoPartida = 1;

			}

		}

		if (pulsacion == KeyEvent.VK_S) {

			if (ultimoY == xY[1] + 40) {

				xY[1] -= 40;

			} else {

				xY[1] += 40;

			}

			if (ultimoY - 40 == 0) {

				estadoPartida = 1;

			}

		}

		xY[2] = estadoPartida;

		return xY;
	}

}
