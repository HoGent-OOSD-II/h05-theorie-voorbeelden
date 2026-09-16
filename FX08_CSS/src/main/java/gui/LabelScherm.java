package gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LabelScherm extends VBox {
	public LabelScherm() {
		setSpacing(20);
		setAlignment(Pos.CENTER);
		// <1>
		Label lblWelkom = new Label("Opgemaakt in CSS\nvia class label");
		this.getChildren().add(lblWelkom);

		// <2>
		Label lblHoera = new Label("Opgemaakt in CSS\nvia een expliciete class");
		lblHoera.getStyleClass().add("hoera");
		this.getChildren().add(lblHoera);

		// <3>
		Label lblDerde = new Label("Opgemaakt in CSS\nvia een id");
		lblDerde.setId("derde");
		this.getChildren().add(lblDerde);
	}
}
