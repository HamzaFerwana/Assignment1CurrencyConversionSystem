/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author PC-ASUS
 */
public class CurrencyConversionSystemController implements Initializable {

    @FXML
    private Button logoutButton;
    @FXML
    private TextField usdTextfield;
    @FXML
    private TextField nisTextfield;
    @FXML
    private Button convertButton;
    @FXML
    private Button resetButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {
        ViewManager.closeConversionPage();
        nisTextfield.setText("");
        usdTextfield.setText("");
        ViewManager.openLoginPage();
    }

    @FXML
    private void convertButtonHandler(ActionEvent event) {
        if (nisTextfield.getText().isEmpty() && !usdTextfield.getText().isEmpty()) {
            nisTextfield.setText(String.valueOf(Double.parseDouble(usdTextfield.getText()) * 3.5));
        } else if (!nisTextfield.getText().isEmpty() && usdTextfield.getText().isEmpty()) {
            usdTextfield.setText(String.valueOf(Double.parseDouble(nisTextfield.getText()) / 3.5));

        }

    }

    @FXML
    private void resetButtonHandler(ActionEvent event) {
        nisTextfield.setText("");
        usdTextfield.setText("");
    }

}
