package com.boancionut.eyetester;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultController implements Initializable{
    @FXML
    private AnchorPane paneBackground;
    @FXML
    private Label labelResult, labelDescription;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SceneController.fadeSceneIn(paneBackground);
    }

    @FXML
    private void finish(ActionEvent event) {
        javafx.application.Platform.exit();
    }

    @FXML
    private void goToTest(ActionEvent event) {
        SceneController.fadeSceneOut("IshiharaTestScene.fxml", paneBackground);

    }
}
