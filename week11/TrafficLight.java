
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends Frame implements ItemListener {
    Checkbox red, yellow, green;
    CheckboxGroup group;
    Label l;

    TrafficLight() {
        setLayout(new FlowLayout());

        group = new CheckboxGroup();

        red = new Checkbox("Red", group, false);
        yellow = new Checkbox("Yellow", group, false);
        green = new Checkbox("Green", group, false);

        add(red);
        add(yellow);
        add(green);

        l = new Label("No light is ON");
        add(l);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);

        setTitle("Traffic Light");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        if (red.getState())
            l.setText("RED LIGHT ON - STOP");
        else if (yellow.getState())
            l.setText("YELLOW LIGHT ON - WAIT");
        else if (green.getState())
            l.setText("GREEN LIGHT ON - GO");
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
