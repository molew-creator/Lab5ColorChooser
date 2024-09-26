module mike.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mike.lab5colorchooser to javafx.fxml;
    exports mike.lab5colorchooser;
}