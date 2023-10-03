module com.example.kino {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kino to javafx.fxml;
    exports com.example.kino;
}