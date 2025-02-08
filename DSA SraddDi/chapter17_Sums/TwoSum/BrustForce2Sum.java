public class BrustForce2Sum {
    
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int first = arr[0];
        int second = arr.length-1;
        int target = 17;
       
        for(int i=0; i<arr.length; i++) {
          first = arr[i];
          for(int j=i+1; j<arr.length; j++){
            second = arr[j];
            int sum = first + second;
            if(sum==target){
                System.out.println("The two numbers are: " + first + " and " + second); //for value
                System.out.println("The two numbers index are: " + i + " and " + j); //for index
            }
          }
        }
    }
}
