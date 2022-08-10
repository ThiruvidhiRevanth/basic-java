import java.util.*;
public class Sample{
public static void main(String[] args){
Random dice =new Random();
int num;
for( int i=1;i<=10;i++){
 num=dice.nextInt(6);
}System.out.println(num);
}}