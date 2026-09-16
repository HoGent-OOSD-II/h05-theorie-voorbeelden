package gui;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;

public class FlowLayout extends FlowPane {

	public FlowLayout() {
		// de richting van deze FlowPane is vertikaal
		setOrientation(Orientation.VERTICAL);
		setVgap(20);
		setHgap(20);
		setAlignment(Pos.CENTER);
		for (int i = 0; i < 5; i++) {
			Label lbl = makeLabel(String.format("Label %d", i));
			getChildren().add(lbl);
		}
	}

	private Label makeLabel(String text) {
		Label lblResult = new Label(text);
		lblResult.setBorder(Border.stroke(Paint.valueOf("black")));
		lblResult.setPadding(new Insets(5));
		lblResult.setPrefWidth(70);
		lblResult.setMinWidth(50);
		lblResult.setAlignment(Pos.CENTER);
		return lblResult;
	}
}
