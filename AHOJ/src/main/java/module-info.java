module com.example.ahoj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ahoj to javafx.fxml;
    exports com.example.ahoj;
}