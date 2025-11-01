// Parent class
class Guest {
    // Method defined in Guest class
    public void read() {
        System.out.println("Guest read");
    }
}

// Developer class inherits from Guest
class Developer extends Guest {
    // Method specific to Developer
    public void write() {
        System.out.println("Developer write");
    }
}

// Admin class inherits from Developer
class Admin extends Developer {

    // Overriding the read() method from Guest class
    @Override
    public void read() {
        System.out.println("Admin deleted application");
    }

    // Admin class's own method
    public void manage() {
        // 'super.read()' calls the parent class (Guest) method
        // even though Admin has overridden 'read()'
        super.read(); // → Calls Guest's read(), not Admin's

        // Normal method call (no super), so current class hierarchy applies
        write(); // → Calls Developer's write() method

        System.out.println("manage code");
    }
}

// Main class to execute the program
public class InheritanceSuperKeyWord {
    public static void main(String[] args) {

        // Creating an object of Admin
        Admin a1 = new Admin();

        // Calls Admin's overridden read() method
        a1.read(); // → Output: "Admin deleted application"

        // Calls Developer's write() method (inherited by Admin)
        a1.write(); // → Output: "Developer write"

        // Calls Admin's manage() method
        a1.manage();
        /*
           Inside manage():
           → super.read()   → calls Guest.read()  → "Guest read"
           → write()        → calls Developer.write() → "Developer write"
           → print statement → "manage code"
        */
    }
}

/*
======================== OUTPUT ========================
Admin deleted application
Developer write
Guest read
Developer write
manage code
========================================================
*/

/*
======================== EXPLANATION =========================

👉 'super' keyword in Java is used to:
   1️⃣ Access parent class methods that are overridden in the subclass.
   2️⃣ Access parent class variables (if hidden by subclass variables).
   3️⃣ Call parent class constructors.

💡 In this program:
   - 'read()' is overridden in Admin.
   - But inside manage(), we used 'super.read()' → so Guest's read() executes.
   - This shows how 'super' helps us reach the parent’s version of a method
     when the current class has overridden it.
==============================================================
*/
