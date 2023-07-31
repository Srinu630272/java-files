public class Shadowing {
   static int a=2220;
    public static void main(String[]args){
        System.out.println(a);
        fun();
        System.out.println(a);
        int a=20;
        int b= 30;
        System.out.println(a);
            fun();
    }
    static void fun(){
    System.out.println(a);
    }
    
}
