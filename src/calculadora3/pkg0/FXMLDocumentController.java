/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author daw
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button dos;
    @FXML
    private Button nueve;
    @FXML
    private Button ocho;
    @FXML
    private Button seis;
    @FXML
    private Button tres;
    @FXML
    private Button cinco;
    @FXML
    private Button cuatro;
    @FXML
    private Button siete;
    @FXML
    private Button uno;
    @FXML
    private Button mas;
    @FXML
    private Button menos;
    @FXML
    private Button multiplicar;
    @FXML
    private Button cero;
    @FXML
    private Button igual;
    @FXML
    private Button limpiar;
    @FXML
    private Button dividir;
    @FXML
    private TextArea pantalla;

    private static String operacion;
    private static String numero = "";
    private Double numero1, numero2;
    @FXML
    private Label postOperacion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void apretarNumero(ActionEvent event) {

        String digito = "";

        if (this.uno.isFocused()) {
            digito = "1";
        } else if (this.dos.isFocused()) {
            digito = "2";
        } else if (this.tres.isFocused()) {
            digito = "3";
        } else if (this.cuatro.isFocused()) {
            digito = "4";
        } else if (this.cinco.isFocused()) {
            digito = "5";
        } else if (this.seis.isFocused()) {
            digito = "6";
        } else if (this.siete.isFocused()) {
            digito = "7";
        } else if (this.ocho.isFocused()) {
            digito = "8";
        } else if (this.nueve.isFocused()) {
            digito = "9";
        } else if (this.cero.isFocused()) {
            digito = "0";
        }

        numero = numero + digito;

        this.pantalla.setText(numero);
    }

    @FXML
    private void apretarOperacion(ActionEvent event) {

        numero1 = Double.parseDouble(numero);

        if (this.mas.isFocused()) {
            operacion = "+";
            this.postOperacion.setText(numero1 + " + ");
            this.pantalla.setText(" ");
            numero = "";

        } else if (this.menos.isFocused()) {
            operacion = "-";
            this.postOperacion.setText(numero1 + " - ");
            this.pantalla.setText(" ");
            numero = "";

        } else if (this.multiplicar.isFocused()) {
            operacion = "x";
            this.postOperacion.setText(numero1 + " x ");
            this.pantalla.setText(" ");
            numero = "";

        } else if (this.dividir.isFocused()) {
            operacion = "/";
            this.postOperacion.setText(numero1 + " / ");
            this.pantalla.setText(" ");
            numero = "";

        }
    }

    @FXML
    private void apretarIgual(ActionEvent event) {

        numero2 = Double.parseDouble(numero);
        
        Double resultado = 0.0;

        if (operacion.equalsIgnoreCase("+")) {
            resultado = numero1 + numero2;
            resultado = (resultado * 100.0) / 100.0;
            
        } else if (operacion.equalsIgnoreCase("-")) {
            resultado = numero1 - numero2;
            resultado = (resultado * 100.0) / 100.0;
            
        } else if (operacion.equalsIgnoreCase("x")) {
            resultado = numero1 * numero2;
            resultado = (resultado * 100.0) / 100.0;
            
        } else if (operacion.equalsIgnoreCase("/")) {
            resultado = numero1 / numero2;
        }
        
        this.pantalla.setText(resultado + "");
        this.postOperacion.setText(numero1 + operacion + numero2);
        numero = "";

    }

    @FXML
    private void apretarLimpiar(ActionEvent event) {

        this.pantalla.setText("");
        this.postOperacion.setText("");
        numero = "";
        
    }

}
