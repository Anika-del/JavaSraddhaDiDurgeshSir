package chapter14BinarySearch;

public class PeakMountainElement {
    
        // Method to find a peak element
        public static int findPeakElement(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
    
                // Check if mid is a peak element
                if (arr[mid] > arr[mid + 1]) {
                    right = mid; // Peak is in the left half
                } else {
                    left = mid + 1; // Peak is in the right half
                }
            }
            // left and right will converge to the peak element
            return left;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5 ,4, 3, 2};
            int peakIndex = findPeakElement(arr);
            System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
        }
    }
    