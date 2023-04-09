package com.armenise.gestionedellefinestre;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegistrazioneController {

    @FXML
    private TextField Cognome;
    @FXML
    private TextField Nome;
    @FXML
    private TextArea Informazioni;

    @FXML
    private Button EsciBTN;
    @FXML
    private AnchorPane scenePane;

    @FXML
    private void Esci() {

        Stage stage = (Stage) scenePane.getScene().getWindow();
        stage.close();

        //TODO funzione salvataggio dati
        /*
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Stai effettuando il Logout!");
        alert.setContentText("Confermi di voler uscire?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }
        */

    }

    @FXML
    private void Cancella() {

        Cognome.setText("");
        Nome.setText("");
        Informazioni.setText("");

    }

}
