public class Calculator {
    private int a;
    private int b;
    private char operation;
    private boolean restart;
    private char answer;
    long result;

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

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void calculate() {
        switch(this.operation) {
            case '+':
                System.out.println("Your result = " + (a + b));
                break;
            case '-':
                System.out.println("Your result = " + (a - b));
                break;
            case '*':
                System.out.println("Your result = " + (a * b));
                break;
            case '/':
                System.out.println("Your result = " + (a / b));
                break;
            case '%':
                System.out.println("Your result = " + (a % b));
                break;
            case '^':
                result = 1;
                for(int i = 0; i < b; i++) {
                    result *= a;
                }
                System.out.println("Your result = " + result);    
        }
    }
}