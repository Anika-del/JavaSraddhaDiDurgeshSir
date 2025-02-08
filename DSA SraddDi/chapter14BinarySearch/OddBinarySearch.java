package chapter14BinarySearch;

public class OddBinarySearch{

static int binarySear(int[] arr, int tar){
    int start = 0, end = arr.length-1;

    while(start <= end){
        // int mid = (start+end)/2; use inested of 
        int mid = start+(end-start)/2;
        if(tar > arr[mid]){
            start = mid+1;
        }
        else if(tar < arr[mid]){
            end = mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
}

public static void main(String[] args) {
    
    int arr[] = {-1,0,3,5,9,12};
    int tar = 0;
    int ans = binarySear(arr, tar);
    System.out.println(ans);
}
    
}
