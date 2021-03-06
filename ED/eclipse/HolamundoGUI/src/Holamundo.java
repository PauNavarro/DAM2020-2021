import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Holamundo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Holamundo frame = new Holamundo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Holamundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHolaMundo = new JButton("Hola Mundo");
		btnHolaMundo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String texto = textField.getText();
			
			lblLabel .setText(texto);
			
			}
		});
		btnHolaMundo.setBounds(148, 183, 125, 30);
		contentPane.add(btnHolaMundo);
		
		textField = new JTextField();
		textField.setBounds(148, 238, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblLabel = new JLabel();
		lblLabel.setBounds(148, 269, 125, 14);
		contentPane.add(lblLabel);
	}
}
