package gui;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LoginScherm extends GridPane {
	private Label lblMessage; // <1>

	public LoginScherm() {
		this.setAlignment(Pos.BOTTOM_LEFT); // <2>
		this.setHgap(10); // <3>
		this.setVgap(10); // <4>

		this.setPadding(new Insets(25, 25, 25, 25)); // <5>

		Label lblTitle = new Label("Welcome");
		lblTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

		// <6>
		this.add(lblTitle, 0, 0, 2, 1); // <7>

		Label lblUserName = new Label("User Name:");
		this.add(lblUserName, 0, 1);

		TextField txfUser = new TextField();
		this.add(txfUser, 1, 1);

		Label lblPassword = new Label("Password:");
		this.add(lblPassword, 0, 2);

		PasswordField pwfPassword = new PasswordField();
		this.add(pwfPassword, 1, 2);

		Tooltip tooltip = new Tooltip();
		tooltip.setText("Your password must be\n" + "at least 8 characters in length\n");
		pwfPassword.setTooltip(tooltip);

		Button btnSignIn = new Button("Sign in");

		this.add(btnSignIn, 0, 4);

		Button btnCancel = new Button("Cancel");

		setHalignment(btnCancel, HPos.RIGHT); // <8>
		this.add(btnCancel, 1, 4);

		Hyperlink linkForgot = new Hyperlink("Forgot password");
		this.add(linkForgot, 0, 5, 2, 1);

		lblMessage = new Label();
		this.add(lblMessage, 1, 6);

	}
}
