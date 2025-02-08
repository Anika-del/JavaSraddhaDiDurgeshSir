package Pratice;

import java.util.*;

public class MinNumarray {
    
    public static void main(String[] args) {

        // Input the size of array
        System.out.println("Enter the size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // declaration of array
        int arr[] = new int[n];
        // int arr[] = {10,2,9,4,-5,8};
       
        // input the elements
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();            
        }

        int min = arr[0];
       
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
            if(arr[i] < min){ // if(arr[i] > max){
                min = arr[i];
            }
          
        }
        System.out.println();
        System.out.println(" min value is "+ min);
        }
        

    }

