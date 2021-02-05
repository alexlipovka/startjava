public class GuessNumber {
    Player player1;
    Player player2;

    do {
        if(player1.inputNumber == answer) {
            System.out.println(player1.name + " Win!");
            break;
        }   else if(player2.inputNumber == answer) {
            System.out.println(player1.name + " Win!");
        }
        } while (player1.inputNumber != answer && player2.inputNumber != answer)
}