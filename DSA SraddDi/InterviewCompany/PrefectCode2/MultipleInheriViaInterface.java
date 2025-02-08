package InterviewCompany.PrefectCode2;  
// Interface 1
interface Animal {
    void eat();
}
// Interface 2
interface Bird {
    void fly();
}
// Class implementing both interfaces
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat is eating.");
    }
    @Override
    public void fly() {
        System.out.println("Bat is flying.");
    }
}

public class MultipleInheriViaInterface {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat(); // Outputs: Bat is eating.
        bat.fly(); // Outputs: Bat is flying.
    }
}

