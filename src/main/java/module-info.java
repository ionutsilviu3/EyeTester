module com.boancionut.eyetester {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.boancionut.eyetester to javafx.fxml;
    exports com.boancionut.eyetester;

}