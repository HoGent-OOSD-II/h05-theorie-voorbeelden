package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartUp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/gui/Voorbeeld.fxml")
            );
            Scene scene = new Scene(root, 350, 150);
            scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}