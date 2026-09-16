package main;

import gui.DemoEventScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		DemoEventScherm root = new DemoEventScherm();

		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Eventafhandeling");
		primaryStage.show();

		primaryStage.setOnCloseRequest(root::quit); // <1>
	}

	public static void main(String[] args) {
		launch(args);
	}
}