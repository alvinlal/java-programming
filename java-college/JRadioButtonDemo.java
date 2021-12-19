// <applet code="JRadioButtonDemo.class" width=400 height=400></applet>

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonDemo extends JApplet implements ActionListener{

	JRadioButton jrb1,jrb2;
	JTextField jtf;
	ButtonGroup bg;

	public void init(){
	Container contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());
	jrb1=new JRadioButton("Male");
	jrb1.addActionListener(this);
	contentPane.add(jrb1);
	jrb2=new JRadioButton("Female");
	jrb2.addActionListener(this);
	contentPane.add(jrb2);
	bg=new ButtonGroup();
	bg.add(jrb1);
	bg.add(jrb2);
	jtf=new JTextField(10);
	contentPane.add(jtf);
	}

	public void actionPerformed(ActionEvent ae){
		jtf.setText(ae.getActionCommand());
	}
}
