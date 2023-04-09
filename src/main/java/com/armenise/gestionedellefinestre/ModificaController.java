package com.armenise.gestionedellefinestre;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ModificaController {

    @FXML
    private Button EsciBTN;
    @FXML
    private AnchorPane scenePane;

    @FXML
    private void Esci() {

        Stage stage = (Stage) scenePane.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void Cancella() {
    }

}
