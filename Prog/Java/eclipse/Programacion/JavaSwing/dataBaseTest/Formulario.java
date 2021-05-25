package dataBaseTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario {

	JFrame frame;
	static	JTextField txtFContra;
	static JTextField txtFUsu;
	static	JLabel lblConfirmacion;
	static	JButton btnLogIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("testDataBase");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 42, 167, 14);
		frame.getContentPane().add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 154, 167, 14);
		frame.getContentPane().add(lblContrasea);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RegistrarUsu.registrar();

			}
		});
		btnRegistrarse.setBounds(50, 227, 167, 23);
		frame.getContentPane().add(btnRegistrarse);

		txtFContra = new JTextField();
		txtFContra.setBounds(10, 179, 167, 20);
		frame.getContentPane().add(txtFContra);
		txtFContra.setColumns(10);

		txtFUsu = new JTextField();
		txtFUsu.setBounds(10, 67, 167, 20);
		frame.getContentPane().add(txtFUsu);
		txtFUsu.setColumns(10);

		lblConfirmacion = new JLabel("");
		lblConfirmacion.setBounds(216, 179, 208, 37);
		frame.getContentPane().add(lblConfirmacion);

		btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				LogIn.login();

			}
		});
		btnLogIn.setBounds(216, 227, 167, 23);
		frame.getContentPane().add(btnLogIn);
	}
}
