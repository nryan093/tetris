import java.awt.Color;
import java.awt.Graphics;

public class Piece {

    int gridSqSize = 25;
    int xStart;
    int yStart = 50;
    public int type;
    private int[][] block;
    private Color color;
    int row = 0;
    int col = 0;

    // z, s, j, l, i, t, square(think of a letter)

    // inherits g from draw in gamePanel

    public Piece(int type, int xStart, int yStart, int gridSqSize) throws Exception {
        this.xStart = xStart;
        this.yStart = yStart;
        this.gridSqSize = gridSqSize;

        if (type == 1) {
            int[][] z = {
                    { 0, 0, 0, 0 },
                    { type, type, 0, 0 },
                    { 0, type, type, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = z;
            this.color = Color.green;
        } else if (type == 2) {
            int[][] s = {
                    { 0, 0, 0, 0 },
                    { 0, type, type, 0 },
                    { type, type, 0, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = s;
            this.color = Color.red;
        } else if (type == 3) {
            int[][] j = {
                    { 0, type, 0, 0 },
                    { 0, type, 0, 0 },
                    { type, type, 0, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = j;
            this.color = Color.orange;
        } else if (type == 4) {
            int[][] l = {
                    { 0, type, 0, 0 },
                    { 0, type, 0, 0 },
                    { 0, type, type, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = l;
            Color c = new Color(66, 185, 245);
            this.color = c;
        } else if (type == 5) {
            int[][] i = {
                    { 0, type, 0, 0 },
                    { 0, type, 0, 0 },
                    { 0, type, 0, 0 },
                    { 0, type, 0, 0 }
            };
            this.block = i;
            this.color = Color.blue;
        } else if (type == 6) {
            int[][] t = {
                    { 0, 0, 0, 0 },
                    { 0, type, 0, 0 },
                    { type, type, type, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = t;
            this.color = Color.magenta;
        } else if (type == 7) {
            int[][] sq = {
                    { 0, 0, 0, 0 },
                    { 0, type, type, 0 },
                    { 0, type, type, 0 },
                    { 0, 0, 0, 0 }
            };
            this.block = sq;
            this.color = Color.yellow;
        } else {
            throw new Exception("You're stupid");
        }

        System.out.println("A" + type);
        System.out.println("A" + this.block);
    }

    // on [][] array first one is row second is coloum
    public void draw(Graphics g) {

        for (int i = 0; i < block.length; i++) {

            for (int j = 0; j < block[i].length; j++) {
                if (block[i][j] != 0) {
                    g.setColor(this.color);
                    g.fillRect(xStart + (col * gridSqSize) + (j * gridSqSize),
                            yStart + (row * gridSqSize) + (i * gridSqSize), gridSqSize, gridSqSize);
                    g.setColor(Color.black);
                    g.drawRect(xStart + (col * gridSqSize) + (j * gridSqSize),
                            yStart + (row * gridSqSize) + (i * gridSqSize), gridSqSize, gridSqSize);
                }
            }
        }
    }
}
