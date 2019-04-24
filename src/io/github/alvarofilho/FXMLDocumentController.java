package io.github.alvarofilho;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Álvaro
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label labelPeso;

    @FXML
    private TextField textPeso;

    @FXML
    private Label labelAltura;

    @FXML
    private TextField textAltura;

    @FXML
    private Button butaoCalcular;

    @FXML
    private Label labelResutado;

    @FXML
    public void calcularEvento(ActionEvent event) {
        try {
            double altura = Double.parseDouble(textAltura.getText().replace(",", "."));
            double peso = Double.parseDouble(textPeso.getText().replace(",", "."));

            double imc = peso / Math.pow(altura, 2);

            labelResutado.setText("IMC: " + String.format("%.1f", imc) + "\n" + "Resultado: " + getSituation(imc));
        } catch (NumberFormatException exception) {
            labelResutado.setText("Somente numeros são validos!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public String getSituation(double imc) {
        if (imc < 18.5) {
            return "Abaixo do Peso!";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso Normal!";
        } else if (imc >= 24.9 && imc <= 29.9) {
            return "Sobrepeso!";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau 1!";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Severa!";
        } else if (imc > 40) {
            return "Obesidade Mórbida!!!";
        }
        return "Erro!!!";
    }
}
