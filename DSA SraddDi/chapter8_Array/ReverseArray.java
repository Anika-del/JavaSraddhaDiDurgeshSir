package chapter8_Array;

public class ReverseArray {
    
    //  ReverseArray using TwoPointers 
        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};

            int start = 0, end = arr.length - 1;

            for (int i=0; i<arr.length; i++) {
             if(start < end) {  //3 value swap, arr[start], arr[end] 
                int swap = arr[start];
                arr[start] = arr[end];
                arr[end] = swap;
                start++;
                end--;
            }
            
            System.out.print(" "+ arr[i]);
            }
        }
    }
    