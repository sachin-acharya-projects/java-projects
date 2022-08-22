import java.awt.event.*;
import javax.swing.*;

public class SwingTextBoxDemo implements ActionListener {
    JFrame frame;
    JButton button;
    JLabel lb_1, lb_2;
    JTextField textField, textField_2;

    SwingTextBoxDemo() {
        frame = new JFrame("Upper case converter");
        frame.setSize(500, 500);

        lb_1 = new JLabel("Enter First String");
        lb_1.setBounds(10, 10, 460, 50);

        textField = new JTextField();
        textField.setBounds(10, 60, 460, 50);

        lb_2 = new JLabel("Enter Second String");
        lb_2.setBounds(10, 120, 460, 50);

        textField_2 = new JTextField();
        textField_2.setBounds(10, 170, 460, 50);

        button = new JButton("Convert Lowercase to Uppercase");
        button.setBounds(10, 250, 460, 50);
        button.addActionListener(this);

        frame.add(lb_1);
        frame.add(lb_2);
        frame.add(textField);
        frame.add(textField_2);
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String v_1 = textField.getText().toUpperCase();
        String v_2 = textField_2.getText().toUpperCase();

        System.out.println(v_1 + " " + v_2);
        System.exit(0);
    }

    public static void main(String[] args) {
        new SwingTextBoxDemo();
    }
}