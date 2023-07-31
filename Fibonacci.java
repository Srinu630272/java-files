import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
   int count;
   
  int n=sc.nextInt();
  
 
     for(count=2;count<=n;count++){
      
        b=a+b;
       int temp=b;
       a=temp;
     
     System.out.println(b);
     }

    }
}
