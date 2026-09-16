package gui;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class BorderLayout extends BorderPane {

	public BorderLayout() {
		HBox hBox;
		VBox vBox;

		// dit is een voorbeeld van een geneste lay-out:
		// de kinderen van onze BorderPane zijn HBox/VBox
		// merk op: elke lay-out erft van Pane
		hBox = (HBox) createLabelWrappedInABox("TOP", TextAlignment.CENTER, Orientation.HORIZONTAL, Color.LIGHTBLUE);
		// gebruik setTop om iets in het bovenste deel van deze lay-out te plaatsen
		this.setTop(hBox);

		hBox = (HBox) createLabelWrappedInABox("BOTTOM", TextAlignment.CENTER, Orientation.HORIZONTAL,
				Color.LIGHTGOLDENRODYELLOW);
		this.setBottom(hBox);

		vBox = (VBox) createLabelWrappedInABox("LEFT", TextAlignment.LEFT, Orientation.VERTICAL, Color.LIGHTGREEN);
		this.setLeft(vBox);

		vBox = (VBox) createLabelWrappedInABox("RIGHT", TextAlignment.RIGHT, Orientation.VERTICAL, Color.LIGHTSALMON);
		this.setRight(vBox);

		vBox = (VBox) createLabelWrappedInABox("CENTER\n\nexample of a widely used application lay-out",
				TextAlignment.CENTER, Orientation.VERTICAL, Color.LIGHTGRAY);
		this.setCenter(vBox);
	}

	// maak een VBox/HBox met een label
	private Pane createLabelWrappedInABox(String text, TextAlignment alignment, Orientation orientation, Color color) {
		Label lbl = createLabel(text, alignment);
		Pane p = orientation == Orientation.HORIZONTAL ? new HBox(lbl) : new VBox(lbl);
		p.setPadding(new Insets(10));
		// achtergrondkleur en afgeronde hoeken instellen
		p.setBackground(new Background(new BackgroundFill(color, new CornerRadii(5), new Insets(3))));
		if (p instanceof HBox h)
			h.setAlignment(Pos.CENTER);
		else
			((VBox) p).setAlignment(Pos.CENTER);
		return p;
	}

	// maak een label met de gewenste tekst alignatie
	private Label createLabel(String text, TextAlignment alignment) {
		Label lbl = new Label(text);
		lbl.setTextAlignment(alignment);
		// instellen van het lettertype
		lbl.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		return lbl;
	}

}
