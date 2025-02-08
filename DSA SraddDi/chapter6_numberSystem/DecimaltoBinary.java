package chapter6;
import java.util.Scanner.*;

public class DecimaltoBinary {
    
    static int decToBin(int decNum){
        int ans=0, pow=1;

        while(decNum>0){
            int rem = decNum%2;
            decNum  = decNum/2;

            ans = ans+(rem*pow);
            pow *= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
       
       for(int i=1; i<=10; i++){
        int abc = decToBin(i);
        System.out.println(abc);
       }
    }
}
