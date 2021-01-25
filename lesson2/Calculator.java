public class Calculator {
    private int a, b;           
    private char operation; 
    private boolean restart; 
    private char answer;
    long result = 1;
    
    public void calculate() { 
        switch(this.operation) {
            case '+': System.out.println("Your result = " + (a + b));
                break;
            case '-': System.out.println("Your result = " + (a - b));
                break;
            case '*': System.out.println("Your result = " + (a * b));
                break;
            case '/': System.out.println("Your result = " + (a / b));
               break;
            case '%': System.out.println("Your result = " + (a % b));
                break;
            case '^': while(b >= 1) {
                result *=a;
                b--;
                if(b==1) {
                    System.out.println("Your result = " + result);
                }
            }
                   
        }
    }

    public long getResult() {
        return result;
    }

    public void printResult() {
        System.out.println("your result = " + result);
    }
    
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

    public char getOperation() {
        return operation;
    }
    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
       return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}