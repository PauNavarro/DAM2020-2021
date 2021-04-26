package windowBuilderTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaTest {

	private JFrame frmMiVentana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTest window = new VentanaTest();
					window.frmMiVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiVentana = new JFrame();
		frmMiVentana.getContentPane().setBackground(Color.DARK_GRAY);
		
		JPanel panel = new JPanel();
		frmMiVentana.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		frmMiVentana.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnA_5_2 = new JButton("A5");
		panel_3.add(btnA_5_2, BorderLayout.NORTH);
		
		JButton btnA_2_2 = new JButton("A2");
		panel_3.add(btnA_2_2, BorderLayout.SOUTH);
		
		JButton btnA_3_2 = new JButton("A3");
		panel_3.add(btnA_3_2, BorderLayout.WEST);
		
		JButton btnA_4_2 = new JButton("A4");
		panel_3.add(btnA_4_2, BorderLayout.EAST);
		
		JButton btnA_1_2 = new JButton("A1");
		panel_3.add(btnA_1_2, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		frmMiVentana.getContentPane().add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnA_5_3 = new JButton("A5");
		panel_4.add(btnA_5_3, BorderLayout.NORTH);
		
		JButton btnA_2_3 = new JButton("A2");
		panel_4.add(btnA_2_3, BorderLayout.SOUTH);
		
		JButton btnA_3_3 = new JButton("A3");
		panel_4.add(btnA_3_3, BorderLayout.WEST);
		
		JButton btnA_4_3 = new JButton("A4");
		panel_4.add(btnA_4_3, BorderLayout.EAST);
		
		JButton btnA_1_3 = new JButton("A1");
		panel_4.add(btnA_1_3, BorderLayout.CENTER);
		frmMiVentana.setTitle("Mi ventana");
		frmMiVentana.setBounds(100, 100, 450, 300);
		frmMiVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
