import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.util.*;
import java.net.*;


public class LoginForm extends Applet implements ActionListener{

String myString="";
Panel mainPanel;
Button btSignup;
Thread t;

public void init() {

mainPanel = new Panel();

btSignup = new Button("Signup");


}

public void start() {

showLoginForm();


}


public void showLoginForm() {

mainPanel.setLayout(new GridLayout(4,2));
mainPanel.add(btSignup);
this.add(mainPanel);
btSignup.addActionListener(this);

}

public void actionPerformed(ActionEvent ae) {
Applet receiver = null;
if (ae.getSource() == btSignup) {
try {
} catch (Exception exp) {
exp.printStackTrace();
}//catch
}

}
public void paint(Graphics g) {

g.drawString(myString,300,100);
}


}
