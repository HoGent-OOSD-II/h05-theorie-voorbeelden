package main;

import gui.LabelScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StartUp extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		LabelScherm root = new LabelScherm();
		Scene scene = new Scene(root, 500, 350, Color.BLACK);
		scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm()); // <1>
		primaryStage.setTitle("Welkom");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
