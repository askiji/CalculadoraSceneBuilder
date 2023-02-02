package UltimoTRyEnClase.Calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 * Metodo autogenerado de Maven
 * 
 */
public class App extends Application {

    private static Scene scene;

    /**
     * Metodo que inicia la escena donde iran nuestros elementos
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
//        String path = "/Calculadora/target/aplicacionCalculadora.css";
//        scene.getStylesheets().add(getClass().getResource(path).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * metodo para cambiar de scene aqui no lo utilizamos
     * @param fxml
     * @throws IOException
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /*
     * Metodo que inicia la aplicacion
     */
    public static void main(String[] args) {
        launch();
    }

}