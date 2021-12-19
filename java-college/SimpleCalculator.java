// <applet code="SimpleCalculator.class" width=300 height=300></applet>


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SimpleCalculator extends Applet implements ActionListener{

	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	double x,y,z;
	
	public void init(){
	l1=new Label("First Number:");
	l2=new Label("Second Number:");
	l3=new Label("Answer:");
	tf1=new TextField(20);
	tf2=new TextField(20);
	tf3=new TextField(20);
	b1=new Button("Add");
	b2=new Button("Subtract");
	b3=new Button("Multiply");
	b4=new Button("Divide");

	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(l3);
	add(tf3);
	add(b1);
	add(b2);
	add(b3);
	add(b4);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae){

	String str=ae.getActionCommand();
	x=Double.parseDouble(tf1.getText());
	y=Double.parseDouble(tf2.getText());
	if(str.equals("Add"))
	z=x+y;
	if(str.equals("Subtract"))
	z=x-y;
	if(str.equals("Multiyply"))
	z=x*y;
	if(str.equals("Divide"))
	z=x/y;
	tf3.setText(String.valueOf(z));
	repaint();
	}

}


