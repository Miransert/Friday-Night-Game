module com.example.fridaynight {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.fridaynight to javafx.fxml;
    exports com.example.fridaynight;
}