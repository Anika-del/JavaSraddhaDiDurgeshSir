package chapter5;
import java.util.*;

public class Fun1{

   public static void myName(String name){
       System.out.println(name);
       return;
     }
 
    public static void main(String[] args) {
      System.out.print("enter name = ");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      myName(name);
    }
}