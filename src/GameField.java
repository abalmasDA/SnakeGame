import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private final int SIZE = 320;
    private final int DOTSIZE = 16;
    private final int AllDOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[AllDOTS];
    private int[] y = new int[AllDOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField() {
        setBackground(Color.black);

    }


    public void loadImages() {
        ImageIcon iia = new ImageIcon("Apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("Snake.png");
        dot = iid.getImage();
    }

}
