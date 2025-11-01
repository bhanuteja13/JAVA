// Definition of Enum in Java:
// Enum (short for Enumeration) in Java is a special data type that is used to define a set of named constants — that is, values that do not change.
// Each constant in an enum is treated as an object of the enum type, and all enum constants are public, static, and final by default.

// | Use Case            | Example                      | Why Enum is Better       |
// | ------------------- | ---------------------------- | ------------------------ |
// | Fixed categories    | Days, Months, Seasons        | Prevent invalid inputs   |
// | States              | OrderStatus, MachineState    | Clear, readable          |
// | Switch-case         | Traffic lights, Menu options  | Easier logic             |
// | Constants with data | Planets, Error codes         | Store info + behavior    |
// | Type safety         | Colors, Modes                | Compiler checks validity |

// Step 1: Define enum outside or inside a class
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY; // Assign an enum constant
        System.out.println("Today is " + today);

        // Step 3: You can use it in conditions too
        if (today == Day.SUNDAY) {
            System.out.println("It's holiday!");
        } else {
            System.out.println("It's a weekday.");
        }

        // Step 4: Loop through all enum values
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}



