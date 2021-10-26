import java.util.Scanner;

public class Spiller {

    Scanner brugernavn = new Scanner(System.in);
    Scanner brugernavn2 = new Scanner(System.in);
    String Player1, Player2;

    public void navn() {
        System.out.println("Spiller1 navn:");
        brugernavn.hasNextLine();
        this.Player1 = brugernavn.toString();
        System.out.println("spiller2 navn:");
        brugernavn2.hasNextLine();
        this.Player2 = brugernavn2.toString();

    }
}

