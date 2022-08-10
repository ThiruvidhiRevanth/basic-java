import java.util.Random;
public class Sample{
public static void main(String[] args){
Random dice =new Random();
int n;
for( int i=1;i<=4;i++){
 n=dice.nextInt(10);
System.out.print(n);
}}}