package com.boancionut.eyetester;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    @FXML
    private TextField textFieldUserLogin;
    @FXML
    private PasswordField passFieldUserLogin;

    @FXML
    private AnchorPane paneBackgroundLogin;

    @FXML
    private ImageView imgViewExclamation;

    public static int loggedID;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        imgViewExclamation.setVisible(false);
        SceneController.fadeSceneIn(paneBackgroundLogin);
    }

    @FXML
    private void login(ActionEvent event) {

        /*PatientService patientService = new PatientService();
        PatientEntity p = new PatientEntity();

        try {
            p = patientService.findPatient(textFieldUserLogin.getText(), passFieldUserLogin.getText());
            if (p != null) {
                loggedID = p.getPatientId();
                imgViewExclamation.setVisible(false);
                SceneController.fadeSceneOut("IshiharaTestScene.fxml", paneBackgroundLogin);
            }
        }
        catch (Exception e) {
            imgViewExclamation.setVisible(true);
            e.printStackTrace();
        }*/

    }

    @FXML
    private void goToSignUp(ActionEvent event) {

        SceneController.fadeSceneOut("SignUpScene.fxml", paneBackgroundLogin);
    }
}