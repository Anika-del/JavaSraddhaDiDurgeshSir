package Pratice;

import java.util.*;
public class FirstLastInsex {

    public static void main(String[] args) {
        
    int arr[] = {10,20,30,-5,-5,-5,4};
    int target = -5;
   int index1 = -1;
   int index2 = -1;
    for(int i=0; i<arr.length; i++){
    if(arr[i] == target){
        if(index1 == -1){
      index1 = i;
    }
    index2 = i;
    }
}
    System.out.println(index1);
    System.out.println(index2);
}
   
}
