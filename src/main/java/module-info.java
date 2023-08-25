module com.chankruze.logmykeys {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.chankruze.logmykeys to javafx.fxml;
    exports com.chankruze.logmykeys;
}