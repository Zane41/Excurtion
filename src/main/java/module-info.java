module excurtion.excurtion {
    requires javafx.controls;
    requires javafx.fxml;


    opens excurtion.excurtion to javafx.fxml;
    exports excurtion.excurtion;
}