import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * Board Class
 *
 * @author Murray Warne
 * @version V1.0
 */
public class Board
{
    public JPanel board = new JPanel(new GridLayout(8,8));
    HashMap<Integer, Integer> placement = new HashMap<>();
    /**
     * Adds the jbuttons to the board
     */
    public Board()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int a = 0; a < 8; a++)
            {
                JButton b = new JButton("");
                board.add(b);
            }
        }
    }
    
    public JPanel getPanel()
    {
        return board;
    }
}
