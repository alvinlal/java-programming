// <applet code="nightsky.class" width=1000 height=1000>
// </applet>

import java.applet.*;
import java.awt.*;

public class nightsky extends Applet {
    public void paint(Graphics g) {
        // Draw the sky
        g.setColor(Color.blue);
        g.fillRect(0, 0, 500, 500);

        // Draw the moon
        g.setColor(Color.white);
        g.fillOval(20, 20, 100, 100);

        // Draw the stars
        g.setColor(Color.white);
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * 500);
            int y = (int) (Math.random() * 500);
            g.drawOval(x, y, 2, 2);
        }

    }
}

