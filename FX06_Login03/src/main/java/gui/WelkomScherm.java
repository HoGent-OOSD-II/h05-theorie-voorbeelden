package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WelkomScherm extends VBox {

	private Label lblWelkom;
	private Button btnTerug;
	private String inlognaam;

	public WelkomScherm(String inlognaam) {
		this.inlognaam = inlognaam;
		buildGui();
	}

	private void buildGui() {
		setSpacing(10);
		setAlignment(Pos.CENTER);
		lblWelkom = new Label("Welkom " + inlognaam); // <1>
		btnTerug = new Button("Terug");
		this.getChildren().addAll(lblWelkom, btnTerug);

		// Klasse WelkomScherm
		btnTerug.setOnAction(evt -> {
			this.getScene().setRoot(new LoginScherm());
		});

	}
}
