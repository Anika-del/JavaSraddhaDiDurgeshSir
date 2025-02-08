import java.util.Scanner;
public class SBToggle {
    
    public static void main(String[] args) {
        System.out.print("Enter string = ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        //toggle
        //PhysICS
        for(int i=0; i<sb.length(); i++){
          //P => p
         // if P capital the P+32 = p and----------- if p small then p-32 = P
          //check -> alphabet- small, capital
          boolean flag = true; //true capital
          char ch = sb.charAt(i); //A
          int asci = (int)ch; //65 //type casting kr denge string ko int me
          if(asci >= 97) flag = false;//small 97 se bda h to false meand small print kr dega other wise by default flag me true h hi
          if(flag==true){ //capital
            asci += 32;
            char dh = (char)asci; //a
            sb.setCharAt(i, dh);
          }
          else{ //small
           asci -= 32;
           char dh = (char)asci;
           sb.setCharAt(i, dh);
          }
        }
        System.out.println(sb);
    }
}
