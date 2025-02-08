package chapter8_Array;

public class SmallestValue{

    public static void main(String[] args) {
        
        int arr[] = {5,15,20,1,-15,34,-16};
        int SmallestValue = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<SmallestValue)
            SmallestValue = arr[i];
            
        }
        System.out.println(SmallestValue);
    }
}