// Abstract class representing a Smart Device
abstract class SmartDevice {
    // Abstract method — no implementation, must be defined by subclasses
    abstract void turnOn();

    abstract void turnOff();

    // Non-abstract method — shared by all smart devices
    void connectToWifi() {
        System.out.println("Connected to Wi-Fi successfully.");
    }
}

// Subclass 1: Smart Fan
class SmartFan extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Fan is now ON.");
    }

    void turnOff() {
        System.out.println("Smart Fan is now OFF.");
    }
}

// Subclass 2: Smart Light
class SmartLight extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Light is now ON.");
    }

    void turnOff() {
        System.out.println("Smart Light is now OFF.");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        SmartDevice fan = new SmartFan();
        SmartDevice light = new SmartLight();

        fan.connectToWifi();
        fan.turnOn();
        fan.turnOff();

        light.connectToWifi();
        light.turnOn();
        light.turnOff();
    }
}
