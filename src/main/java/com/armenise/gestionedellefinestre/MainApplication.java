package com.armenise.gestionedellefinestre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("HomePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);
        stage.setTitle("Gestione delle finestre");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);    //Per togliere i pulsanti funzione dalla finestra
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}