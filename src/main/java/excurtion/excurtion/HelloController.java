package excurtion.excurtion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static excurtion.excurtion.Bus.check;
import static excurtion.excurtion.Bus.vvodVisot;

public class HelloController {
    @FXML
   static   Label otvet;

@FXML
Button checkButton;

    @FXML
   static TextField vvodKolva;
    @FXML
   static TextField vvodVysoty;


    public void initialize() {

        checkButton.setOnAction(x->{
                otvet.setText(check(vvodVisot(Bus.vvodKolva())));
                otvet.setVisible(true);
            }
        );

    }
}