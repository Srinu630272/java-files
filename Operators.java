import java.util.Scanner;
public class Operators {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("enter the sign");
        char sign=input.next().charAt(0);

        System.out.println("enter the sign ");
        if(sign=='+'){
            System.out.println("addition of a,b = " + a+b);
        }
        else if(sign== '-'){
            System.out.println(" substraction of a,b = " + (a-b));

        }
        else if(sign == '*'){
            System.out.println(" Multiplication of a,b = " + (a*b) );
        }


    }
    
}
