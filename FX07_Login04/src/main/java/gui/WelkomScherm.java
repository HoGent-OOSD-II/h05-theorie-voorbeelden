package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WelkomScherm extends VBox {

	private Label lblWelkom;
	private Button btnTerug;
	private String inlognaam;
	private LoginScherm loginScherm; // <1>

	public WelkomScherm(String inlognaam, LoginScherm loginScherm) {
		this.inlognaam = inlognaam;
		this.loginScherm = loginScherm; // <2>
		buildGui();
	}

	private void buildGui() {
		setSpacing(10);
		setAlignment(Pos.CENTER);
		lblWelkom = new Label("Welkom " + inlognaam);
		btnTerug = new Button("Terug");
		this.getChildren().addAll(lblWelkom, btnTerug);

		btnTerug.setOnAction(evt -> {
			this.getScene().setRoot(loginScherm); // <3>
		});
	}
}
