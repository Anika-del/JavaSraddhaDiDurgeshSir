package Pratice;

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String rev = " ";
    for(int i=0; i<s.length(); i++){
        rev = s.charAt(i)+rev;
    }

    System.out.println(rev);
   }
}

