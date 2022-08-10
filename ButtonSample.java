import java.awt.*;
import java.awt.event.*;

import java .applet.*;
public class ButtonSample extends Applet implements ActionListener{
String mess;
public void init(){
TextField st =new TextField("     ",50);
st.setBounds(200,300,500,50);
Button s=new Button("button");
add(s);
add(st);
s.addActionListener(this);
s.setBounds(100,300,50,60);
}

public void actionPerformed(ActionEvent ev){
String action=ev.getActionCommand();

mess="aree";
repaint();
}
public void paint(Graphics g){
g.drawString(mess,70,50);
}}
