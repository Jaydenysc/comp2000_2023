import java.awt.*;

public class Grid extends Cell {
    public void paint(Graphics g, int x, int y, int gridWidth, int gridHeight) {
        Cell cell[][] = new Cell[20][20];
        int k = 0;
        int l = 0;
        for (int i = x; i < gridWidth; i += 35) {
            for (int j = y; j < gridHeight; j += 35) {
                cell[l][k].paint(g, i, j, 35, 35, Color.WHITE, Color.BLACK);
                k += 1;
            }
            l += 1;
        }

    }
}
