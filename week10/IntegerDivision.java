
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class IntegerDivision extends Frame implements ActionListener {
    TextField num1, num2, result;
    Button divide;

    IntegerDivision() {
        setLayout(new GridLayout(4, 2));

        add(new Label("Num1:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Num2:"));
        num2 = new TextField();
        add(num2);

        add(new Label("Result:"));
        result = new TextField();
        result.setEditable(false);
        add(result);

        divide = new Button("Divide");
        add(divide);

        divide.addActionListener(this);

        setTitle("Integer Division");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());

            int c = a / b;
            result.setText(String.valueOf(c));
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Please enter integers only!");
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                "Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        new IntegerDivision();
    }
}
