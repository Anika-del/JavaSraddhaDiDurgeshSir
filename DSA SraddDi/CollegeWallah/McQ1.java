public class McQ1 {
    
    public static void main(String[] args) {
        
        String s = "abcd"; // 0 to 3
        for(int i=0; i<=3; i++){  //3 tk
            for(int j = i+1; j<=4; j++){ //4 tk
                System.out.print(s.substring(i, j)+" ");
            }
        }
    }
}
