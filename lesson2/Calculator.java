package lesson2;

public class Calculator {
    private int a, b;           // переменные с которыми будут производится действия
    private char operation; // действие
    private int result = 1;
    private boolean restart = true; // для проверки рестарт или завершение
    private String answer; // ответ пользователя 
    
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
                result *= a;
                b--;
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
        if(this.answer == "y") {
            return true;
        } else if(this.answer == "n") {
        } return false;
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
        a = this.a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        b = this.b;
    }

    public int getB() {
        return b;
    }
}