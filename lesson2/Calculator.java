package dinsv.calc;

public class Calculator {
    private int a, b;           
    private char operation; 
    private boolean restart = true; 
    private String answer;
    int result = 1;
    
    public void setResult(char operation) { 
        switch(this.operation) {
            case '+': result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
               break;
            case '%': result = a % b;
                break;
            case '^': while(b >= 1) {
                result *=a;
                b--;
                //result = r;
                }
        }
    }

    public int getResult() {
        return result;
    }

    public void printResult() {
        System.out.println("your result = " + result);
    }

    public boolean setRestart(String answer) {
        if(this.answer == "yes") {
            return restart = true;
        } else if(this.answer == "no") {
        } return restart = false;
    }
    
    public boolean getRestart() {
        return restart;
        }
    

    public String getAnswer() {
       return answer;
    }

    public void setAnswer(String answer) {
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