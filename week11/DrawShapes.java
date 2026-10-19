import java.awt.*;
import java.awt.event.*;
public class DrawShapes extends Frame {
    DrawShapes() {
        setTitle("Drawing Shapes");
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void paint(Graphics g) {
        g.drawLine(50, 80, 200, 80);
        g.drawRect(50, 120, 150, 80);
        g.drawOval(50, 230, 150, 80);
    }
    public static void main(String[] args) {
        new DrawShapes();
    }
}
