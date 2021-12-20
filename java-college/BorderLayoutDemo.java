// <applet code="BorderLayoutDemo.class" width=300 height=300></applet>

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JApplet{

        public void init(){

        Container contentPane=getContentPane();
        contentPane.setLayout(new BorderLayout());
        JButton jb1=new JButton("This is top");
        contentPane.add(jb1,BorderLayout.NORTH);
        JButton jb2=new JButton("This is footer");
        contentPane.add(jb2,BorderLayout.SOUTH);
        JButton jb3=new JButton("Right");
        contentPane.add(jb3,BorderLayout.EAST);
        JButton jb4=new JButton("Left");
        contentPane.add(jb4,BorderLayout.WEST);
        JTextArea jta = new JTextArea("Apples are red");
        contentPane.add(jta,BorderLayout.CENTER);
        }

}
