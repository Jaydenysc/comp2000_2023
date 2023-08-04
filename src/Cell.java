import javax.swing.*;
import java.awt.*;

public class Cell extends JFrame {
    public void paint(Graphics g, int x, int y, int width, int height, Color color, Color outline) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setColor(outline);
        g.drawRect(x, y, width, height);
    }
}
