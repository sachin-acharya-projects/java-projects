import java.awt.event.*;
// import java.awt.*;
import javax.swing.*;

public class SwingDemo2 implements ActionListener{
    JLabel j1;
    JButton j2;
    JFrame jf;
    SwingDemo2(){
        jf = new JFrame("Termination Window");
        jf.setSize(500, 500);
        j1 = new JLabel("Click the button to close the window");
        j1.setBounds(10, 10, 100, 50);

        j2 = new JButton("Close");
        j2.setBounds(10, 60, 100, 50);
        j2.addActionListener(this);

        jf.add(j1);
        jf.add(j2);

        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==j2){
            j1.setText("You Clicked Me - Exiting the Window");
            jf.dispose();
        }
    }

    public static void main(String[] args) {
        new SwingDemo2();
    }
}
