package pongTest;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pong extends JPanel implements KeyListener {

	private static final long serialVersionUID = 3219779922354618365L;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;

	//Rectangulo inferior
	int xRectAb = 1;
	int xaRectAb = 0;
	int contAb = xRectAb;
	int[] posicionRectAb = new int[150];

	/**Rectangulo superior 

	int xRectAr = 1;
	int xaRectAr = 0;
	int contAr = xRectAr;
	int[] posicionRectAr = new int[150];
	 */
	int pulsacion;
	boolean colision = false;
	int parar = 0;
	int puntuacion = 0;

	public void movimientoRectAbajo() {

		if (xRectAb + xaRectAb >= getWidth() - 150) {
			xaRectAb = 0;
		}
		if (pulsacion == KeyEvent.VK_A) {

			if (xRectAb + xaRectAb < 0) {
				xaRectAb = 0;
			} else {
				xaRectAb = -2;
			}
		}

		if (pulsacion == KeyEvent.VK_D) {
			if (xRectAb + xaRectAb >= getWidth() - 150) {
				xaRectAb = 0;
			} else {
				xaRectAb = 2;
			}
		}

		xRectAb = xRectAb + xaRectAb;

		int a = 1;

		for (int i = 0; i < posicionRectAb.length; i++) {
			posicionRectAb[i] = xRectAb + a;
			a++;
		}

	}


	private int[] movimientoPelota(int resultado[]) {

		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > getHeight() - 80) {

			for (int i = 0; i < posicionRectAb.length; i++) {
				if (x == posicionRectAb[i]) {
					ya = -1;
					puntuacion++;

				}
				if (y + ya > getHeight() - 30) {
					parar = 1;
					ya = -1;
				}
			}
		}

		if (y + ya > getHeight())
			parar = 1;

		x = (x + xa);
		y = (y + ya);

		resultado[0] = puntuacion;
		resultado[1] = parar;

		return resultado;

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.fillRoundRect(x, y, 30, 30, 30, 30);
		g.fillRect(xRectAb, getHeight() - 60, 150, 30);

	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Pong");
		Pong pong = new Pong();
		frame.add(pong);
		frame.setSize(800, 800);
		frame.setResizable(false);
		frame.addKeyListener(pong);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int[] resultado = new int[2];

		do {

			pong.movimientoPelota(resultado);
			//pong.movimientoRectArriba();
			pong.movimientoRectAbajo();
			pong.repaint();
			Thread.sleep(3);
		} while (resultado[1] == 0);

		JOptionPane.showMessageDialog(null, "Has conseguido " + resultado[0] + " puntos", "Has perdido",JOptionPane.ERROR_MESSAGE);

	}

	@Override
	public void keyPressed(KeyEvent evt) {

		pulsacion = evt.getKeyCode();

	}

	@Override
	public void keyReleased(KeyEvent evt) {

	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}

}
