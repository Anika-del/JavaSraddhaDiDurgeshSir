import java.util.HashMap;
import java.util.Map;

public class HashMapTwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the hash map
            if (map.containsKey(complement)) {
                // If found, return the indices
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        HashMapTwoSum solution = new HashMapTwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + " and " + result[1]); // Output: Indices: 0 and 1
    }
}
