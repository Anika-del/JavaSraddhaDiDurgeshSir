package InterviewCompany.PrefectCode2; 
// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Outputs: Dog barks
    }
}

