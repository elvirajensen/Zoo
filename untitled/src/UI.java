import java.util.Scanner;
import javax.swing.JOptionPane;
public class UI {

    Scanner input = new Scanner(System.in);
    int userGuess;

    public UI(){

    }

    public int UserGuess(){
        this.userGuess = Integer.parseInt(JOptionPane.showInputDialog(null));
        return userGuess;
    }

    public int chooseLevel(){
        int level = Integer.parseInt(JOptionPane.showInputDialog("Please input a level:"));
        return level;

    }
}
