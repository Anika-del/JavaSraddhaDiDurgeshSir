package chapter8_Array;

public class FindIndexNum {
    
    public static void main(String[] args) {

        int arr[] = {10,20,30,30,30,30,50,60};

        int firstIndex = -1; //value kuch bhi ho sakta h but jb if condition me firstIndex ko compair krenge to o same hone chahiye
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 30){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                lastIndex = i;
            }

        }
        System.out.println("first Index = "+firstIndex);
        System.out.println("last Index is "+ lastIndex);
        
    }
}