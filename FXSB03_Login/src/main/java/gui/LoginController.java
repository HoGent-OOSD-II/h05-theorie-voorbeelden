package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private Parent rootLoginScherm;

    public Parent getRootLoginScherm() {
        return rootLoginScherm;
    }

    @FXML
    private TextField txfUsername;

    @FXML
    private PasswordField pwdWachtwoord;

    @FXML
    void login(ActionEvent event) {
        if (txfUsername.getText().isBlank() || pwdWachtwoord.getText().isBlank())
            toonAlert("Je moet een username en een wachtwoord opgeven!");
        else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/WelkomScherm.fxml"));
                loader.setControllerFactory(c -> new WelkomController(
                        txfUsername.getText(),
                        pwdWachtwoord.getText(),
                        this));
                Parent root = loader.load();
                ((Node) event.getSource()).getScene().setRoot(root);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void toonAlert(String s) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setHeaderText("Logging in...");
        alert.setContentText(s);
        alert.showAndWait();
    }

    public void resetWachtwoord() {
        pwdWachtwoord.setText("");
        pwdWachtwoord.requestFocus();
    }


}