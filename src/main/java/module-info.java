module com.armenise.gestionedellefinestre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.armenise.gestionedellefinestre to javafx.fxml;
    exports com.armenise.gestionedellefinestre;
}