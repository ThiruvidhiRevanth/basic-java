import java.applet.Applet;
import java.awt.Graphics;
public class Java extends Applet{
public void paint(Graphics g){
int a=100,b=100,c=10,d=10;
for(int i=0;i<15;i++){
try{
Thread.sleep(1000);
}catch(InterruptedException ex){}}
g.drawRect(a,b,c,d);
a=-5;
b=-5;
c+=10;
d+=10;
}
}