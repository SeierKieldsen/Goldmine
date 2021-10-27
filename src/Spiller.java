import java.util.Scanner;

public class Spiller {

    Scanner input = new Scanner(System.in);
    String Player1, Player2;

    public void navn() {
        System.out.println("player 1:");
        Player1 = input.nextLine();
        System.out.println("Player 2:");
        Player2 = input.nextLine();
    }
}

