module com.kalkul.kalkul {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.kalkul.kalkul to javafx.fxml;
    exports com.kalkul.kalkul;
}