import java.util.Scanner;
public class Calculator_app {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int res=0;
    
    while(true){
        System.out.print("enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter the character ");
        char ch= sc.next().charAt(0);
       
        if(ch=='+'){
           res=a+b;
        }
       else if(ch=='-'){
            res=a-b;
        }
        else if(ch=='*'){
            res=a*b;
        }
        else if(ch=='/'){
            res=a/b;
        }
       else if(ch=='%'){
           res=a%b;
        }
        else{
            System.out.println("not matched");
        }

 System.out.println( "and the result is " + res);
    }
    
   
}
    
}
