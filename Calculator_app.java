import java.util.Scanner;
public class Calculator_app {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    
    while(true){
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);
        System.out.println("and the result is");
        if(ch=='+'){
            System.out.println(a+b);
        }
       else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println(a*b);
        }
        else if(ch=='/'){
            System.out.println(a/b);
        }
       else if(ch=='%'){
            System.out.println(a%b);
        }
        else{
            System.out.println("not matched");
        }


    }
}
    
}
