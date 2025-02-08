package Pratice;

public class Pattern4 {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){

            for(int j=0; j<=i; j++){
                System.out.print("-");
             }
             for(int k=5; k>=i; k--){
                System.out.print("*");
             }
             for(int l=4; l>=i; l--){
                System.out.print("*");
             }
             System.out.println();
         }

         for(int i=2; i <= 5; i++){
            for(int j=6; j>=i; j--){
                System.out.print("-");
             }
             for(int k=2; k<=i; k++){
                System.out.print("*");
             }
             for(int l=1; l<=i; l++){
                System.out.print("*");
             }
             System.out.println();
         }
    }
    
}
