package cl.duoc.vicecity;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Clase principal: inicia JavaFX, carga la vista y aplica el estilo Vice City.
// ENTREGADA POR EL DOCENTE: no debes modificarla.
public class App extends Application {

    // JavaFX llama este método para crear y mostrar la ventana.
    @Override
    public void start(Stage stage) throws Exception {
        // Busca el archivo FXML en el paquete de recursos de App.
        Parent vista = FXMLLoader.load(App.class.getResource("main-view.fxml"));
        // Crea una escena de 960 x 520 píxeles con la vista cargada.
        Scene escena = new Scene(vista, 960, 520);
        // Aplica la hoja de estilos neón de Vice City.
        escena.getStylesheets().add(App.class.getResource("vicecity.css").toExternalForm());
        stage.setScene(escena);
        // Coloca el título en la barra superior de la ventana.
        stage.setTitle("Vice City Motors - Leonida | GTA VI");
        // Hace visible la ventana para el usuario.
        stage.show();
    }

    // Punto de entrada: inicia el ciclo de vida de JavaFX.
    public static void main(String[] args) {
        launch(args);
    }
}
