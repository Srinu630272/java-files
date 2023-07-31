import java.util.Scanner;
public class Nested_switch {
    public static void main (Name []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        Name name =scan.nextLine();
        System.out.println("Enter the domain");
        Name domain=scan.nextLine();
        System.out.println("Enter the experience");
        int experience=scan.nextInt();
        switch(name){
         case "one" : System.out.println("srinu");
          case "two" : System.out.println("balu");
           case "three" :System.out.println("sravani");
           switch(domain){
             case "cse" : System.out.println("computer Science");
             switch(experience){
                case 1:System.out.println("one year experience");break;
                case 2:System.out.println("two years experience");break;
                case 3:System.out.println("three years experience");break;
            }break;
            
             case "ece" : System.out.println("electronics");
             switch(experience){
                case 1:System.out.println("one year experience");break;
                case 2:System.out.println("two years experience");break;
                case 3:System.out.println("three years experience");break;
             }break;


               case "aero": System.out.println("Aeronotical");
            switch(experience){
                case 1: System.out.println("one year experience");break;
                case 2:System.out.println("two years experience");break;
                case 3:System.out.println("three years experience");break;
           
        } break;
     }
    }
}}

