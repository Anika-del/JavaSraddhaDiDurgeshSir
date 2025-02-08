import java.util.Scanner;

public class MultiplicationTable {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}