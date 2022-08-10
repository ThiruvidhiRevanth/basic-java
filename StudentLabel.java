import java.applet.*;
import java.awt.*;
public  class StudentLabel   extends Applet
{
public void init(){
Label name= new Label("Name=",Label.LEFT);
Label roll= new Label("roll",Label.RIGHT);
Label section=new Label("section");
section.setAlignment(Label.CENTER);
add(name);
add(roll);
add(section);
}}