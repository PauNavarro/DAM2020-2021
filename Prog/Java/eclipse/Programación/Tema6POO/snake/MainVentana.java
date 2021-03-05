package snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainVentana extends JPanel implements KeyListener {

	/**
	 * 
	 */

	private static int pulsacion;

	public static int getPulsacion() {
		return pulsacion;
	}

	public void setPulsacion(int pulsacion) {
		MainVentana.pulsacion = pulsacion;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * @author PauNavarro
	 * 
	 *         Github: https://github.com/PauNavarro
	 *
	 */

	public void paint(Graphics g) {

		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		// Añadiendo Antialiasing para evitar los bordes de sierra de la pelota

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Dibujando la serpiente
		
		g.fillRect(Snake.getX(), Snake.getY(), 40, 40);

	}

	public static void main(String[] args) throws InterruptedException {

		// Inicializar la ventana

		JFrame frame = new JFrame("Snake");
		MainVentana juego = new MainVentana();
		frame.add(juego);

		// Definiendo el tamaño de la ventana y haciendo que no se pueda cambiar de
		// tamaño.

		frame.setSize(900, 900);
		//frame.setResizable(false);

		frame.addKeyListener(juego);

		// Haciendo la ventana visible y añadiendo que se pueda cerrar.

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int estadoPartida = 0;
		
		do {
			
			
			int[] xY = Movimiento.movimiento(pulsacion, estadoPartida);
			int x = xY[0];
			int y = xY[1];
			estadoPartida = xY[2];
		
			Snake.setX(x);
			Snake.setY(y);

			juego.repaint();

			System.out.printf("%d%n", pulsacion);

			Thread.sleep(200);

		} while (estadoPartida == 0);
		
		JOptionPane.showMessageDialog(null, "Has muerto", "Has perdido",
				JOptionPane.ERROR_MESSAGE);


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
