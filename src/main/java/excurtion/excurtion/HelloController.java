package excurtion.excurtion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static excurtion.excurtion.Bus.check;


public class HelloController {
    @FXML
    Label otvet;

    @FXML
    Button checkButton;

    @FXML
    TextField vvodKolva;

    @FXML
    TextField vvodVysoty;

    protected int [] getHeights(){
    int kolvo = Integer.parseInt(vvodKolva.getText());
    String visoty = vvodVysoty.getText();
    String [] visotyArr = visoty.split(" ");
    int [] heights = new int[kolvo];
    for (int i = 0; i < visotyArr.length; i++)
        heights[i] = Integer.parseInt(visotyArr[i]);
    return heights;
}

    public void initialize() {



        checkButton.setOnAction(_ ->{
                    otvet.setText(check(getHeights()));
                    otvet.setVisible(true);
                }
        );
}
}