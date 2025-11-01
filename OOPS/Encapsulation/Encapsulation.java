// Encapsulation means wrapping data (variables) and methods that operate on that data into a single unit (class) and restricting direct access to the data for better security and control.
// In simple words —
// You hide the data using private variables,
// and provide public getter & setter methods to access or modify it safely.

// Example - 1
class Student{

    // private variable for data hiding
    private String name;
    private int age;

    // public Getter method (To read the value)
    public String getName(){
        return name;
    }

    // public Setter method (To modify the value)
    public void setName(String name){
        this.name = name;
    }

    // Getter for age
    public int getAge(){
        return age;
    }

    // Setter for age with validation logic
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Age must be positive!");
        }
    }

    // Method to display details
    public void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}

// Example - 2
class BankAccount {
    // Step 1: Private data (Data Hiding)
    private String accountNumber;
    private double balance;
    private String pin;

    // Constructor
    public BankAccount(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // Step 2: Public methods to control access (Encapsulation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount, String enteredPin) {
        if (this.pin.equals(enteredPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: ₹" + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Incorrect PIN!");
        }
    }

    public void checkBalance(String enteredPin) {
        if (this.pin.equals(enteredPin)) {
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Access Denied! Invalid PIN.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        // Example - 1

        // Creating an object of Student class
        Student s1 = new Student();

        // Using setters to assign values (controlled access)
        s1.setName("Bhanu");
        s1.setAge(21);

        // Using getters to read data
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        // Display all details
        s1.displayDetails();

        System.out.println();

        // Example - 2

        BankAccount account = new BankAccount("12345ABC", 10000.0, "4321");

        // These are allowed
        account.checkBalance("4321");
        account.deposit(5000);
        account.withdraw(2000, "4321");
        account.checkBalance("4321");

        // These are NOT allowed (data hiding in action)
        // account.balance = 999999;  // ERROR : balance is private
        // account.pin = "0000"; // ERROR : pin is private

        /* Why Data Hiding is Important Here:
        Prevents unauthorized access to account balance or PIN.
        Keeps business logic safe — only methods inside the class can modify data
        Protects from accidental mistakes by other developers using your class. */

        /* Real-life Analogy:
        Think of your bank account in a real bank:
        You can’t directly open the server and edit your balance 
        You must go through authorized methods like:
        Deposit
        Withdraw
        Check Balance
        (just like the public methods above)
        */

        //Data hiding = Keeping data safe + allowing access only through trusted interfaces (methods).
    }
}
