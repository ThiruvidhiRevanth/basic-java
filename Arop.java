class Arop
{
public static void main(String[] args)
  {
    char ch;
do
{
System.out.println("1.Add");
System.out.println("2.Sub");
Scanner i= new Scanner(System.in);
System.out.println("Enter the option");
int option = i.nextInt();
System.out.println("Enter two numbers");
    int a = i.nextInt();
int b = i.nextInt();
    switch (option)
{
        case 1:
System.out.println("ADD="+(a+b));
        break;
case 2:
        System.out.println("SUB="+(a-b));
        break;
default:
        System.out.println("Invalid operator!");
        break;
    }
System.out.println("dO YOU WANT TO CONTINUE ? \n PRESS y OR Y IF YES ELSE PRESS ANY OTHER KEY");
ch=i.next().charAt(0);
}
while(ch=='Y'||ch=='y');
  }
}
}