module desktop.module {
    requires javafx.controls;
    requires javafx.fxml;
    requires core.module;

    opens com.example.desktop to javafx.fxml; //reflection
    exports com.example.desktop;
}