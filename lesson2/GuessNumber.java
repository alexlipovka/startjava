public class GuessNumber {
    private int guessNumber;
    private int tryGuess1;
    private int tryGuess2;
    
    Player player1;
    Player player2;
    
    public GuessNumber() {
        
    }
    
    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int getGuessNumber() {
        return guessNumber;
    }
    
    public void setTryGuessPl1(int tryGuess1) {
        this.tryGuess1 = tryGuess1;
    }
    
    public void setTryGuessPl2(int tryGuess2) {
        this.tryGuess2 = tryGuess2;
    }
    
    public int getTryGuessPl1() {
        return tryGuess1;
    }
    
    public int getTryGuessPl2() {
        return tryGuess2;
    }
    
    public void getWin(int tryGuess1, int tryGuess2) {
        do {
            System.out.println(player1.getName() + " guess the number from 0 to 100");
            player1.setInputNumber(tryGuess1);
            if(player1.getInputNumber() == guessNumber) {
                System.out.println(player1.getName() + " Win!");
                break;             
            } else if(player1.getInputNumber() < guessNumber) {
                System.out.println("your number is less than the guesswork");
            } else if(player1.getInputNumber() > guessNumber) {
                System.out.println("your number is greater than the envisioned");
            }
    
            System.out.println(player2.getName() + " guess the number from 0 to 100");
            player2.setInputNumber(tryGuess2);
            if(player2.getInputNumber() == guessNumber) {
                System.out.println(player2.getName() + " Win!");
                break;
            } else if(player2.getInputNumber() < guessNumber) {
                System.out.println("your number is less than the guesswork");
            } else if(player2.getInputNumber()> guessNumber) {
                System.out.println("your number is greater than the envisioned");
            } 
        } while (player1.getInputNumber() != guessNumber && player2.getInputNumber() != guessNumber);
    }
}