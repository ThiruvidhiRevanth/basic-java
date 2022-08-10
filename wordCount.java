import java.lang.*;
import java.util.*;
public class Wordcount
{
 public static void main(String args[])
  {
   String s = new String();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the string: ");
  s = sc.nextLine();

  int count=1;
  for(int i=0;i<s.length()-1;i++)
    {
     if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
    {
     count++;
     }
   }
  
  System.out.println("the string is:"+s);
  System.out.println("number of words in a string= "+count);  
  System.out.println("Number of characters in a string = "+s.length());
  char[] ch=s.toCharArray();
  int letter =0;
  int space=0;
  int num=0;
  int other=0;
  for(int i=0; i<s.length();i++)
  {
   if(Character.isLetter(ch[i]))
     {
	letter++;
     }
   else if(Character.isDigit(ch[i]))
     {
	num++;
     }
   if(Character.isSpaceChar(ch[i]))
     {
	space++;
     }
    else{
     other++;
     }
}
System.out.println("letter: "+letter);
System.out.println("space: "+space);
System.out.println("number: "+num);
System.out.println("other: "+other);
}
}
