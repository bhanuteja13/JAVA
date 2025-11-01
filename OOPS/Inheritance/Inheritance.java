/*Definition:
Inheritance means one class (child) can inherit or reuse the properties and methods of another class (parent).
It helps achieve code reusability, extensibility, and a hierarchical structure between classes. 
*/

//                     <------------- SINGLE INHERITANCE --------------->
// PARENT CLASS (Super Class)
class Vehicle{
    int speed;

    void start(){
        System.out.println("Vehicle started.");
    }

    void stop(){
        System.out.println("Vehicle stopped.");
    }
}

// CHILD CLASS (Sub Class)
class Car extends Vehicle{
    int wheels = 4;

    void display(){
        System.out.println("Car speed : " + speed + " km/h");
        System.out.println("Wheels: " + wheels);
    }
}

// <----------- MULTI LEVEL INHERITANCE ------------>  
class Vehicles{
    void start(){
        System.out.println("Vehicle started.");
    }
}

class Cars extends Vehicles{
    void drive(){
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends Cars{
    void chargeBattery(){
        System.out.println("Electric car battery charging...");
    }
}


// <----------- HIERARCHICAL INHERITANCE ------------>
class Vehicless{
    void start(){
        System.out.println("Vehicle started.");
    }
}
class Carss extends Vehicless{
    void drive(){
        System.out.println("Car is driving...");
    }
}
class Bike extends Vehicless{
    void ride(){
        System.out.println("Bike is riding...");
    }
}


// <------------- HYBRID INHERITANCE -------------->
// Base Class
class Vehicle1{
    void start(){
        System.out.println("Vehicle is starting");
    }
}

// Derived class 1
class Car1 extends Vehicle1{
    void drive(){
        System.out.println("Car is driving");
    }
}

// Derived class 2 (Hierarchical inheritance)
class Truck extends Vehicle1{
    void load(){
        System.out.println("Truck is loading goods");
    }
}

// Derived class 3 (multi level inheritance)
class ElectricCar1 extends Car1{
    void charge(){
        System.out.println("Electric car is charging");
    }
}

// MULTIPLE INHERITANCE (Java doesn't support Mulitple Inheritance)

// Diamond Problem (Example)
// class A{
//     void show(){
//         System.out.println("Class A");
//     }
// }
// class B{
//     void show(){
//         System.out.println("Class B");
//     }
// }
// // ❌ This will cause an error in Java
// class C extends A, B {   // Java does NOT allow this
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.show();
//     }
// }

// WHY ERROR?
// If both A and B have a method called show(), then Java can’t decide which one to call from C.
// This creates ambiguity, so Java disallows multiple inheritance through classes.




public class Inheritance {
    public static void main(String[] args) {

        // SINGLE INHERITANCE
        System.out.println("1) SINGLE INHERITANCE");
        Car myCar = new Car();

        // Accessing parent class members
        myCar.speed = 120;
        myCar.start();
        myCar.display();
        myCar.stop();

        System.out.println();


        // MULTI LEVEL INHERITANCE
        System.out.println("2) MULTI LEVEL INHERITANCE");
        ElectricCar eCar = new ElectricCar();
        eCar.start(); // from Vehicles
        eCar.drive(); // from Cars
        eCar.chargeBattery(); // from ElectricCar

        System.out.println();


        // HIERARCHICAL INHERITANCE
        System.out.println("3) HIERARCHICAL INHERITANCE");
        Carss car = new Carss();
        Bike bike = new Bike();

        car.start(); // from vehicle
        car.drive(); // from car

        bike.start(); // from vehicle
        bike.ride(); // from Bike

        System.out.println();


        // HYBRID INHERITANCE
        System.out.println("4) HYBRID INHERITANCE");
        ElectricCar1 tesla = new ElectricCar1();
        tesla.start(); // from Vehicle1
        tesla.drive(); // from Car1
        tesla.charge(); // fro ElectricCar1

        Truck tata = new Truck();
        tata.start(); // from Vehicle
        tata.load(); // from Truck

        System.out.println();

        
    }
}
