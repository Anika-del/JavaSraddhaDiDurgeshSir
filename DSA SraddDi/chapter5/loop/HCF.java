import java.util.Scanner;
public class HCF {
//     public static int calculateHCF(int a, int b) {
//         if (a == b) {
//             return a;
//         } else if (a == 0) {
//             return b;
//         } else if (b == 0) {
//             return a;
//         } else if (a > b) {
//             return calculateHCF(a % b, b);
//         } else {
//             return calculateHCF(a, b % a);
//         }
//     }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = in.nextInt();
        System.out.println("Enter second number:");
        int b = in.nextInt();
        // System.out.println("HCF of two numbers: " + calculateHCF(a, b));
    }
}
