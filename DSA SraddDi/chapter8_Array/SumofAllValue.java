package chapter8_Array;

public class SumofAllValue {
    
    public static void main(String[] args) {
        
        int arr[] = {10,20,33,-4,5,60};

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
           
        }
            System.out.print(sum);
        
    }
}
