package pongTest;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ventana extends JPanel {

	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	int xRect = 1;
	int xaRect = 1;
	int cont = xRect;

	public void movimientoRectBueno() {

	/**	if (KeyEvent.KEY_PRESSED == KeyEvent.VK_S)
			xaRect = 1;
*/
		/**if (KeyEvent.KEY_PRESSED == KeyEvent.VK_D)
			xaRect = -1;
*/
		if (xRect + xaRect < 0)
			xaRect = 1;

		if (xRect + xaRect > getWidth() - 150)
			xaRect = -1;

		xRect = xRect + xaRect;

	}

	private void movimientoPelota() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > getHeight() - 30)
			ya = -1;

		x = (x + xa);
		y = (y + ya);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.fillRoundRect(x, y, 30, 30, 30, 30);
		g.fillRect(xRect, 400, 150, 50);

	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Pong");
		Ventana game = new Ventana();
		frame.add(game);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		boolean continuar = true;

		while (continuar) {
			game.movimientoPelota();
			game.movimientoRectBueno();
			game.repaint();
			Thread.sleep(5);
		}
	}

}
