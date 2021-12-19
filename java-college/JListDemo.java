// <applet code="JListDemo.class" width=400 height=300></applet>
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class JListDemo extends JApplet implements ListSelectionListener{

	JList jl;
	JTextField jtf;
	String fruits[]={"Apple","Orange","Banana","Grapes","Pear"};

	public void init(){
	Container contentPane=getContentPane();
	contentPane.setLayout(new FlowLayout());
	jl=new JList(fruits);
	jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	jtf=new JTextField(25);
	contentPane.add(jtf);
	contentPane.add(jl);
	jl.addListSelectionListener(this);
	}

	public void valueChanged(ListSelectionEvent ie){
	int idx = jl.getSelectedIndex();
	String s=fruits[idx];
	String str="You selected "+s;
	jtf.setText(str);
	}
}
