import java.util.Scanner;
public class Simple_intrest {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the time period");
        float time=input.nextFloat();
        System.out.println("enter the principle amount ");
        int principleAmount =input.nextInt();
        System.out.println("enter the rate of intrest ");
        float rateOfIntrest =input.nextFloat();
        System.out.println( "this is the simple intrest : " + (principleAmount*rateOfIntrest*time)/100);
    
}}
