import java.util.Arrays;

public class Better2Sum {
    public static void main(String[] args) {
        
        int[] arr = {20,30,54,21,44};
        Arrays.sort(arr);
        int target = 50;
        int st = 0;
        int end = arr.length-1;

        while(st<end){
            int sum = arr[st]+arr[end];
            if(sum==target){
                System.out.println(st+" "+end);
                return;
            }else if(sum>target){
                end--;
            }
            else{
                st++;
        }
    }
    System.out.println("not sum");
}
}