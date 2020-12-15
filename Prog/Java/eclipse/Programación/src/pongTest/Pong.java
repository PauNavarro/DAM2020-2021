package pongTest;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pong extends JPanel {

	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	int xRect = 1;
	int xaRect = 1;
	int cont = xRect;
	int[] posicionRect = new int[150];

	public void movimientoRect() {

		if (xRect + xaRect < 0)
			xaRect = 1;

		if (xRect + xaRect > getWidth() - 150)
			xaRect = -1;

		xRect = xRect + xaRect;

		int a = 1;

		for (int i = 0; i < posicionRect.length; i++) {
			posicionRect[i] = xRect + a;
			a++;
		}

	}

	private int movimientoPelota(int parar) {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > getHeight() - 80) {

			for (int i = 0; i < posicionRect.length; i++) {
				if (x == posicionRect[i])
					ya = -1;
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

		return parar;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.fillRoundRect(x, y, 30, 30, 30, 30);
		g.fillRect(xRect, getHeight()-60, 150, 30);

	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Pong");
		Pong pong = new Pong();
		frame.add(pong);
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int parar = 0;
		do {
			parar = pong.movimientoPelota(parar);
			pong.movimientoRect();
			pong.repaint();
			Thread.sleep(2);
		} while (parar == 0);
		
		JOptionPane.showMessageDialog(null, "Si","Has perdido", JOptionPane.ERROR_MESSAGE);
		
		
	}

}
