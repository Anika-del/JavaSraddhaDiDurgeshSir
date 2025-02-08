package chapter11_pairSum;

import java.util.HashMap;

public class MajorityElementHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = findMajorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }

        return -1; // This line is never reached if a majority element always exists
    }
}
