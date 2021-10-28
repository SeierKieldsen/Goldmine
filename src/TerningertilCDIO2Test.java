import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class TerningertilCDIO2Test {

    @Test
    public void rul() {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        int dice1;


        for (int i = 0; i < 10000; i++) {
            Random rand = new Random();
            dice1 = rand.nextInt(6) + 1;

            if (dice1 == 1) {
                counter1++;
            }
            if (dice1 == 2) {
                counter2++;
            }
            if (dice1 == 3) {
                counter3++;
            }
            if (dice1 == 4) {
                counter4++;
            }
            if (dice1 == 5) {
                counter5++;
            }
            if (dice1 == 6) {
                counter6++;
            }


        }
        System.out.println("Test over 10.000 slag:");
        System.out.println("Antal 1'ere: " + counter1);
        System.out.println("Antal 2'ere: " + counter2);
        System.out.println("Antal 3'ere: " + counter3);
        System.out.println("Antal 4'ere: " + counter4);
        System.out.println("Antal 5'ere: " + counter5);
        System.out.println("Antal 6'ere: " + counter6);

        // tester med 5% afvigelse.

        assertTrue("Testen er fejlet med 1'ere.", counter1 < 2166 && counter1 > 1166);
        assertTrue("Testen er fejlet med 2'ere.", counter2 < 2166 && counter2 > 1166);
        assertTrue("Testen er fejæet med 3'ere.", counter3 < 2166 && counter3 > 1166);
        assertTrue("Testen er fejlet med 4'ere.", counter4 < 2166 && counter4 > 1166);
        assertTrue("Testen er fejlet med 5'ere.", counter5 < 2166 && counter5 > 1166);
        assertTrue("Testen er fejlet med 6'ere.", counter6 < 2166 && counter6 > 1166);

    }
}