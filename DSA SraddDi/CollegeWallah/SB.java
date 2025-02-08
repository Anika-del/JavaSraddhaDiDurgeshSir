public class SB {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("PhysICS");
        
        System.out.println(sb); //print sb
        sb.reverse(); //reverse string
        System.out.println(sb);
        sb.reverse();  //reverse to reverse = original
        System.out.println(sb);
        sb.setCharAt(1, 'm'); //index 1 pr m add kr dega
        System.out.println(sb);
        sb.delete(1, 2); //1 se 2-1 ke char ko delete kr dega like 1 index ke 
        System.out.println(sb);
        sb.append( " " + "Wallh");  //add kr dega string ko
        System.out.println(sb);
        sb.insert(1, 'A'); //ek endex pr add ho jayega ar us index ko aage kr dega
        System.out.println(sb);
        sb.deleteCharAt(3);  //delete atchar position
        System.out.println(sb);
       

    }
}
