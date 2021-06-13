public class Player {
    private String name;
    private int inputNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() { 
        return name;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }
    public int getInputNumber() {
        return inputNumber;
    }
}