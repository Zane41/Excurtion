package excurtion.excurtion;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static excurtion.excurtion.Bus.check;
import static excurtion.excurtion.Bus.vvodVisot;

public class HelloController {
    @FXML
   static   Label otvet;



    @FXML
  static   TextField vvodKolva;
    @FXML
   static TextField vvodVysoty;

    @FXML
    protected void checkButton() {
        otvet.setText(check(vvodVisot(Bus.vvodKolva())));
        otvet.setVisible(true);
    }
}