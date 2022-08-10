import java.applet.*;
 import java.awt.*;


public class login extends Applet
{
Label title = new Label("Login Page");
Label username = new Label("Username");
Label password = new Label("Password");

public void init() {

add(title);
add(password);
add(username);

}
}