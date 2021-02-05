public class GuessNumber {
    private int inputNumber;
    private int answer;
    Player player1;
    Player player2;

    do {
        if(player1.inputNumber == answer) {
            System.out.println(player1.name + " Win!");
            break;
        }   else if(player2.inputNumber == answer) {
            System.out.println(player1.name + " Win!");
            break;
        }
        } while (player1.inputNumber != answer && player2.inputNumber != answer);

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
}