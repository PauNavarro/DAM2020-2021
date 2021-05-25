package dataBaseTest;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrarUsu {

	public static void registrar() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conectar = DriverManager.getConnection("jdbc:mysql://127.0.0.1/testdb", "root", "");
			Statement s = conectar.createStatement();

			ResultSet chkUsu = s.executeQuery(

					"Select * " + "from usuarios " + "where NombreUsu='" + Formulario.txtFUsu.getText() + "';"

			);

			if (!chkUsu.next()) {

				int insertarUsu = s.executeUpdate(

						"insert into usuarios (NombreUsu,Passwd) " + "values ('" + Formulario.txtFUsu.getText() + "', '"
								+ Formulario.txtFContra.getText() + "')");

				if (insertarUsu > 0) {
					Formulario.lblConfirmacion.setForeground(Color.black);
					Formulario.lblConfirmacion.setText("El usuario ha sido registrado");
					Formulario.txtFContra.setText("");
					Formulario.txtFUsu.setText("");

				}

				conectar.close();
			} else {

				Formulario.lblConfirmacion.setForeground(Color.black);
				Formulario.lblConfirmacion.setText("Ya existe un usuario con este nombre y contraseña.");
				Formulario.txtFContra.setText("");
				Formulario.txtFUsu.setText("");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
