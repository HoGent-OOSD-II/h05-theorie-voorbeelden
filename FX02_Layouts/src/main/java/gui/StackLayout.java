package gui;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class StackLayout extends StackPane {

	public StackLayout() {
		buildStackScreen();
	}

	private void buildStackScreen() {
		ImageView ivWelkom = createImageView();
		Label lblWelkom = createLabel();
		// lblWelkom komt bovenop ivWelkom te staan
		getChildren().addAll(ivWelkom, lblWelkom);
	}

	private ImageView createImageView() {
		Image imgWelkom = new Image(getClass().getResourceAsStream("/images/background.jpg"));
		ImageView iv = new ImageView(imgWelkom);
		iv.setFitWidth(1000);
		iv.setPreserveRatio(true);
		return iv;
	}

	private Label createLabel() {
		Label lbl = new Label("LABEL\nstacked on an\nIMAGE");
		lbl.setFont(Font.font("Calibri", FontWeight.BOLD, 24));
		lbl.setTextFill(Color.ANTIQUEWHITE);
		lbl.setPadding(new Insets(20));
		lbl.setTextAlignment(TextAlignment.CENTER);
		lbl.setBackground(new Background(new BackgroundFill(Color.TOMATO, new CornerRadii(30), new Insets(0))));
		lbl.setCursor(Cursor.HAND);
		return lbl;
	}
}
