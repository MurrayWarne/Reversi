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
        Board board = new Board();
        JFrame frame = new JFrame("Reversi"); // Creates a frame named reversi
        JPanel player = makePlayerPanel(); // Sets the Player Panel to a jpanel called player
        JLabel status = new JLabel("Please enter your names and press start to continue"); // Label to hold the status bar
        frame.add(player, BorderLayout.EAST); // Adds the score to the right of the frame
        frame.add(board.getPanel(), BorderLayout.CENTER); // adds the board to the left of the frame
        frame.add(status,BorderLayout.SOUTH); // Adds the status to the bottom of the board
        frame.pack();
        frame.setVisible(true); // Makes the frame visible
    }
    
    /**
     * Creates the player panel so it can be added to the frame
     */
    private JPanel makePlayerPanel()
    {
        JPanel player = new JPanel();// Creates the JPanel to hold the score and player names
        // Holds the inputs for player names
        JOptionPane player1 = new JOptionPane("Enter Player 1 Here"); 
        JOptionPane player2 = new JOptionPane("Enter Player 2 Here"); 
        // Creates the labels to hold player scores
        JLabel score1 = new JLabel("Player 1's Score"); 
        JLabel score2 = new JLabel("Player 2's Score");
        // Creates the labels to hold the number of discs each player has
        JLabel discs1 = new JLabel("Player 1's Discs");
        JLabel discs2 = new JLabel("Player 2's Discs");
        //Creates the button to start the game
        JButton play = new JButton("Play"); // Creates a new button called play
        // Adds all of the elements to the panel
        player.add(player1); 
        player.add(score1);
        player.add(discs1);
        player.add(player2); 
        player.add(score2);
        player.add(discs2);
        player.add(play); 
        return player; // returns the JPanel
    }
}
