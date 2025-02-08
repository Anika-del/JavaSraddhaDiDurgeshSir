package chapter5;
import java.util.*;
public class FactorialFun {

    public static void factorial(int n){
           int fact=1;
        for(int i=n; i>=1; i--){
           fact = fact * i;
        }
        System.out.println(fact);
        return;
        
    }
    public static void main(String[] args) {
        
        System.out.print("Enter num find factorial = ");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
       factorial(n);

    }
    
}
