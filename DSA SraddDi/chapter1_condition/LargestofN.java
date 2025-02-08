import java.util.Scanner;

public class LargestofN {

    public static void main(String[] args) {
        
        System.out.print("Enter total no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxValue = Integer.MIN_VALUE;
        System.out.print("Enter numbers 0 to n: ");
        for(int i=0; i<=n; i++){
            int currentValue = sc.nextInt();
            maxValue = Math.max(maxValue, currentValue);

        }
        System.out.println("Max number is "+ maxValue);
    }
    
}
