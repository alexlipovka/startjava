import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player("Vasya");

        Player player2 = new Player("Kolya");
        System.out.println("угадайте число");
        Random randomInt = new Random();
        final answer = randomInt.nextUnt(101);
        
    }
}