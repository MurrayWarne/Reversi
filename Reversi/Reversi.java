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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private void makeFrame()
    {
        JFrame frame = new JFrame("Reversi");
        frame.pack();
        frame.setVisible(true);
    }
}
