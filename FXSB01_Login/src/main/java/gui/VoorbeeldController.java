package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class VoorbeeldController {

    @FXML
    private TextField txfEmail;

    @FXML
    private PasswordField pwdWachtwoord;

    @FXML
    void login(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Welkom!");
        alert.setHeaderText("Logging in...");
        alert.setContentText(
                String.format("Welkom, %s, vertel aan niemand dat %s je wachtwoord is ;-)",
                        txfEmail.getText(), pwdWachtwoord.getText()));
        alert.showAndWait();
    }
}