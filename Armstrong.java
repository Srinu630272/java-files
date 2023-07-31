import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Armstrong {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();

      System.out.println(amstrong(a));
     
       
    }
    static String amstrong(int a){
        int temp=a;
        int sum=0;
        while(a>0){
             int  rem=a%10;
           a=a/10;
         
           sum=sum+rem*rem*rem;
           System.out.println(a);
            System.out.println(sum);
        }
       
        if(sum==a){
            return "its amstrong value";
        }
        return "not amstrong value";

 
    }
   
   
}

