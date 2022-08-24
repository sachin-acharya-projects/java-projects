import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Applet2Application extends Frame implements ActionListener {
	JButton btn;
	Applet2Application() {
		setSize(300, 300);
		btn = new JButton("Click Me");
		btn.setBounds(0, 0, 100, 200);
		btn.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				dispose();
			}
		});
		add(btn);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		System.out.println("Butotn Clicked");
	}

	public static void main(String[] args) {
		new Applet2Application();
	}
}
