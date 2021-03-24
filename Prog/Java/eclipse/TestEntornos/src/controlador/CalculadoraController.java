package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import modelo.Calculadora;

public class CalculadoraController implements Initializable {
	// Atributos graficos FXML
	
	@FXML private Button boton_0,boton_1,boton_2,boton_3,boton_4,boton_5,boton_6,boton_7,boton_8,boton_9,boton_sum,boton_res,boton_X,boton_divi,boton_equal,boton_AC,boton_C;
	
	@FXML Label numeros;
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// Evento botones, apertura de ventanas
		boton_1.setOnMouseClicked((event) -> pulsarNumero("1"));
		boton_2.setOnMouseClicked((event) -> pulsarNumero("2"));
		boton_3.setOnMouseClicked((event) -> pulsarNumero("3"));
		boton_4.setOnMouseClicked((event) -> pulsarNumero("4"));
		boton_5.setOnMouseClicked((event) -> pulsarNumero("5"));
		boton_6.setOnMouseClicked((event) -> pulsarNumero("6"));
		boton_7.setOnMouseClicked((event) -> pulsarNumero("7"));
		boton_8.setOnMouseClicked((event) -> pulsarNumero("8"));
		boton_9.setOnMouseClicked((event) -> pulsarNumero("9"));
		boton_0.setOnMouseClicked((event) -> pulsarNumero("0"));
	}

	private void pulsarNumero(String num) {

		numeros.setText(Calculadora.getNumActual() + num);
		
		Calculadora.setNumActual(num + Calculadora.getNumMemoria());
	
		Calculadora.setNumMemoria(numeros.getText());
		
	}
}