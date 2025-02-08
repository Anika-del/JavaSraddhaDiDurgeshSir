import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21...
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int num = input.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + num + " terms: ");

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");  //sabse phle num 1 ko print kr denge fir
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
