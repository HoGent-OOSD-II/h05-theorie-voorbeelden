package gui;

import javafx.scene.control.Label; // <1>
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class WelkomScherm extends Pane { // <2>
	public WelkomScherm() {
		Label lblWelkom = new Label("!!! Welkom !!!"); // <3>

		Image imgLogo = new Image(getClass().getResourceAsStream("/images/logo.png")); // <4>
		ImageView ivLogo = new ImageView(imgLogo); // <5>

		// <6>
		lblWelkom.setLayoutX(230);
		lblWelkom.setLayoutY(10);

		ivLogo.setLayoutX(140);
		ivLogo.setLayoutY(50);

		this.getChildren().addAll(lblWelkom, ivLogo); // <7>
	}
}