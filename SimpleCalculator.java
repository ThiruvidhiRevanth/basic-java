import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class SimpleCalculator extends Applet implements ActionListener{

Double fin;
Label t=new Label ("first number");
Label s=new Label("Second number");
Label f=new Label("Third nuber");

TextField tf=new TextField(5);
TextField ts=new TextField(5);
TextField tt= new TextField(5);
Button e=new Button("Enter");
Button ef=new Button("+");
Button es=new Button("-");
Button et=new Button("x");
Button er=new Button("/");

public void init(){
t.setBounds(20,150,150,100);
s.setBounds(20,240,150,100);
f.setBounds(20,350,150,100);
tf.setBounds(100,180,250,40);
ts.setBounds(100,270,250,40);
tt.setBounds(100,330,250,40);
ef.setBounds(20,400,100,100);
es.setBounds(100,400,100,100);
et.setBounds(180,400,100,100);
er.setBounds(260,400,100,100);
e.setBounds(180,200,100,100);
add(t);
add(s);
add(f);
add(tf);
add(ts);
add(tt);
add(ef);
add(es);
add(et);
add(er);
add(e);
e.addActionListener(this);
ef.addActionListener(this);
es.addActionListener(this);
et.addActionListener(this);
er.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
String res=ae.getActionCommand();
double v1=Double.parseDouble(tf.getText());
double v2=Double.parseDouble(ts.getText());
if(ae.getSource()==ef)
{
fin=v1+v2;
}
else if(ae.getSource()==es){
fin=v1-v2;}
else if(ae.getSource()==et){
fin=v1*v2;
}
else{
fin=v1%v2;
}
repaint();
}
public void paint(Graphics g){
g.drawString("result :"+fin,300,400);


}}
