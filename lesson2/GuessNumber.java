public class GuessNumber {
    private int guessNumber;
    private int tryGuess1;
    private int tryGuess2;
    
    Player pl1;
    Player pl2;
    
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
    
    public void getWin() {
        do {
            System.out.println(pl1.getName() + " guess the number from 0 to 100");
            pl1.setInputNumber(tryGuess1);
            if(pl1.getInputNumber() == guessNumber) {
                System.out.println(pl1.getName() + " Win!");
                break;             
            } else if(pl1.getInputNumber() < guessNumber) {
                System.out.println("your number is less than the guesswork");
            } else if(pl1.getInputNumber() > guessNumber) {
                System.out.println("your number is greater than the envisioned");
            }
    
            System.out.println(pl2.getName() + " guess the number from 0 to 100");
            pl2.setInputNumber(tryGuess2);
            if(pl2.getInputNumber() == guessNumber) {
                System.out.println(pl2.getName() + " Win!");
                break;
            } else if(pl2.getInputNumber() < guessNumber) {
                System.out.println("your number is less than the guesswork");
            } else if(pl2.getInputNumber()> guessNumber) {
                System.out.println("your number is greater than the envisioned");
            } 
        } while (pl1.getInputNumber() != guessNumber && pl2.getInputNumber() != guessNumber);
    }
}