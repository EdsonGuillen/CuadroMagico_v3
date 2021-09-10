module com.example.cuadromagico_v3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.cuadromagico_v3 to javafx.fxml;
    exports com.example.cuadromagico_v3;
}