import java.util.Arrays;

public class BetterApproch3Sum {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 60, 70};
        int target = 150;
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Iterate through the array with a fixed pointer
        for (int i = 0; i < arr.length - 2; i++) {
            int newTarget = target - arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            
            // Step 3: Use two pointers to find the other two numbers
            while (start < end) {
                int sum = arr[start] + arr[end];
                
                if (sum == newTarget) {
                    System.out.println("Three numbers are " + arr[i] + " " + arr[start] + " " + arr[end]);
                    System.out.println("Indices are " + i + " " + start + " " + end);
                    return;
                } else if (sum < newTarget) {
                    start++;  // Move the start pointer to the right
                } else {
                    end--;  // Move the end pointer to the left
                }
            }
        }
        
        System.out.println("No three sum solution found.");
    }
}

    
