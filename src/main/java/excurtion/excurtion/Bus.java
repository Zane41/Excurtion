package excurtion.excurtion;

import static excurtion.excurtion.HelloController.vvodKolva;
import static excurtion.excurtion.HelloController.vvodVysoty;

public class Bus {

    public static int vvodKolva() {
        return Integer.parseInt(vvodKolva.getText());
    }

    public static int[] vvodVisot(int kolvo) {
        int[] visoty = new int[kolvo];
        for (int i = 0; i < kolvo; i++) {
            visoty[i] = Integer.parseInt(vvodVysoty.getText());
        }
        return visoty;
    }

    public static String check(int[] visoty) {
        int min = 437; String otvet = null;
        for (int i = 0; i < visoty.length; i++) {
            if (visoty[i] > min)
                if (visoty.length - 1 == i)
                    otvet = "No Crash";
            else {
                    otvet = "Crash "+i;
                    break;
                }
        }
    return otvet;
    }
}