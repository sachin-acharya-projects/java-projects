// Applet2Application
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class Application2Applet extends Applet implements ActionListener {
	JButton btn;
	public void init() {
		btn = new JButton("Click Me");
		btn.setBounds(0, 0, 200, 100);
		btn.addActionListener(this);
		add(btn);
		setLayout(null);
		System.out.println("Init Method Executed");
	}

	public void start() {
		System.out.println("Start Method called");
	}

	public void  actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
	}

	public void stop() {
		System.out.println("Stop method called");
	}

	public void destroy() {
		System.out.println("Applet Destroyed");
	}
}
