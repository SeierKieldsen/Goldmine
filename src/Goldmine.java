import java.util.Scanner;

public class Goldmine {

    public static void main(String[] args) {

        TerningertilCDIO2 terningeObjekt = new TerningertilCDIO2();
        SpilInfo switchObjekt = new SpilInfo();
        Spiller spillerObjekt = new Spiller();

        int p1score = 1000;
        int p2score = 1000;


        System.out.println("Welcome to the game! Please choose a language / Velkommen til spillet! Vælg venligst et sprog");

        Scanner picklingo = new Scanner(System.in);

        System.out.print("For english please type 'en' / For dansk skriv venligst 'dk':   ");

        String language = picklingo.next();

        switchObjekt.sprog(language);



        spillerObjekt.navn();


        while (p1score > 0 && p1score <= 3000 && p2score > 0 && p2score <= 3000) {


            System.out.println("Tast a for at rulle");
            Scanner p1 = new Scanner(System.in);
            String type = p1.next();
            if (type.equals("a")) {

                do {


                    System.out.println("Spiller1");
                    terningeObjekt.rul();
                    System.out.println(terningeObjekt.getVærdi());
                    switchObjekt.Felter(terningeObjekt.getVærdi());
                    p1score = p1score + switchObjekt.point;
                    System.out.println("P1 score:" + p1score);


                } while (terningeObjekt.getVærdi() == 10);
            }  // else {
               // System.out.println("Prøv igen tast a");
            // }



            System.out.println("tast l for at rulle");
            Scanner p2 = new Scanner(System.in);
            String type1 = p2.next();
            if (type1.equals("l")) {
                do {
                    System.out.println("Spiller2");
                    terningeObjekt.rul();
                    System.out.println(terningeObjekt.getVærdi());
                    switchObjekt.Felter(terningeObjekt.getVærdi());
                    p2score = p2score + switchObjekt.point;
                    System.out.println("P2 score:" + p2score);


                } while (terningeObjekt.getVærdi() == 10);
            }  // else {
              //  System.out.println("Prøv igen tast l");
               // p2.next();
           // }

        }
        }

    }

