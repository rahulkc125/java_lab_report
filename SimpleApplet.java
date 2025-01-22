import java.applet.Applet;
import java.awt.Graphics;

// Creating an applet class by extending Applet class
public class SimpleApplet extends Applet {

    // Method to display content on the applet
    public void paint(Graphics g) {
        g.drawString("Hello, this is a simple Java Applet!", 50, 50);
    }
}

