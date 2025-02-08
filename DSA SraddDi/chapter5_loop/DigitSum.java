package chapter5;

public class DigitSum {

    public static int digitsum(int num){

        int sum=0;
        while(num > 0){
          int lastDigit = num%10;
          num /= 10;
          sum = sum+lastDigit;
        }
        return sum;
  }
    public static void main(String[] args) {
        int num = 5555;
       int sum = digitsum(num);
        System.out.println(sum);
        
    }
    
}
