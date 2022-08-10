import java.awt.Color;
import java.applet.Applet;
import java.awt.Graphics;
public class Circle extends Applet
{
public void paint(Graphics g){
setForeground(Color.red);
g.drawOval(10,10,50,1000);
g.fillOval(100,20,50,1000);
}
}