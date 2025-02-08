package chapter10_subarray;

import java.util.HashMap;

public class SubarraySumHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;

        findSubarrayWithGivenSum(arr, targetSum);
    }

    public static void findSubarrayWithGivenSum(int[] arr, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            if (map.containsKey(currentSum - targetSum)) {
                System.out.println("Subarray found from index " + (map.get(currentSum - targetSum) + 1) + " to " + i);
                return;
            }

            map.put(currentSum, i);
        }
        System.out.println("No subarray with given sum found.");
    }
}

