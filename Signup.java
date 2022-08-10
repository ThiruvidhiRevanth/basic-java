import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;




public class Signup extends Applet implements ActionListener
{

Button register, scancel;
TextField firstName,lastName,middleName,address1,address2,address3,email,phone;
Label fname,lname,mname,add,mail,ph,labsex,dob;
JComboBox day, month, year;
Choice sex;
int k;
JPanel signPanel;

public void init()
{
signPanel = new JPanel();
//Check Box for Sex Column
sex=new Choice();
sex.add("Male");
sex.add("Female");

// Buttons
register=new Button("Register");
scancel=new Button("Cancel");

//Labels

fname=new Label("First Name");
lname=new Label("Last Name");
mname=new Label("Middle Name");
add=new Label("Address");
mail=new Label("Email Address");
ph=new Label("Phone Number");
labsex=new Label("Sex");
dob=new Label("Date of Birth");
register.addActionListener(this);

//List

day=new JComboBox();
month=new JComboBox();
year=new JComboBox();


for (int i=0;i<31;i++)
{
String s;
Integer in;
in=new Integer(i+1);
s=in.toString();
day.addItem(s);
}
for (int i=0;i<6;i++)
{
String s;
Integer in;
in=new Integer(i+1);
s=in.toString();
month.addItem(s);
}
k=1965;
for (int i=0;i<10;i++)
{
String s;
Integer in;
in=new Integer(i+k);
s=in.toString();
year.addItem(s);
}

//TextFields

firstName=new TextField();
lastName=new TextField();
middleName=new TextField();
address1=new TextField();
address2=new TextField();
address3=new TextField();
email=new TextField();
phone=new TextField();


}

public void showSignupForm() {

signPanel.setLayout(new GridLayout(12,1));
signPanel.add(fname);
signPanel.add(firstName);
signPanel.add(mname);
signPanel.add(middleName);
signPanel.add(lname);
signPanel.add(lastName);
signPanel.add(add);
signPanel.add(address1);
signPanel.add(address2);
signPanel.add(address3);
signPanel.add(mail);
signPanel.add(email);
signPanel.add(ph);
signPanel.add(phone);
signPanel.add(dob);
signPanel.add(day);
signPanel.add(month);
signPanel.add(year);
signPanel.add(labsex);
signPanel.add(sex);

signPanel.add(register);
this.add(signPanel);
setVisible(true);

}

public void start() {
showSignupForm();

}


public void actionPerformed(ActionEvent ae)
{
setVisible(false);
}


public void method() {

}


}

