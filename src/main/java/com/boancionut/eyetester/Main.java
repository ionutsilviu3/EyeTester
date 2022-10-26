package com.boancionut.eyetester;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {

            SceneController.setStage(primaryStage);
            Parent root = FXMLLoader.load(Main.class.getResource("SignUpScene.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setWidth(Screen.getPrimary().getBounds().getWidth() / 3);
            primaryStage.setHeight(Screen.getPrimary().getBounds().getHeight() / 2);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}