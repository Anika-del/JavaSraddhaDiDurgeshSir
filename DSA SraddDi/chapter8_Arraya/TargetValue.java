package chapter8_Array;

public class TargetValue {
    
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,8,2,5};
        int target = 8;

        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                target = i; //if target exixt krta h to index i print kr dega
    }
}
        System.out.println(target);
        

}


}