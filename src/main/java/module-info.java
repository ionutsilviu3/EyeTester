module com.boancionut.eyetester {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens com.boancionut.eyetester to javafx.fxml;
    opens com.boancionut.eyetester.dao;
    opens com.boancionut.eyetester.entities;
    exports com.boancionut.eyetester;
    exports com.boancionut.eyetester.entities;

}