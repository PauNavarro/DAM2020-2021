package dataBaseTest;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {

	public static void login() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1/testdb", "root", "");
			Statement s = conectar.createStatement();
			ResultSet chkUsu = s.executeQuery(

					"Select * " + "from usuarios " + "where Passwd='" + Formulario.txtFContra.getText() + "' AND NombreUsu='"
							+ Formulario.txtFUsu.getText() + "';"

					);

			if (chkUsu.next()) {
				Formulario.lblConfirmacion.setForeground(Color.green);
				Formulario.lblConfirmacion.setText("Login correcto");
				Formulario.txtFContra.setText("");
				Formulario.txtFUsu.setText("");

			} else {
				Formulario.lblConfirmacion.setForeground(Color.red);
				Formulario.lblConfirmacion.setText("Login incorrecto");
				Formulario.txtFContra.setText("");
				Formulario.txtFUsu.setText("");

			}

			conectar.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
