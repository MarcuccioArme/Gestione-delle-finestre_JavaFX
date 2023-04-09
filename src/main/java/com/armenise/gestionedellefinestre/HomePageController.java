package com.armenise.gestionedellefinestre;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HomePageController {

    @FXML
    private Button EsciBTN;
    @FXML
    private AnchorPane scenePane;

    @FXML
    private void Esci() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Stai effettuando il Logout!");
        alert.setContentText("Confermi di voler uscire?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }

    }

    @FXML
    protected void Registrazione() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Registrazione.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Registrazione");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

    @FXML
    protected void Modifica() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Modifica.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Modifica");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

}