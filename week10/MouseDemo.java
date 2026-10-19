import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener {
    Label l;
    MouseDemo() {
        l = new Label("Perform mouse actions");
        add(l);
        addMouseListener(this);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new MouseDemo();
    }
}
