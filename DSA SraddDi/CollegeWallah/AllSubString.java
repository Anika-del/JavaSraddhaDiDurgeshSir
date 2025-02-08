public class AllSubString {

    public static void main(String[] args) {
        // String s = "Anika";
        // System.out.println(s.substring(0));
        // System.out.println(s.substring(1));

        String s = "abcd";
        String all = " ";
        for(int i=0; i<=3; i++){
           all =  s.substring(0, 4);
           i++;
        }
        System.out.println(all+ " ");
    }
    
}
