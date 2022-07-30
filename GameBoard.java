import java.awt.*;

public class GameBoard {

    private int width;
    private int height;
    int[][] grid = new int[20][10];
    int gridSqSize = 25;
    int xStart;
    int yStart = 50;
    Piece curPiece;

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        xStart = (this.width / 2) - ((gridSqSize * grid[0].length) / 2);
        int rand = (int) (Math.random() * 6) + 1;
        try {
            curPiece = new Piece(rand, xStart, yStart, gridSqSize);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < grid.length; i++) {
            // row
            g.drawRect(xStart, yStart + (gridSqSize * i), gridSqSize, gridSqSize);
            for (int j = 0; j < grid[i].length; j++) {
                // coloum
                g.drawRect(xStart + (gridSqSize * j), yStart + (gridSqSize * i), gridSqSize, gridSqSize);
            }
        }
        curPiece.draw(g);
    }
}