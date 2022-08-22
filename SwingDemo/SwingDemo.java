import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class SwingDemo implements ActionListener{
    JButton j1;
    JButton j2;
    SwingDemo(){
        JFrame jf=new JFrame("Event Handling");
        j1=new JButton("Click Me");
        j2=new JButton("Click Me");
        jf.add(j1);
        jf.add(j2);
        j1.addActionListener(this);
        j2.addActionListener(this);
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==j1){
            j1.setText("You Clicked Me");
        }
        else{
            j2.setText("You Clicked Me");
        }
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}