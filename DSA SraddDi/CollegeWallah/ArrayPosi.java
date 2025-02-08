public class ArrayPosi {
    
    public static void main(String[] args) {
        
        int firstIndex = -1;
        int lastIndex = -1;
        int arr[] = {10,20,20,20,50,60,20,80};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==20){
            if(firstIndex == -1){
            firstIndex = i;
        }
        lastIndex = i;
    }
}
System.out.println("first Index "+ firstIndex);
System.out.println("last index "+ lastIndex);
        
    }
}
