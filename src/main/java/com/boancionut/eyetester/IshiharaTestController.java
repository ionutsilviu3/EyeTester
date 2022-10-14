package com.boancionut.eyetester;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SceneController.fadeSceneIn(paneBackground);
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

            /*try {
                patientService.updateDisease(diseaseService.findDisease("Mild Colorblindness"),
                        LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            //SceneController.fadeSceneOut("ResultScene.fxml", paneBackground);
        }

        else if (wrongAnswersCounter >= 7 && correctAnswersCounter <= 0) {
            System.out.println("Not yet implemented");
            /*try {
                patientService.updateDisease(diseaseService.findDisease("Colorblind"), LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }

    }

    @FXML
    private void noneAnswer(ActionEvent event) {
        if (noneAnswersCounter < 3) {
            noneAnswersCounter++;
            changePlate();
        } else {
            System.out.println("Not yet implemented");
            /*try {
                patientService.updateDisease(diseaseService.findDisease("Colorblind"), LoginController.loggedID);
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            SceneController.fadeSceneOut("ResultScene.fxml", paneBackground);
        }
    }

    private void changePlate() {

        /*if (answeredCounter < allishiharaPlates.size()) {

            int correct = allishiharaPlates.get(answeredCounter).getCorrectAns();
            int wrong = allishiharaPlates.get(answeredCounter).getWrongAns();
            Image tempImg = new Image("/resources/images/" + correct + "_" + wrong + ".png");
            imageIshihara.setImage(tempImg);

            buttonCorrect.setText(((Integer) correct).toString());
            buttonWrong.setText(((Integer) wrong).toString());

            int random = rand.nextInt(allishiharaPlates.size());
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

            SceneController.fadeSceneOut("/controllers/DiseaseResultScene.fxml", paneBackground);
        }*/
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
