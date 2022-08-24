import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet {
	Image img;
	int width; // = 200;
	int height; // = 200;
	public void init() {
		System.out.println("Inisialized");
		img = getImage(getDocumentBase(), "image.jpg");
		width = Integer.parseInt(getParameter("width")); // String to Integer
		height = Integer.parseInt(getParameter("height"));
	}

	public void paint(Graphics g) {
		// System.out.println("Painted");
		g.drawImage(img, 0, 0, width, height, this);
	}
}
