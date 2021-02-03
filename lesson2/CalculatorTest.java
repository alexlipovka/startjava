import java.util.Scanner;

public class CalculatorTest {
    private boolean restart;
    private char answer;
    public boolean setRestart(char answer) {
        if(answer == 'y') {
            return restart = true;
        } else if(answer == 'n') {
        } return restart = false;
    }

    public boolean getRestart() {
        return restart;
    }
    
    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
    
    public static void main(String[] args) {
        CalculatorTest answeCycle = new CalculatorTest();
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
                
        do {
            System.out.println("Enter first number");
            calc.setA(scan.nextInt());

            System.out.println("Enter operation:");
            char operation = scan.next().charAt(0);
            calc.setOperation(operation);

            System.out.println("Enter second number");
            calc.setB(scan.nextInt());
            calc.calculate();
            scan.reset();

            System.out.println("want to use the program again? enter y / n ");
            char playerAnswer;
            do {
                playerAnswer = scan.next().charAt(0);
                answeCycle.setAnswer(playerAnswer);
                if(playerAnswer == 'y') {
                    answeCycle.setRestart(playerAnswer);
                } else if(playerAnswer == 'n') {
                    answeCycle.setRestart(playerAnswer);
                } else {
                    System.out.println("you entered an invalid value, please try again");
                }
            } while(answeCycle.getAnswer() != 'y' && answeCycle.getAnswer() != 'n');
        } while(answeCycle.getRestart());
        scan.close();
    }
}