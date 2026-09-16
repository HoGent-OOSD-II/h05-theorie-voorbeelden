package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class VBoxLayout extends VBox {

	public VBoxLayout() {
		// 20 pixels ruimte tussen de items
		setSpacing(20);
		// exacte breedte instellen
		setWidth(200);
		setAlignment(Pos.CENTER);
		for (int i = 0; i < 5; i++) {
			Label lbl = new Label(String.format("Label %d", i));
			// label een zwarte rand geven
			lbl.setBorder(Border.stroke(Paint.valueOf("black")));
			// ruimte creeren tussen tekst en rand van label
			lbl.setPadding(new Insets(5));
			// breedte instellen
			lbl.setPrefWidth(100);
			// tekst op label centreren
			lbl.setAlignment(Pos.CENTER);
			getChildren().add(lbl);
		}
	}
}
