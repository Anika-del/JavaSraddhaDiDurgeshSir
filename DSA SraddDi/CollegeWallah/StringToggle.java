public class StringToggle {

    public static void main(String[] args) {
    
    String s = new String("PhysICS");
    System.out.println(s);
    String change = s.substring(0,1).toLowerCase()+s.substring(1, 4).toUpperCase()+s.substring(4,7).toLowerCase();
    System.out.println(change);
    
}
}