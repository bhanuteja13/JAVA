import java.util.ArrayList;
public class withGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Type - safe
        list.add("Bhanu");
       
        // list.add(10); ❌ Compile-time error

        String name = list.get(0);
        System.out.println(name);

        // ✅ Advantages:
        // Type-safe (only String objects allowed).
        // No need for explicit type casting.
        // Catches errors at compile-time, not runtime.
    }
}