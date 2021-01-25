package snek;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author PauNavarro
 * 
 *         Github: https://github.com/PauNavarro
 *
 */
public class Snake extends JPanel implements KeyListener {

	int posicionCabezaX = 400;
	int posicionCabezaY = 400;
	int posicionCabezaXa = 0;
	int posicionCabezaYa = 0;
	int longitud = 40;
	int ultimaLongitud = longitud;

	int posicionComidaX;
	int posicionComidaY;

	int pulsacion;

	public static void main(String[] args) throws InterruptedException {

		int contador = 0;

		JFrame frame = new JFrame("Snake");
		Snake snake = new Snake();
		frame.add(snake);

		// Definiendo el tamaño de la ventana y haciendo que no se pueda cambiar de
		// tamaño.

		frame.setSize(800, 800);
		frame.setResizable(false);

		frame.addKeyListener(snake);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		do {
			w
			snake.repaint();
			if (contador != 20) {
				contador++;
			} else {
				contador = 0;
				snake.movimientoSnake();
			}

			Thread.sleep(5);

		} while (true);

	}

	private void movimientoSnake() {

		if (posicionCabezaX + 40 > getWidth() - 40) {
			posicionCabezaXa = 0;
		}

		if (pulsacion == KeyEvent.VK_D) {

			posicionCabezaXa = 40;
			posicionCabezaYa = 0;

		}

		if (pulsacion == KeyEvent.VK_W) {

			posicionCabezaYa = 40;
			posicionCabezaXa = 0;

		}

		posicionCabezaX = posicionCabezaXa + posicionCabezaX;

	}

	@Override
	public void paint(Graphics g) {

		do {
			posicionComidaX = (int) (Math.random() * 801);
			posicionComidaY = (int) (Math.random() * 801);
		} while (longitud != ultimaLongitud);

		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.fillRoundRect(posicionCabezaX, posicionCabezaY, longitud, 40, 15, 15);
		g.fillRoundRect(posicionComidaX, posicionComidaY, 40, 40, 40, 40);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		pulsacion = e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
