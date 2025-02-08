package chapter13_ContainerWithWater;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(height);
        System.out.println("Maximum water that can be contained: " + maxArea);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
/*
 * Explanation
Initialize Two Pointers: Start with one pointer at the beginning (left) and one at the end (right) of the array.
Calculate Area: At each step, calculate the area formed by the lines at the left and right pointers. The area is determined by the shorter of the two lines multiplied by the distance between them.
Update Maximum Area: Keep track of the maximum area found.
Move Pointers: Move the pointer pointing to the shorter line inward, as this might help find a taller line and potentially a larger area.
Repeat: Continue this process until the two pointers meet.
This approach ensures that you check all possible containers efficiently
 */
