package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;

public class HBoxLayout extends HBox {

	public HBoxLayout() {
		setSpacing(20);
		setWidth(200);
		setAlignment(Pos.CENTER);
		for (int i = 0; i < 5; i++) {
			Label lbl = new Label(String.format("Label %d", i));
			lbl.setBorder(Border.stroke(Paint.valueOf("black")));
			lbl.setPadding(new Insets(5));
			lbl.setPrefWidth(70);
			// het label wordt nooit smaller dan 50 pixels
			lbl.setMinWidth(50);
			lbl.setAlignment(Pos.CENTER);
			getChildren().add(lbl);
		}
	}
}
