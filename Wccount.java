import java.util.*;
public class Wccount
{
public static void main(String[] args)
{
int w=1,c=0;

System.out.println("Enter string name :");
Scanner s=new Scanner(System.in);


String str=s.nextLine();


for(int i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
{
w=w+1;
}
}
System.out.println("Num Of Words  Are "+w);
System.out.println("Num Of Characters  Are "+str.length());

char[] ch=str.toCharArray();
  int letter =0;
  int space=0;
  int num=0;
  int other=0;
  for(int i=0; i<str.length();i++)
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


