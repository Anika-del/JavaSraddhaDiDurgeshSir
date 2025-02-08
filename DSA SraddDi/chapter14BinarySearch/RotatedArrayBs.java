package chapter14BinarySearch;

public class RotatedArrayBs {
    
    static int rotatedSerch(int[] arr, int tar){

        int start=0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == tar){
                return mid;
            }
            if(arr[start] <= arr[mid]){ //left sorted
                if(arr[start] <= tar && tar <= arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{ //right sorted
                if(arr[mid] <= tar && tar <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        int ans = rotatedSerch(arr, tar);
        System.out.println(ans);
    }
}
