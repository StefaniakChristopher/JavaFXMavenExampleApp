module com.temperatureconverter {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.temperatureconverter to javafx.fxml;
    exports com.temperatureconverter;
}
