import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            sum += num;

            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Sum of entered numbers: " + sum);
    }
}
