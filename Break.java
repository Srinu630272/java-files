import java.util.Scanner;
public class Break {
   public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println(" please enter the number ");
    String  week=scan.nextLine();
    switch(week){
        case "one" :System.out.println(" today is Sunday");break;
        case "two" :System.out.println(" today is Monday");break;
        case "three" :System.out.println("today is Tuesday");break;
        case "four" :System.out.println("today is Wednesday");break;
        case "five" :System.out.println("today is Thursday");break;
        case "six" :System.out.println("today is Friday"); break;
        case "seven" :System.out.println("today is Saturday");break;
         }
   } 
}
