
import java.awt.*;
import java.awt.event.*;

public class KeyboardDemo extends Frame implements KeyListener {
    Label l;

    KeyboardDemo() {
        l = new Label("Press any key");
        add(l);

        addKeyListener(this);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardDemo();
    }
}
