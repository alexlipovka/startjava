import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player("Vasya");

        Player player2 = new Player("Kolya");
        System.out.println(player1, player2);
    }
}