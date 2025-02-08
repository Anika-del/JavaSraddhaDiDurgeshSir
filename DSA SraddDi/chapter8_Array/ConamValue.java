package chapter8_Array;

import java.util.ArrayList;
import java.util.List;

public class ConamValue {
    
    public static void main(String[] args) {
        
        int arr1[] = {10,20,30,40,50,60,70};
        int arr2[] = {10,30,50,60,70};
//int com = 0;
 List<Integer> commonElements = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                   // com = arr1[i];
                   commonElements.add(arr1[i]);
                    break;
                }
               
            }
            
        
      //  System.out.print("coman elements " + com);
        }
           System.out.println("Common Elements: " + commonElements);
        
    }
}
