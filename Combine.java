import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Combine extends Applet implements ActionListener{
Button b;
public void init(){
b=new Button("enter");
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
AppletContext et=getAppletContext();
Applet a=et.getApplet("app2");
a.setBackground(Color.yellow);}}