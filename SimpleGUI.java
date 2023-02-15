import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame {
    private JButton button;
    private JLabel label;
    private int count = 0;

    public SimpleGUI() {
        setLayout(new FlowLayout());

        button = new JButton("Click me");
        add(button);

        label = new JLabel("Number of clicks: 0");
        add(label);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                label.setText("Number of clicks: " + count);
            }
        };
        button.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 100);
        gui.setTitle("Simple GUI");
        gui.setVisible(true);
    }
}
//111122