package com.auction.controller;

import com.auction.util.SceneUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML private TextField pwShown;
    @FXML private PasswordField pwHidden;
    @FXML private Button lever;

    @FXML
    private void initialize() {
        pwShown.textProperty().bindBidirectional(pwHidden.textProperty());

        pwShown.setVisible(false);
        pwShown.setManaged(false);
    }

    @FXML
    private void tooglePassword(ActionEvent event) {
        if (pwHidden.isVisible()) {
            pwHidden.setVisible(false);
            pwHidden.setManaged(false);

            pwShown.setVisible(true);
            pwShown.setManaged(true);

            lever.setText("Hide");
        } else {
            pwHidden.setVisible(true);
            pwHidden.setManaged(true);

            pwShown.setVisible(false);
            pwShown.setManaged(false);

            lever.setText("Show");
        }
    }

    @FXML
    private void backToStart(ActionEvent event) {
        SceneUtil.changeScene(event, "/com/auction/view/Start.fxml");
    }

    @FXML
    private void loginAction(ActionEvent event) {
        SceneUtil.changeScene(event, "/com/auction/view/Login.fxml");
    }
}
