package chapter10_subarray;

public class SubarraySum {
    
    // Using SubarraySumBruteForce 
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 7, 5};
            int targetSum = 12;
    
            findSubarrayWithGivenSum(arr, targetSum);
        }
    
        public static void findSubarrayWithGivenSum(int[] arr, int targetSum) {
            int n = arr.length;
            for (int start = 0; start < n; start++) {
                int currentSum = 0;
                for (int end = start; end < n; end++) {
                    currentSum += arr[end];
                    if (currentSum == targetSum) {
                        System.out.println("Subarray found from index " + start + " to " + end);
                        return;
                    }
                }
            }
            System.out.println("No subarray with given sum found.");
        }
    }
    
