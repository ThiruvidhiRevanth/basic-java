import java.awt.*;
import java.applet.*;
import java.net.*;
public class Bases extends Applet{
public void paint(Graphics g){
String msg;
try{URL url =new URL("https://www.youtube.com/watch?v=W1sTXEDRCx4");
g.drawString(url.getProtocol(),40,50);
g.drawString(url.getHost(),100,50);
g.drawString(url.getFile(),200,50);
}catch(Exception e){System.out.println(e);}
URL r;
r=getCodeBase();
msg=r.toString();
g.drawString(msg,10,40);
r=getDocumentBase();
msg=r.toString();
g.drawString(msg,10,40);

}}