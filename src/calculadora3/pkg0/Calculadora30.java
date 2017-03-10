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
        
        
        stage.getIcons().add(new Image("http://icons.iconarchive.com/icons/dtafalonso/android-lollipop/256/Calculator-icon.png")); //ICONO DE LA APLICACION
        stage.setTitle("Calculadora"); //TITULO DE LA APLICACION
        stage.setResizable(false); //EVITAR QUE SE PUEDA MODIFICAR EL TAMAÑO DE LA VENTANA
        stage.sizeToScene(); // AJUSTAR LA VENTANA AL TAMAÑO DEL PANE (PARA QUE NO HAYA PADING EN LA VENTANA)
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
