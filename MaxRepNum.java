import java.util.*;
class MaxRepeating
{
  public void MaxRepeatingElement(int[] arrA)
  {
	int maxCounter=0;
	int element=0;
	for(int i=0;i<arrA.length;i++)
	 {
		int counter=1;
		for(int j=i+1;j<arrA.length;j++)
		{
		  if(arrA[i]==arrA[j])
		  {
			counter++;
		  }
		}
		
		if(maxCounter<counter)
		{
		  maxCounter=counter;
		  element=arrA[i];
		}
		}
	System.out.println("Element repeat maximum number of times:"+element+" maxCount "+maxCounter);
	}
	}
class MaxRepNum
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elements in array");
	int n=s.nextInt();
	int[] arrA=new int[n];
	for(int i=0;i<n;i++)
	{
	 arrA[i]=s.nextInt();
	}
   MaxRepeating m=new MaxRepeating();
   m.MaxRepeatingElement(arrA);
 }
}