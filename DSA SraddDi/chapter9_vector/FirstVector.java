package chapter9_vector;

import java.util.Vector;

public class FirstVector {
    
    public static void main(String[] args) {
        
        Vector<Integer> vec = new Vector<>(3,2);
        vec.addElement(10);
        vec.addElement(20);
        vec.addElement(30);
        System.out.println("all element "+ vec);

       vec.add(40);
       System.out.println("all element "+ vec);
       vec.add(2,44);
       System.out.println("Insert in middle "+ vec);
       
       System.out.println(vec.contains(41));
       System.out.println(vec.contains(40));

       vec.removeElementAt(2);
       System.out.println("remove element "+vec);

        // Print the elements of the vector
        System.out.println("Elements in the vector:");
        for (int i : vec) {
            System.out.print(" "+i);
        }
System.out.println();

      System.out.println("size of vector "+ vec.size());
      System.out.println("position element "+ vec.get(2));
      System.out.println("no any work "+ vec.toString());
      System.out.println("size of vector "+ vec.firstElement());
    
       vec.clear();
       System.out.println("clear "+vec);
    }
}
