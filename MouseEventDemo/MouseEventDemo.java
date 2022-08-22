package MouseEventDemo;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class MouseEventDemo implements MouseListener {
    JFrame f;
    JPanel p;
    JLabel l1, l2, l3;

    MouseEventDemo() {
        f = new JFrame("Mouse Event Demo");
        f.setSize(600, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setLayout(new FlowLayout());

        l1 = new JLabel("No Event Occured");
        l2 = new JLabel("No Event Occured");
        l3 = new JLabel("No Event Occured");

        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.add(p);

        f.addMouseListener(this);
        f.setVisible(true);
        // f.show();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }

    public void mouseReleased(MouseEvent me) {
        l1.setText("Mouse Released");
    }

    public void mousePressed(MouseEvent me) {
        l1.setText("Mouse Pressed");
    }

    public void mouseExited(MouseEvent me) {
        l2.setText("Mouse Exited");
    }

    public void mouseEntered(MouseEvent me) {
        l2.setText("Mouse Entered");
    }

    public void mouseClicked(MouseEvent me) {
        l3.setText("Mouse Clicked");
    }
}