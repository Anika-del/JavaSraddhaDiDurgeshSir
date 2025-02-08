package chapter8_Array;

public class LargesValue {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,-4,22,-12,34,0};
        int LargesValue = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>LargesValue)
            LargesValue = arr[i];
        }
        
        System.out.println(LargesValue);
    }
}
