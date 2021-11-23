// create a program that displays a smiley face using java applets

import java.applet.*;
import java.awt.*;

// <applet code="smiley.java" width=300 height=300></applet>
public class smiley extends Applet {

    public void paint(Graphics g) {
        g.drawOval(80, 70, 150, 150);

        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
