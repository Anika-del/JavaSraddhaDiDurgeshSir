package ScalerTopic.Loop;

import java.util.*;
// is number is prime or not
public class PrimeorNot {
        public static void main(String[] args) {
        
        System.out.println("enter number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        
            for(int i=2; i<=(n-1); i++){
            if(n % i == 0)
                System.out.println("Not prime");
     }
      System.out.println(" prime");
    }
    }
    

