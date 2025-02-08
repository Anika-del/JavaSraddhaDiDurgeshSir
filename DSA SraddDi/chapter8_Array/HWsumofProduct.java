package chapter8_Array;

public class HWsumofProduct {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,30};
        int product = 0;
        for(int i=0; i<arr.length; i++){
             product += arr[i];
        }
        System.out.println(product);
    }
}
