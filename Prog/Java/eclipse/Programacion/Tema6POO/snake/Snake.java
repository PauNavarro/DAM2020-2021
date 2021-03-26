package snake;

public class Snake {

	private static int x = 400;
	private static int y = 400;
	private static int ultimoX;
	private static int ultimoY;
	private static int vecesComidas;

	public Snake(int x, int y) {

		Snake.x = x;
		Snake.y = y;

	}

	public static int getUltimoX() {
		return ultimoX;
	}

	public static int getUltimoY() {
		return ultimoY;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Snake.ultimoX = Snake.x;
		Snake.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Snake.ultimoY = Snake.y;
		Snake.y = y;
	}

	public static int getVecesComidas() {
		return vecesComidas;
	}

	public static void setVecesComidas(int vecesComidas) {
		Snake.vecesComidas = vecesComidas;
	}

}
