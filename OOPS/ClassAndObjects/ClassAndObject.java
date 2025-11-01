// A class is a blueprint or template that defines the properties (variables) and behaviors (methods) of an object.
// An object is a real-world instance of a class — it actually holds data and performs actions.

class Car{
    // Data members (Attributes)
    String brand;
    String color;
    int speed;

    // Method to diplay car details
    void displayDetails(){
        System.out.println("Brand :" + brand);
        System.out.println("Color :" + color);
        System.out.println("Speed :" + speed);
    }

    // Method to increase speed
    void accelerate(int increase){
        speed += increase;
        System.out.println("Speed increase to :" + speed);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // OBJECT CREATION
        Car c1 = new Car();

        c1.brand = "Tesla";
        c1.color = "white";
        c1.speed = 120;

        // Accessing Methods
        c1.displayDetails();
        c1.accelerate(50);
    }
}
