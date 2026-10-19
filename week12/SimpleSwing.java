import javax.swing.*;
import java.awt.event.*;
public class SimpleSwing extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField tf;
    JButton b;
    SimpleSwing() {
        l1 = new JLabel("Enter Text:");
        l1.setBounds(50, 50, 100, 30);
        tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);
        b = new JButton("Display");
        b.setBounds(100, 100, 100, 30);
        b.addActionListener(this);
        l2 = new JLabel("");
        l2.setBounds(50, 150, 300, 30);
        add(l1);
        add(tf);
        add(b);
        add(l2);
        setSize(400, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
    public static void main(String[] args) {
        new SimpleSwing();
    }
}
