// <applet code="keyboardevent.class" width=300 height=300></applet>

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class keyboardevent extends Applet implements KeyListener {
    String msg = "hello";

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }

}
