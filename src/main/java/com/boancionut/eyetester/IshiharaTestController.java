package com.boancionut.eyetester;

import com.boancionut.eyetester.entities.DiseaseEntity;
import com.boancionut.eyetester.entities.IshiharaplateEntity;
import com.boancionut.eyetester.entities.PatientEntity;
import com.boancionut.eyetester.service.DiseaseService;
import com.boancionut.eyetester.service.IshiharaPlateService;
import com.boancionut.eyetester.service.PatientService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class IshiharaTestController implements Initializable {

    @FXML
    private AnchorPane paneBackground;

    @FXML
    private ImageView imageIshihara;

    @FXML
    private Button buttonCorrect, buttonWrong, buttonNone;

    private int correctAnswersCounter = 0;
    private int wrongAnswersCounter = 0;
    private int noneAnswersCounter = 0;
    private int answeredCounter = 0;

    private Random rand = new Random();

    private PatientService patientService;
    private PatientEntity localPatient;

    private IshiharaPlateService ishiharaPlateService;
    private List<IshiharaplateEntity> allIshiharaPlates;

    private DiseaseService diseaseService;
    private List<DiseaseEntity> allDiseases;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SceneController.fadeSceneIn(paneBackground);
        localPatient = null;
        patientService = new PatientService();
        ishiharaPlateService = new IshiharaPlateService();
        allIshiharaPlates = ishiharaPlateService.getAllIshiharaPlates();
        Collections.shuffle(allIshiharaPlates);
        diseaseService = new DiseaseService();
        allDiseases = diseaseService.getAllDiseases();
        changePlate();
    }

    @FXML
    private void correctAnswer(ActionEvent event) {
        correctAnswersCounter++;
        changePlate();
    }

    @FXML
    private void wrongAnswer(ActionEvent event) {
        if (wrongAnswersCounter < 7 && correctAnswersCounter >= 0) {
            wrongAnswersCounter++;
            changePlate();
        } else if (wrongAnswersCounter >= 7 && correctAnswersCounter > 0) {
            System.out.println("Not yet implemented");

            try {
                patientService.updateDisease(diseaseService.findDisease("Mild Colorblindness"),
                        LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }

            SceneController.fadeSceneOut("ResultScene.fxml", paneBackground);
        }

        else if (wrongAnswersCounter >= 7 && correctAnswersCounter <= 0) {
            System.out.println("Not yet implemented");
            try {
                patientService.updateDisease(diseaseService.findDisease("Colorblind"), LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    private void noneAnswer(ActionEvent event) {
        if (noneAnswersCounter < 3) {
            noneAnswersCounter++;
            changePlate();
        } else {
            try {
                patientService.updateDisease(diseaseService.findDisease("Colorblind"), LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }

            SceneController.fadeSceneOut("ResultScene.fxml", paneBackground);
        }
    }

    private void changePlate() {
        if (answeredCounter < allIshiharaPlates.size()) {

            int correct = allIshiharaPlates.get(answeredCounter).getCorrectAns();
            int wrong = allIshiharaPlates.get(answeredCounter).getWrongAns();
            Image tempImg = new Image(this.getClass().getResourceAsStream("images/" + correct + "_" + wrong + ".png"));
            imageIshihara.setImage(tempImg);

            buttonCorrect.setText(((Integer) correct).toString());
            buttonWrong.setText(((Integer) wrong).toString());

            int random = rand.nextInt(allIshiharaPlates.size());
            if (random % 2 == 0)
                moveButtons();

            answeredCounter++;
        } else {

            if (correctAnswersCounter > 4)
                try {
                    patientService.updateDisease(diseaseService.findDisease("None"),
                            LoginController.loggedID);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            SceneController.fadeSceneOut("ResultScene.fxml", paneBackground);
        }
    }

    private void moveButtons() {
        double xc = buttonCorrect.getLayoutX();
        double yc = buttonCorrect.getLayoutY();

        double xw = buttonWrong.getLayoutX();
        double yw = buttonWrong.getLayoutY();

        buttonCorrect.setLayoutX(xw);
        buttonCorrect.setLayoutY(yw);

        buttonWrong.setLayoutX(xc);
        buttonWrong.setLayoutY(yc);
    }

}
