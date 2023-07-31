public class Reverse_num1 {
    public static void main(String[]args){
        int num=123342;
        while(num>0){
           int rem;
           rem=num%10;
           num=num/10;
           System.out.print(rem);
        }
    }
}
