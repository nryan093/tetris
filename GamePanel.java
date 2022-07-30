import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GamePanel extends JPanel implements ActionListener {

    int screenWidth = 700;
    int screenHeight = 700;
    int tick = 100;
    GameBoard board;

    GamePanel() {
        board = new GameBoard(screenWidth, screenHeight);
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
    }

    public void timer() {

    }

    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    public void draw(Graphics g) {
        board.draw(g);
    }

    public class myKeyAdapter extends KeyAdapter {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
