package chapter10_Subarray;

public class SumSubArray {
    
    public static void main(String[] args) {
        
        int sum = 0;
        int[] arr = {1,2,3,4,5,6};
        for(int st=0; st<arr.length; st++){
         for(int end=st; end<arr.length; end++){
           sum += arr[end];
                System.out.print(sum);
            
            System.out.print(" ");
         }
         System.out.println();
        }
    }
}
