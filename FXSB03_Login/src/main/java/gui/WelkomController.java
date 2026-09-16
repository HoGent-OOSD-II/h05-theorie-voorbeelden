package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;

public class WelkomController {
    private String username, wachtwoord;
    private LoginController loginController;

    @FXML
    private Label lblMessage;

    @FXML
    private Label lblWelkom;

    public WelkomController(String username, String wachtwoord, LoginController loginController) {
        this.username = username;
        this.wachtwoord = wachtwoord;
        this.loginController = loginController;
    }

    @FXML
    void gaTerug(ActionEvent event) {
        ((Node) event.getSource()).getScene().setRoot(loginController.getRootLoginScherm());
        loginController.resetWachtwoord();
    }

    @FXML
    private void initialize() {
        lblWelkom.setText(String.format("%s %s!", lblWelkom.getText(), username));
        lblMessage.setText(String.format("Toon niemand dat je wachtwoord '%s' is!%nAls je terugkeert is het wachtwoordveld leeg...", wachtwoord));
    }

}
