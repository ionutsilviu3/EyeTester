package com.boancionut.eyetester;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private AnchorPane paneBackgroundSignUp;
    @FXML
    private Label labelFieldNeeds;
    @FXML
    private TextField textFieldEmailSignUp, textFieldUserSignUp;
    @FXML
    private PasswordField passFieldUserSignUp;

    @FXML
    private ImageView imageViewWarningEmail, imageViewWarningUsername, imageViewWarningPassword;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageViewWarningEmail.setVisible(false);
        imageViewWarningUsername.setVisible(false);
        imageViewWarningPassword.setVisible(false);
        SceneController.fadeSceneIn(paneBackgroundSignUp);
    }
    @FXML
    private void signUp(ActionEvent event) {
        if (RegexVerification.validateUsername(textFieldUserSignUp.getText()) == RegexVerification.state.VALID

                && RegexVerification.validateEmail(textFieldEmailSignUp.getText()) == RegexVerification.state.VALID

                && RegexVerification.validatePassword(passFieldUserSignUp.getText()) == RegexVerification.state.VALID) {

            /*PatientService patientService = new PatientService();
            PatientEntity patient = new PatientEntity();
            patient.setEmail(textFieldEmailSignUp.getText());
            patient.setPatientName(textFieldUserSignUp.getText());
            patient.setPassword(passFieldUserSignUp.getText());
            patientService.addPatient(patient);
            LoginController.loggedID = patientService.getAllPatients().size();*/
            SceneController.fadeSceneOut("IshiharaTestScene.fxml", paneBackgroundSignUp);
        }
        if(RegexVerification.validateUsername(textFieldUserSignUp.getText()) != RegexVerification.state.VALID)
            imageViewWarningUsername.setVisible(true);
        else
            imageViewWarningUsername.setVisible(false);
        if(RegexVerification.validateEmail(textFieldEmailSignUp.getText()) != RegexVerification.state.VALID)
            imageViewWarningEmail.setVisible(true);
        else
            imageViewWarningEmail.setVisible(false);
        if(RegexVerification.validatePassword(passFieldUserSignUp.getText()) != RegexVerification.state.VALID)
            imageViewWarningPassword.setVisible(true);
        else
            imageViewWarningPassword.setVisible(false);
    }

    @FXML
    private void goBackToLogin(ActionEvent event) {

        SceneController.fadeSceneOut("LoginScene.fxml", paneBackgroundSignUp);
    }

    @FXML
    private void showNeedsEmail(MouseEvent event)
    {
        labelFieldNeeds.setText("Can't contain special symbols");
        labelFieldNeeds.setTextFill(Color.web("#e45046"));
    }

    @FXML
    private void showNeedsUsername(MouseEvent event)
    {
        labelFieldNeeds.setText("Must contain 6-20 characters, only letters");
        labelFieldNeeds.setTextFill(Color.web("#e45046"));
    }

    @FXML
    private void showNeedsPassword(MouseEvent event)
    {
        labelFieldNeeds.setText("Must contain 8-20 characters, containing  minimum a number and no special symbols");
        labelFieldNeeds.setTextFill(Color.web("#e45046"));
    }

    @FXML
    private void showNoNeeds(MouseEvent event)
    {
        labelFieldNeeds.setText("Moments away from becoming even cooler!");
        labelFieldNeeds.setTextFill(Color.web("#84ee95"));
    }
}
