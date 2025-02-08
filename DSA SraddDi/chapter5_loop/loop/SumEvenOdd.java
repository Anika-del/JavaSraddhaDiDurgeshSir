import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number larger than 2: ");
        int num = input.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        if (num >= 2) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        } else {
            System.out.println("Invalid input. Please enter a number above 2.");
        }
    }
}
