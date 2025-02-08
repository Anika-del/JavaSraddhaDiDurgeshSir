package chapter14BinarySearch;

public class TargetBinarySearch {

    // Function to perform binary search
    static int binarySearch(int[] arr, int tar) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 5, 9, 12};
        int tar = 3;
        System.out.println(binarySearch(arr, tar)); // Corrected method call
    }
}
