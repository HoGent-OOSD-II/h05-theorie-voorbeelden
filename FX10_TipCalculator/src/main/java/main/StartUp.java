package main;

import domein.DomeinController;
import gui.TipCalculatorScherm;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {
	// De methode start zet nu enkel de Scene en Stage op
	// De methode start maakt ook de domeincontroller aan en
	// geeft deze door aan het TipCalculatorScherm (ons hoofdpaneel root)
	@Override
	public void start(Stage primaryStage) {
		DomeinController dc = new DomeinController();
		TipCalculatorScherm root = new TipCalculatorScherm(dc);
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TipCalculator");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
