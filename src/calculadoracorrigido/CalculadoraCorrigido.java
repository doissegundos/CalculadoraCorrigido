package calculadoracorrigido;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/// Classe "CalculadoraCorrigido" torna-se uma Subclasse da classe Application
public class CalculadoraCorrigido extends Application {
    
    /// Subclasse "Calculadora", sobrescrevendo a Superclasse Application
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
