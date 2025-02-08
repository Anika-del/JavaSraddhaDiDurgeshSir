package chapter6;

public class BinarytoDecimal {

    public static int BinaryToDecimal(int binNum){

    int ans=0, pow=1;

    while(binNum>0){
        int rem = binNum%10;
        ans += rem*pow;
        binNum /= 10;
        pow *= 2;
    }
    return ans;
    }
    public static void main(String[] args) {
        // int binNum = 10110;
        int convert = BinaryToDecimal(1001);
        System.out.println(convert);
    }
    
}
