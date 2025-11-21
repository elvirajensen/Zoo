import java.util.Scanner;
import javax.swing.JOptionPane;
public class Controller {
    GameLogic logic;
    UI ui;
    Scanner input = new Scanner(System.in);



    public Controller(){
        UI ui = new UI();
        GameLogic logic = new GameLogic(ui.chooseLevel());

        JOptionPane.showMessageDialog(null, "guess a number between 1 and " + logic.getLevel());
        String blah = logic.rightAnswer(ui.UserGuess());
        JOptionPane.showMessageDialog(null, blah);

        while (!(blah.equals("You guessed the right number!"))){
            blah = logic.rightAnswer(ui.UserGuess());
            JOptionPane.showMessageDialog(null, blah);
        }
        JOptionPane.showMessageDialog(null, "It took you " + logic.getNbrOfAtt() + " attempts to guess the right number");
    }
}

