package io.github.alvarofilho;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Álvaro
 */
public class Calculadora extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Calculadora de IMC");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.getIcons().add(new Image(getClass().getResourceAsStream("img/calculadora.png")));
        stage.show();
    }
}
