//hans har lavet dette. pas på med at ændre, da det er vores skabelon

import java.util.Random;
import java.util.Scanner;

public class TerningertilCDIO2 {
    private int værdi;
    public void rul() {
        Random rand = new Random();
        værdi = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
    }
    public int getVærdi() {
        return værdi;
    }


    public void TerningertilCDIO2() {

        værdi = 1;


    }
}