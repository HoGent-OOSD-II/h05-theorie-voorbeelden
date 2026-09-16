package gui;

import java.util.Optional;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class DemoEventScherm extends GridPane {
	private Label lblBoodschap;
	private Button buttons[], btnStop;

	public DemoEventScherm() {
		buildGui();
		addEventHandlers();
	}

	private void buildGui() {
		lblBoodschap = new Label();
		buttons = new Button[4];
		this.add(lblBoodschap, 0, 0, buttons.length, 1);
		btnStop = new Button("Stop");
		btnStop.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(2), new Insets(5))));
		btnStop.setPadding(new Insets(15));
		this.add(btnStop, 0, 2, buttons.length, 1);
		btnStop.setMaxWidth(Double.MAX_VALUE);

		for (int i = 0; i < buttons.length; i++) // <1>
		{
			buttons[i] = new Button(String.format("Button %d", i + 1));
			buttons[i].setBackground(
					new Background(new BackgroundFill(Color.LIGHTGREEN, new CornerRadii(2), new Insets(5))));
			buttons[i].setPadding(new Insets(10));
			this.add(buttons[i], i, 1);
		}

		this.setAlignment(Pos.CENTER);
	}

	private void addEventHandlers() {
		for (Button button : buttons) // <2>
		{
			button.setOnAction(event -> lblBoodschap
					.setText(String.format("Geklikt op %s", ((Button) event.getSource()).getText())));
		}

		btnStop.setOnAction(this::quit); // <3>

		this.setOnMouseClicked(new EventHandler<MouseEvent>() // <4>
		{
			@Override
			public void handle(MouseEvent event) {
				System.out.println("x = " + event.getSceneX());
				System.out.println("y = " + event.getSceneY());
			}
		});
	}

	public void quit(Event event) // <5>
	{
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Bevestig");
		alert.setContentText("Wil je de applicatie afsluiten?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.out.println("We sluiten het venster en dus... ook de applicatie");
			Platform.exit();
		} else // Cancel
		{
			event.consume();
		}
	}
}
