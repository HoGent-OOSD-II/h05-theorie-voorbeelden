package main;

import gui.LoginScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {
	@Override
	public void start(Stage primaryStage) {
		LoginScherm grid = new LoginScherm();

		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);

		primaryStage.setTitle("JavaFX Welcome");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
