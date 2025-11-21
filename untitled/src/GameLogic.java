import java.util.Random;
public class GameLogic {
    Random random = new Random();
    private int level;
    private int nbrOfAtt;
    private int randomNumber;

    public GameLogic(int level){
        setLevel(level);
        setRandomNumber(this.level);
    }

    /**
     * this method ompares the users guess to the right answer and returns a String depending on the answer
     * @param userGuess
     * @return
     */
    public String rightAnswer(int userGuess){
        nbrOfAtt++;
        if (userGuess > randomNumber){
            return "You guessed too high, try again:";
        } else if (userGuess < randomNumber){
            return "You guessed too low, try again:";
        }else{
            return "You guessed the right number!";
        }
    }

    public int getNbrOfAtt(){
        return nbrOfAtt;
    }

    public void setRandomNumber(int level){
        this.randomNumber = random.nextInt(level + 1);
    }

    public void setLevel(int level){
        this.level = level * 10;
    }

    public int getLevel(){
        return level;
    }
}
