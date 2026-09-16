package main;

import domein.DomeinController;
import gui.TipCalculatorController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DomeinController domeinController = new DomeinController();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/TipCalculatorScherm.fxml"));
        loader.setControllerFactory(c -> new TipCalculatorController(domeinController));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TipCalculator");
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}