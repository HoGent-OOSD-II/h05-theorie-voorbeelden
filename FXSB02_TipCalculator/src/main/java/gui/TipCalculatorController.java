package gui;

import domein.DomeinController;
import dto.TipDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class TipCalculatorController {
    private DomeinController dc;
    private BigDecimal tipPercentage = new BigDecimal(0.15);

    @FXML
    private Label lblTipPercentage;
    @FXML
    private TextField txfAmount;
    @FXML
    private TextField txfTip;
    @FXML
    private TextField txfTotal;
    @FXML
    private Slider sldTipPercentage;
    @FXML
    private Button btnCalculate;

    public TipCalculatorController(DomeinController dc) {
        this.dc = dc;
    }

    @FXML
    public void btnCalculateOnAction(ActionEvent event) {
        try {
            BigDecimal amount = new BigDecimal(txfAmount.getText());
            dc.defineAmount(amount);
            BigDecimal perc = BigDecimal.valueOf(sldTipPercentage.getValue() / 100);
            dc.defineTipPercentage(perc);
            TipDTO tipDTO = dc.giveTipDetails();
            txfTip.setText(String.format(String.format("%.2f", tipDTO.tipAmount())));
            txfTotal.setText(String.format(String.format("%.2f", tipDTO.total())));
        } catch (NumberFormatException e) {
            txfAmount.setText("Enter amount");
            txfAmount.selectAll();
            txfAmount.requestFocus();
        } catch (IllegalArgumentException e) {
            txfAmount.setText(e.getMessage());
            txfAmount.selectAll();
            txfAmount.requestFocus();
        }
    }


    @FXML
    private void initialize() {
        // initiele toestand opvragen en instellen (SAFE here)
        tipPercentage = BigDecimal.valueOf(
                sldTipPercentage.getValue() / 100.0
        );
        lblTipPercentage.setText(
                String.format("%.0f%%", sldTipPercentage.getValue())
        );

        // listener koppelen (SAFE here)
        sldTipPercentage.valueProperty().addListener((ov, oldValue, newValue) -> {
            tipPercentage = BigDecimal.valueOf(
                    Math.ceil(newValue.doubleValue()) / 100.0
            );

            lblTipPercentage.setText(
                    String.format("%.0f%%",
                            tipPercentage.multiply(BigDecimal.valueOf(100.0)))
            );
        });
    }
}
