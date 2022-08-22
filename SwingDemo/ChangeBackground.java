import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ChangeBackground implements ActionListener {
    JFrame jf;
    ChangeBackground() {
        jf = new JFrame("Background Changable");
        jf.setSize(400, 400);

        JButton btn = new JButton("Change Background Color");
        btn.setBounds(10, 10, 360, 50);
        btn.addActionListener(this);

        jf.add(btn);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] ag) {
        new ChangeBackground();
    } 
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Pressed");
        jf.getContentPane().setBackground(Color.GREEN);
    }
}