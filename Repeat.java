
public class Repeat {
    
 public static void main(String[]args){
    int num=123324;
   int  counter=0;
    while (num>0){
int reminder=num%10;
if(reminder==3){
counter++;
 
}
num=num/10;
    }
    System.out.println(counter);
 }
}
