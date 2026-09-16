package main;

import gui.WelkomScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application // <1>
{
	@Override
	public void start(Stage primaryStage) // <2>
	{
		WelkomScherm root = new WelkomScherm();
		Scene scene = new Scene(root, 520, 320); // <3>
		primaryStage.setScene(scene); // <4>
		primaryStage.setTitle("Welkom bij JavaFX"); // <5>
		primaryStage.show(); // <6>
	}

	public static void main(String[] args) // <7>
	{
		launch(args);
	}
}
