enum Planet {
    MERCURY(57.9), VENUS(108.2), EARTH(149.6), MARS(227.9);

    private double distanceFromSun; // in million km

    // Constructor
    Planet(double distance) {
        this.distanceFromSun = distance;
    }

    public double getDistance() {
        return distanceFromSun;
    }
}
public class EnumExample {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p + " is " + p.getDistance() + " million km from the Sun");
        }
    }
}

// 🧩 ENUM TIPS & TRICKS IN JAVA

// 1️⃣ Enums are more powerful than constants — they are type-safe and can contain fields, methods, and constructors.
// 2️⃣ Enums can be used in switch statements — makes code cleaner and easier to read.
// 3️⃣ Enums have built-in methods — like values(), valueOf(), ordinal(), and name().
// 4️⃣ Enums can have fields and methods — each constant can hold its own data or behavior.
// 5️⃣ Enums can override methods per constant — allows unique behavior for each constant.
// 6️⃣ Enums can implement interfaces — but cannot extend classes.
// 7️⃣ Enums can be declared inside classes — useful for logical grouping.
// 8️⃣ Enum constructors are private — you can’t create enum objects using new.
// 9️⃣ String-to-enum conversion should be handled safely — use try-catch or custom methods to avoid errors.
// 🔟 Enum constants are singleton objects — only one instance exists for each constant.

