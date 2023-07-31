public class conditionals {
    public static void main(String [] args){
        int salary = 15000;
         if(salary >= 16000){
           salary =salary + 2000;
         }
         else if(salary>= 12000){
            salary=salary+3000;

         }
         else{
        salary=salary + 1000;
         }
         System.out.println("the salary with increment is " + salary   );
    }
    
}
