import java.awt.*;
import java.applet.*;
public class passing extends Applet{
String name;
String age;
String roll;
public void init(){
name=getParameter("Name");
age=getParameter("Age");
roll=getParameter("Roll");
setForeground(Color.blue);
}
public void paint(Graphics g){
g.drawString("student detials=" ,20,40);
g.drawString("name :"+name,20,60);
g.drawString("age:"+age,20,80);
g.drawString("roll:"+roll,20,100);
}}
