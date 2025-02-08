import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int min = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("The minimum number is: " + min);
    }
}
