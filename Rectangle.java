import java.awt.*;
import java.applet.*;
public class Rectangle extends Applet{
public void start(){
setBackground(Color.blue);}
public void paint(Graphics g){
g.fillRect(100,100,65,75);
setForeground(Color.red);

g.fillRoundRect(200,200,65,75,30,30);
showStatus("This is revanth");
}
}