package chapter8_Array;

public class FindSmallestIndex {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,5,1,32,-14,-111};

        int min = arr[0];
        int minIndex = -1;
        for(int i=0; i<arr.length; i++){

            if(min > arr[i]){
                min = arr[i];
                if(minIndex == -1){
            }
            minIndex = i;
        }
    }
    System.out.println("Minimum value is "+ min);
    System.out.println("minimum value index of "+ minIndex);
    }
}
