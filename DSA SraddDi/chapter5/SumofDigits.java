package chapter5;

public class SumofDigits {
    
    //you can put + - both value
         public static int calculateSumOfDigits(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int number = 2345;
            int sum = calculateSumOfDigits(number);
            System.out.println("The sum of the digits of " + number + " is: " + sum);
        }
    }
    
