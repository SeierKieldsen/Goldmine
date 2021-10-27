


import java.util.Scanner;

public class Goldmine {

    public static void main(String[] args) {

        TerningertilCDIO2 terningeObjekt = new TerningertilCDIO2();
        SpilInfo switchObjekt = new SpilInfo();
        Spiller spillerObjekt = new Spiller();

        int p1score = 1000;
        int p2score = 1000;


        System.out.println("Welcome to the game! Please choose a language / Velkommen til spillet! Vælg venligst et sprog");

        String language;
        Scanner picklingo = new Scanner(System.in);
        do {
            System.out.print("For english please type 'en' / For dansk skriv venligst 'dk':   ");

            language = picklingo.next();
        } while(!switchObjekt.sprog(language));


        spillerObjekt.navn();

        do {

            while (p1score > 0 && p1score <= 3000) {


                if(switchObjekt.language.equals("dk")) {
                    System.out.println(spillerObjekt.Player1 + "´ tur");
                    System.out.println("Tast 'a' for at rulle");
                }
                if (switchObjekt.language.equals("en")){
                    System.out.println(spillerObjekt.Player1 + "´ turn");
                    System.out.println("Press 'a' to roll");
                }
                Scanner p1 = new Scanner(System.in);
                String type = p1.next();

                if (type.equals("a")) {

                    do {

                        terningeObjekt.rul();
                        System.out.println(terningeObjekt.getVærdi());
                        switchObjekt.Felter(terningeObjekt.getVærdi());
                        p1score = p1score + switchObjekt.point;
                        System.out.println("P1 score:" + p1score);


                    } while (terningeObjekt.getVærdi() == 10);
                    if (terningeObjekt.getVærdi() != 10) {
                        break;
                    }
                }
                if (!type.equals("a")) {
                    if(switchObjekt.language.equals("dk")) {
                        System.out.println("Prøv igen.");
                    }
                    if (switchObjekt.language.equals("en")) {
                        System.out.println("Try again.");
                    }
                    continue;


                }

            }
            while (p2score > 0 && p2score <= 3000) {

                if(switchObjekt.language.equals("dk")) {
                    System.out.println(spillerObjekt.Player2 + "´ tur");
                    System.out.println("Tast 'l' for at rulle");
                }
                if (switchObjekt.language.equals("en")){
                    System.out.println(spillerObjekt.Player2 + "´ turn");
                    System.out.println("Press 'l' to roll");
                }

                Scanner p2 = new Scanner(System.in);
                String type1 = p2.next();
                if (type1.equals("l")) {
                    do {
                        terningeObjekt.rul();
                        System.out.println(terningeObjekt.getVærdi());
                        switchObjekt.Felter(terningeObjekt.getVærdi());
                        p2score = p2score + switchObjekt.point;
                        System.out.println("P2 score:" + p2score);


                    } while (terningeObjekt.getVærdi() == 10);
                    if (terningeObjekt.getVærdi() != 10) {
                        break;
                    }
                }
                if (!type1.equals("l")) {
                    if(switchObjekt.language.equals("dk")) {
                        System.out.println("Prøv igen.");
                    }
                    if (switchObjekt.language.equals("en")) {
                        System.out.println("Try again.");
                    }
                    continue;

                }
            }
        } while (p1score < 3000 && p2score < 3000 && p1score > 0 && p2score > 0);

        if (p1score > p2score) {
            if (switchObjekt.language.equals("dk")) {
                System.out.println("Tillykke " + spillerObjekt.Player1 + " vinder");
            }
            if (switchObjekt.language.equals("en")) {
                System.out.println("Congratulations " + spillerObjekt.Player1 + " wins");
            }
        }
        if (p1score < p2score) {
            if (switchObjekt.language.equals("dk")) {
                System.out.println("Tillyke " + spillerObjekt.Player2 + " vinder");
            }
            if (switchObjekt.language.equals("en")){
                System.out.println("Congratulations " + spillerObjekt.Player2 + " wins");
            }
        }
        if (p1score == p2score) {
            if (switchObjekt.language.equals("dk")) {
                System.out.println("Den blev uafgjort");
            }
            if (switchObjekt.language.equals("en")) {
                System.out.println("It was a draw");
            }
        }

    }

}




