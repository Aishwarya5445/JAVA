
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField t;
    double a, b;
    char op;

    Calculator() {
        t = new TextField();
        add(t, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));

        String s[] = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            "0", "C", "=", "%"
        };

        for (int i = 0; i < s.length; i++) {
            Button bt = new Button(s[i]);
            p.add(bt);
            bt.addActionListener(this);
        }

        add(p, BorderLayout.CENTER);
        setSize(250, 250);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.matches("[0-9]")) {
            t.setText(t.getText() + s);
        } else if (s.equals("C")) {
            t.setText("");
        } else if (s.equals("=")) {
            b = Double.parseDouble(t.getText());

            if (op == '+')
                a = a + b;
            else if (op == '-')
                a = a - b;
            else if (op == '*')
                a = a * b;
            else if (op == '%')
                a = a % b;

            t.setText("" + a);
        } else {
            a = Double.parseDouble(t.getText());
            op = s.charAt(0);
            t.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
