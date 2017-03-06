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
import javafx.scene.control.CheckBox;
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
    private Button limpiar;
    @FXML
    private Button dividir;
    @FXML
    private TextArea pantalla;
    @FXML
    private Button limiparDigito;
    @FXML
    private Button igual;
    @FXML
    private Button coma;
    @FXML
    private Label postOperacion;
    @FXML
    private CheckBox activarHistorico;
    @FXML
    private TextArea historico;
    @FXML
    private Label labelHistorico;
    @FXML
    private Button limpiarHistorico;
    
   
    private static String operacion = "";
    private static String numero = "";
    private static String concat = "";
    private Double numero1, total = 0.0, count = 0.0;
    private String simbolo = "";
    
    boolean igualApretado = false;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pantalla.setEditable(false); //EVITAR QUE SE PUEDA ESCRIBIR EN LA PANTALLA
        historico.setEditable(false);
    }

    @FXML
    private void apretarNumero(ActionEvent event) {

        String digito = "";
        
        if (this.igualApretado) {
            this.pantalla.setText("");
            this.postOperacion.setText("");
            numero = "";
            total = 0.0;
            operacion = "";
            count = 0.0;
        }            
        
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
        this.igualApretado = false;
        numero = numero + digito;

        this.pantalla.setText(numero);
    }
    
    

    @FXML
    private void apretarOperacion(ActionEvent event) {

        if (this.mas.isFocused()) {
            
            if (igualApretado) {
                numero1 = total;
            } else {
                numero1 = Double.parseDouble(numero);
            }
            if (simbolo.equalsIgnoreCase("+")) {
                total = total + numero1;

            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - numero1;

            } else if (simbolo.equalsIgnoreCase("x")) {
                total = total * numero1;

            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / numero1;
            } else {
                total = numero1;
            }

            operacion = operacion + numero1 + " + ";

            this.pantalla.setText(total + "");
            this.postOperacion.setText(operacion);
            numero = "";
            simbolo = "+";
            count++;
            this.igualApretado = false;
          
        
            
            
            
        } else if (this.menos.isFocused()) {

            if (igualApretado) {
                numero1 = total;
                count++;
            } else {
                numero1 = Double.parseDouble(numero);
            }

            if (count == 0.0) {
                total = total + numero1;
                count++;
            } else if (simbolo.equalsIgnoreCase("+")) {
                total = total + numero1;

            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - numero1;

            } else if (simbolo.equalsIgnoreCase("x")) {
                total = total * numero1;

            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / numero1;
            }
            
            operacion = operacion + numero1 + " - ";

            this.pantalla.setText(total + "");
            this.postOperacion.setText(operacion);
            numero = "";
            simbolo = "-";
            count++;
            this.igualApretado = false;

            
            
            
            
        } else if (this.multiplicar.isFocused()) {
            
            if (igualApretado) {
                numero1 = total;
            } else {
                numero1 = Double.parseDouble(numero);
            }
            
            if (simbolo.equalsIgnoreCase("+")) {
                total = total + numero1;

            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - numero1;

            } else if (simbolo.equalsIgnoreCase("x")) {
                total = total * numero1;

            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / numero1;
            } else {
                total = numero1;
            }

            operacion = operacion + numero1 + " x ";

            this.pantalla.setText(total + "");
            this.postOperacion.setText(operacion);
            numero = "";
            simbolo = "x";
            count++;
            this.igualApretado = false;

                        
            
            
            
        } else if (this.dividir.isFocused()) {
           
            if (igualApretado) {
                numero1 = total;
            } else {
                numero1 = Double.parseDouble(numero);
            }
            
            if (simbolo.equalsIgnoreCase("+")) {
                total = total + numero1;

            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - numero1;

            } else if (simbolo.equalsIgnoreCase("x")) {
                total = total * numero1;

            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / numero1;
            } else {
                total = numero1;
            }

            operacion = operacion + numero1 + " / ";

            this.pantalla.setText(total + "");
            this.postOperacion.setText(operacion);
            numero = "";
            simbolo = "/";
            count++;
            this.igualApretado = false;


        }
    }

    @FXML
    private void apretarIgual(ActionEvent event) {
        
        numero1 = Double.parseDouble(numero);
        
        if (simbolo.equalsIgnoreCase("+")) {
            total = total + numero1;

        } else if (simbolo.equalsIgnoreCase("-")) {
            total = total - numero1;

        } else if (simbolo.equalsIgnoreCase("x")) {
            total = total * numero1;

        } else if (simbolo.equalsIgnoreCase("/")) {
            total = total / numero1;
        }

        this.pantalla.setText(total + "");
        this.postOperacion.setText(operacion + numero1);
        
        //HISTORICO
        concat = concat + "\n" + operacion + numero1 + " = " + total;
        this.historico.setText(concat);
        
        numero = "";
        simbolo = "";
        operacion = "";
        count = 0.0;
        this.igualApretado = true;
        
    }

    @FXML
    private void apretarLimpiar(ActionEvent event) {

        this.pantalla.setText("");
        this.postOperacion.setText("");
        numero = "";
        total = 0.0;
        operacion = "";
        count = 0.0;
        this.igualApretado = false;
        

    }

    @FXML
    private void apretarHistorico(ActionEvent event) {
        
        if (activarHistorico.isSelected()) {
            this.historico.setVisible(true);
        } else {
            this.historico.setVisible(false);
        }
        
    }

    @FXML
    private void apretarLimpiarHistorico(ActionEvent event) {
        
        if (limpiarHistorico.isFocused()) {
            this.historico.setText(" ");
        }
        
    }

    

}
