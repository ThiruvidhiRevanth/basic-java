import java.awt.*;
import java.applet.*;

public class ColorDemo extends Applet{
public void init(){
setForeground(Color.blue);}
public void paint(Graphics g){
Color c1=new Color(205,100,100);
Color c2=new Color(100,255,100);
Color c3= new Color(100,100,255);
g.setColor(c1);
g.drawRect(10,200,30,50);
g.setColor(Color.red);
g.drawLine(100,100,300,300);
g.setColor(c2);
g.fillArc(10,40,70,70,180,270);
}}
