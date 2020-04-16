import java.awt.*;
import javax.swing.*;
/**
 * Main class of the application
 *
 * @author Murray Warne
 * @version V1.0
 */
public class Reversi
{
    /**
     * Constructor for objects of class Reversi
     */
    public Reversi()
    {
        // initialise instance variables
        makeFrame();
    }

    /**
     * This is used to create the frame used for the main game board
     */
    private void makeFrame()
    {
        JFrame frame = new JFrame("Reversi"); // Creates a frame named reversi
        JPanel score = new JPanel(new BorderLayout()); // Creates the JPanel to hold the score and player names
        JPanel board = new JPanel(new BorderLayout()); // Creates the JPanel to hold the game board
        JLabel status = new JLabel("Please enter your names and press start to continue"); // Label to hold the status bar
        frame.add(score, BorderLayout.EAST); // Adds the score to the right of the frame
        frame.add(board, BorderLayout.CENTER); // adds the board to the left of the frame
        frame.add(status,BorderLayout.SOUTH); // Adds the status to the bottom of the board
        frame.pack();
        frame.setVisible(true); // Makes the frame visible
    }
}
