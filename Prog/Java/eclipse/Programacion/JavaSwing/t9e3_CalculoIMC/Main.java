package t9e3_CalculoIMC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	private JTextField pesoTextField;
	private JTextField estaturaTextField;
	private JLabel labelImc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Main window = new Main();
					window.frame.setVisible(true);
					window.frame.setResizable(false);

				} catch (Exception e) {

					e.printStackTrace();

				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnCalcularImc = new JButton("Calcular IMC");
		btnCalcularImc.setBounds(305, 174, 127, 44);
		btnCalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularIMC();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnCalcularImc);

		JLabel lblMasakg = new JLabel("Masa (Kg)");
		lblMasakg.setBounds(10, 28, 86, 21);
		frame.getContentPane().add(lblMasakg);

		pesoTextField = new JTextField();
		pesoTextField.setBounds(10, 60, 86, 20);
		frame.getContentPane().add(pesoTextField);
		pesoTextField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Estatura (cm)");
		lblNewLabel.setBounds(10, 101, 86, 14);
		frame.getContentPane().add(lblNewLabel);

		estaturaTextField = new JTextField();
		estaturaTextField.setBounds(10, 126, 86, 20);
		frame.getContentPane().add(estaturaTextField);
		estaturaTextField.setColumns(10);

		labelImc = new JLabel();
		labelImc.setBounds(10, 174, 285, 44);
		frame.getContentPane().add(labelImc);

	}

	/**
	 * Calcula el IMC
	 */

	private void calcularIMC() {
		String imc;

		double peso = Double.parseDouble(pesoTextField.getText());
		double alturaCentis = Double.parseDouble(estaturaTextField.getText());
		double alturaMetros = alturaCentis / 100;

		System.out.println(alturaCentis + " - altura cm");
		System.out.println(peso + " - peso");
		System.out.println(alturaMetros + " - altura Metros");

		imc = peso / Math.pow(alturaMetros, 2) + "";

		System.out.println(imc);

		labelImc.setText("Tu IMC es = " + imc);
	}

}
