// Interface
interface Animal {
    void sound(); // abstract by default
}

// Class implementing interface
class Dog implements Animal {
    // Overriding method from interface
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class OverRidingWithInterfaces {
    public static void main(String[] args) {
        Animal a = new Dog();  // Interface reference, child object
        a.sound();  // Calls overridden method
    }
}

// 🧠 Explanation
// interface Animal defines an abstract method sound().     
// Dog implements the interface and provides its own version (overrides it).   
// The @Override annotation (optional) can be added for clarity: