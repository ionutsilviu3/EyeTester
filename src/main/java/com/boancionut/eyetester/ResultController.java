package com.boancionut.eyetester;

import com.boancionut.eyetester.entities.DiseaseEntity;
import com.boancionut.eyetester.service.DiseaseService;
import com.boancionut.eyetester.service.PatientService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultController implements Initializable{
    @FXML
    private AnchorPane paneBackground;
    @FXML
    private Label labelResult, labelDescription;
    private PatientService patientService;
    private DiseaseService diseaseService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SceneController.fadeSceneIn(paneBackground);
        patientService = new PatientService();
        diseaseService = new DiseaseService();
        try {
            DiseaseEntity disease = diseaseService.findDisease(patientService.findPatientID(LoginController.loggedID).getPatientDisease());
            labelResult.setText(disease.getDiseaseName());
            labelDescription.setText(disease.getDescription());

            if(disease.getDiseaseId() == 3)
            {
                labelResult.setTextFill(Color.web("#94b1e6"));
            }
            else if(disease.getDiseaseId() == 2)
            {
                labelResult.setTextFill(Color.web("#c9d838"));
            }
            else
            {
                labelResult.setTextFill(Color.web("#01a72b"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
