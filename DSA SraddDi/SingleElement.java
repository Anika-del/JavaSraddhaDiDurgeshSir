package chapter14BinarySearch;

public class SingleElement {
    static int singleEle(int arr[]){
        int n = arr.length;
    int st=0, end=n-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            // 2 corner case
             if(mid == 0 && arr[0] != arr[1]) return arr[mid];
             if(mid == n-1 && arr[n-1] != arr[n-2]) return arr[mid];
             //
             //if arr single element
            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]) return arr[mid];

                if(mid%2==0){  //even size array
                      if(arr[mid-1] == arr[mid]){ //left case
                         end = mid-1;
                      }else{ //right case
                         st = mid+1;
                      }
                }else{   //odd size array
                     if(arr[mid-1] == arr[mid]){ //left case
                         st = mid+1;
                     }else{ //right case
                         end = mid-1;
                     }
                }
        }
        // if(end == 1)  //when only one element in intarr[] = {4} like that
         return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,8,8};
       
        int singleEle = singleEle(arr);
        System.out.println(singleEle);
    }

}
