// Functional interface (which has single method)
@FunctionalInterface
interface Car {
    void drive();
}

// Traditional class implementing Car interface
class Honda implements Car {
    public void drive() {
        System.out.println("Driving Honda in traditional way");
    }
}
public class LamdaExpression {
    public static void main(String[] args) {
        // Traditianal way
        Car c1 = new Honda();
        c1.drive();

        // Using Anonymous Inner class
        Car c2 = new Car(){
            public void drive(){
                System.out.println("Driving using Anonymous class");
            }
        };
        c2.drive();

        // Using Lambda Expression
        Car c3 = () -> System.out.println("Driving Lambda Expression");
        c3.drive();

    }
}
