// <applet code="JCheckBoxDemo.class" width=400 height=250></applet>

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxDemo extends JApplet implements ItemListener{

 JCheckBox jcb,jcb1,jcb2,jcb3;
 JTextField jtf;
 
 public void init(){
	Container contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());
	jcb1=new JCheckBox("Java");
	jcb1.addItemListener(this);
	contentPane.add(jcb1);
	jcb2=new JCheckBox("Python");
	jcb2.addItemListener(this);
	contentPane.add(jcb2);
	jcb3=new JCheckBox("C++");
	jcb3.addItemListener(this);
	contentPane.add(jcb3);
	jtf=new JTextField(15);
	contentPane.add(jtf);
 }

 public void itemStateChanged(ItemEvent ie){
	jcb=(JCheckBox)ie.getItem();
	jtf.setText(jcb.getText());
 }

}
