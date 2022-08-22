// package AppletDemo;
import java.applet.Applet;
// import java.awt.Color;
import java.awt.*;

public class AppletDemo extends Applet {
    public void init() {
        setBackground(Color.CYAN);
    }

    public void paint(Graphics g) {
        g.drawString("Hello World", 50, 50);
    }

    public void start() {
	System.out.println("Applet Started --");
    }

    public void stop() {
	System.out.println("Applet Stopped");
    }

    public void destroy() {
	System.out.println("Applet Destroyed");
    }
}