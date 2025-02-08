package InterviewCompany.LinkdinMaam;

public class StringReverse {

    public static void main(String[] args) {
        String  s = "Anika";
        String rev = " ";
        for(int i=0; i<s.length(); i++ ){

             rev = s.charAt(i)+rev;
        }
        System.out.print(rev);
    }
}
