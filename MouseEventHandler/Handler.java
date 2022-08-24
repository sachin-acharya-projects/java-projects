import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Handler implements MouseListener, MouseMotionListener {
	Handler() {
		JFrame frame = new JFrame("MouseEventHandler");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setLayout(null);
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);

		frame.add(p);
		frame.setVisible(true);
	}
	public void print(String a) {
		System.out.println(a);
	}

	public void mousePressed(MouseEvent e) {
		print("Mouse has been pressed");
	}

	public void mouseReleased(MouseEvent e) {
		print("Mouse has been released");
	}

	public void mouseExited(MouseEvent e) {
		print("Mouse has exited");
	}

	public void mouseEntered(MouseEvent e) {
		print("Mouse Entered");
	}

	public void mouseClicked(MouseEvent e) {
		print("Mouse Clicked");
	}

	public void mouseDragged(MouseEvent e) {
		print("Mouse has been Dragged");
	}

	public void mouseMoved(MouseEvent e) {
		print("Mouse has been moved");
	}

	public static void main(String[] args) {
		new Handler();
	}
}
