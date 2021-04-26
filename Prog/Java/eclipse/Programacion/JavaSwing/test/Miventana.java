package test;

import java.awt.*;

import javax.swing.*;

public class Miventana extends JFrame {

	public Miventana() {

		// Inicializar la ventana

		JFrame frame = new JFrame("Test");

		frame.setVisible(true);

		frame.setSize(300, 300);

		frame.setLocation(500, 500);
		
		frame.setTitle("Esto es una ventana!");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton miBoton = new JButton("Boton 1");

		Container cont = frame.getContentPane();

		cont.setLayout(new BorderLayout());
		cont.add(miBoton, BorderLayout.SOUTH);

	}

}
