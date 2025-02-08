package chapter8_Array;

public class MinMaxSwap {
    
    public static void main(String[] args) {
        
        int arr[] = {10,30,98,-97,54};
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
System.out.println();
        System.out.println("minIndex position = "+ minIndex);
        System.out.println("maxIndex position = "+ maxIndex);
        
       // Swap the minimum and maximum elements
       int temp = arr[minIndex];
       arr[minIndex] = arr[maxIndex];
       arr[maxIndex] = temp;

       System.out.println("Array after swapping min and max values:");
       for (int i : arr) {
           System.out.print(i + " ");
       }
   }}