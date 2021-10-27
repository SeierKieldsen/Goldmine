import java.util.Scanner;

public class Spiller {

    Scanner brugernavn = new Scanner(System.in);
    Scanner brugernavn2 = new Scanner(System.in);
    String Player1, Player2;

    public void navn() {
        System.out.println("player 1:");
        brugernavn.hasNextLine();
        this.Player1 = brugernavn.toString();
        System.out.println("Player 2:");
        brugernavn2.hasNextLine();
        this.Player2 = brugernavn2.toString();

    }
}

