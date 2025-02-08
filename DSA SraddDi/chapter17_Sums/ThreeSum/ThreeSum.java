public class ThreeSum {
   public static void main(String[] args) {
    int[] arr = {20,40,50,60,70};
    int tar = 150;
    
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            for(int  k=j+1; k<arr.length; k++){
                if(arr[i]+arr[j]+arr[k]==tar){
                    System.out.println("Three numbers are "+arr[i]+" "+arr[j]+" "+arr[k]);
                    // System.out.println("Sum of three numbers is "+(arr[i]+arr[j]+arr[k]));
                    System.out.println(i+" "+j+" "+k);

    }
   } 
}
    }}}