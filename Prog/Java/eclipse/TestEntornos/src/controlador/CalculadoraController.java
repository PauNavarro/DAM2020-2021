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

	@FXML
	private Button boton_0, boton_1, boton_2, boton_3, boton_4, boton_5, boton_6, boton_7, boton_8, boton_9, boton_sum,
			boton_res, boton_X, boton_divi, boton_equal, boton_AC, boton_C, boton_comma, cambiarSigno;

	@FXML
	Label numeros, numMemo;

	Calculadora calculadora;

	String operacion;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		calculadora = new Calculadora();

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
		boton_comma.setOnMouseClicked((event) -> introducirComa());
		boton_AC.setOnMouseClicked((event) -> borrarUltPos());
		boton_C.setOnMouseClicked((event) -> borrarTodo());
		boton_sum.setOnMouseClicked((event) -> doOperacion("suma"));
		boton_res.setOnMouseClicked((event) -> doOperacion("resta"));
		boton_X.setOnMouseClicked((event) -> doOperacion("mult"));
		boton_divi.setOnMouseClicked((event) -> doOperacion("div"));
		boton_equal.setOnMouseClicked((event) -> darResultado());
		cambiarSigno.setOnMouseClicked((event) -> cambiarSigno());
	}

	private void cambiarSigno() {

		calculadora.setNumActual("-"+ calculadora.getNumActual());
		
		numeros.setText(calculadora.getNumActual());
	
	}

	private void darResultado() {

		try {

			double num1 = Double.parseDouble(numMemo.getText().replace(",", "."));
			double num2 = Double.parseDouble(numeros.getText().replace(",", "."));

			switch (operacion) {

			case "suma":

				calculadora.sumar(num1, num2);

				numMemo.setText("");
				numeros.setText(calculadora.getNumActual());

				break;

			case "resta":

				calculadora.restar(num1, num2);

				numMemo.setText("");
				numeros.setText(calculadora.getNumActual());

				break;

			case "mult":

				calculadora.multiplicar(num1, num2);

				numMemo.setText("");
				numeros.setText(calculadora.getNumActual());

				break;

			case "div":

				calculadora.dividir(num1, num2);

				numMemo.setText("");
				numeros.setText(calculadora.getNumActual());

				break;

			}
		} catch (java.lang.NumberFormatException a) {

		} catch (java.lang.NullPointerException e) {

			numeros.setText("Error, no has introducido operación.");

		}
	}

	private void doOperacion(String operacion) {

		updateMem();
		calculadora.setComa(false);
		calculadora.setNumActual("");
		numeros.setText(calculadora.getNumActual());
		this.operacion = operacion;

	}

	private void updateMem() {

		calculadora.setNumMemoria(numeros.getText());

		numMemo.setText(calculadora.getNumMemoria());

	}

	private void pulsarNumero(String num) {

		if (calculadora.getNumActual().equals("")) {

			numeros.setText(calculadora.getNumActual() + num);

			calculadora.setNumActual(calculadora.getNumActual() + num);

		} else {

			numeros.setText(calculadora.getNumActual() + num);
			calculadora.setNumActual(numeros.getText());

		}
	}

	private void introducirComa() {

		if (!calculadora.getComa()) {

			numeros.setText(calculadora.getNumActual() + ",");

			calculadora.setNumActual(calculadora.getNumActual() + ",");

			calculadora.setComa(true);

		}
	}

	private void borrarUltPos() {

		String ultCharAsString = "";

		try {

			char ultimoChar = numeros.getText().charAt(numeros.getText().length() - 1);

			ultCharAsString = ultimoChar + "";

		} catch (java.lang.StringIndexOutOfBoundsException e) {
		}

		if (ultCharAsString.equals(",")) {

			calculadora.setComa(false);

		}

		numeros.setText(numeros.getText().replaceFirst(".$", ""));

		calculadora.setNumMemoria(numeros.getText());
		calculadora.setNumActual(numeros.getText());

	}

	private void borrarTodo() {

		calculadora.setNumActual("0");
		calculadora.setNumMemoria("");
		calculadora.setComa(false);

		numeros.setText(calculadora.getNumActual());

	}
}
