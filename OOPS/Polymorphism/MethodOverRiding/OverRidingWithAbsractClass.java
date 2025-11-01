abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class
class Dog extends Animal {
    // Overriding abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverRidingWithAbsractClass {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, child object
        a.sound();   // Calls overridden method
        a.sleep();   // Calls inherited normal method
    }
}

// 🧠 Explanation
// Animal is an abstract class — can have both abstract (no body) and concrete (with body) methods.
// Dog extends Animal and overrides the abstract method sound().
// Object creation uses runtime polymorphism: Animal a = new Dog();

