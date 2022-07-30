import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("tetris");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
