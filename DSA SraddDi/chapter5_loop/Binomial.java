package chapter5;

public class Binomial {
    
    public static int findBinomial(int n){
        int fact=1;
    for(int i=1; i<=n; i++){
        fact = fact*i;
    }
    return fact;
    }
    
    public static int nCr(int n, int r){
       int fact_n = findBinomial(n);
       int fact_r = findBinomial(r);
       int fact_nmr = findBinomial(n-r);

       return fact_n / (fact_r*fact_nmr);
    }
public static void main(String[] args) {
   
    int fact = nCr(8,2);
    System.out.println(fact);
}
}
