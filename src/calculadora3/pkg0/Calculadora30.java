package calculadora3.pkg0;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculadora30 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        //TITULO E ICONO
        stage.getIcons().add(new Image("file:///C:/Users/Rasul/Documents/NetBeansProjects/calculadoraV3/icons/Calculator-icon.png"));
        stage.setTitle("Calculadora");
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
