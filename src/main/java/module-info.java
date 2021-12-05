module com.signupform.signupform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.signupform.signupform to javafx.fxml;
    exports com.signupform.signupform;
}