public class StringRev {

    public static void main(String[] args) {
        
        String Originalstr = "ANIKA";
        System.out.println(Originalstr);
        char ch;
String revStr=" ";
        for(int i=0; i<Originalstr.length(); i++){
         revStr = Originalstr.charAt(i)+revStr;

        }
        System.out.println(revStr);
    }
    
}
