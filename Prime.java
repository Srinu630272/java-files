import java.util.Scanner;
class prime{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        long n=scan.nextInt();
        
        System.out.println( prime(n));
    }
     static String prime(long   n){
        if(n<=1){
            return "not prime or composit";
        }
        int c=2;
        while(c*c<=n){
              if(n%c==0){
                return "not prime";
              }
              c++;
        }
      return "prime";
           
    }
}