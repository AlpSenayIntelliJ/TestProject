module com.example.testproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.example.testproject to javafx.fxml;
    exports com.example.testproject;
}