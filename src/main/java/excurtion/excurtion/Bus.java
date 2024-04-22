package excurtion.excurtion;



public class Bus {


    public static String check(int[] visoty) {
        int min = 437; String otvet = null; int temp =1;
        for (int i = 0; i < visoty.length; i++) {
            if (visoty[i] > min){
                temp++;
                if (visoty.length - 1 == i)
                    otvet = "No Crash";}
            else {

                otvet = STR."Crash \{temp}";
                    break;
                }
        }
    return otvet;
    }
}