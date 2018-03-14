import java.util.*;
import java.lang.*;
public class fibo{
     public static void main(String args[]){
     int a=0,b=1;
     int c;
     int j;
     Scanner s=new Scanner(System.in);
     j=s.nextInt();

      for(int i=0;i<j;i++){
          System.out.println(a);
          c=a+b;
          a=b;
          b=c;
      }
     }
    }
