// Interface representing a payment system
interface Payment {
    void pay(double amount); // Abstract method
}

// Implementing class 1: Paytm
class Paytm implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}

// Implementing class 2: GooglePay
class GooglePay implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Google Pay.");
    }
}

// Implementing class 3: PhonePe
class PhonePe implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePe.");
    }
}
public class Interface {
    public static void main(String[] args) {
        Payment p1 = new Paytm();
        Payment p2 = new GooglePay();
        Payment p3 = new PhonePe();

        p1.pay(500);
        p2.pay(750);
        p3.pay(1000);
    }
}
