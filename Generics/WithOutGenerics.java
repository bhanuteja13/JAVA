import java.util.ArrayList;

public class WithOutGenerics {
    public static void main(String[] args) {
        // Not used the Generic they are treated as objects
        ArrayList list = new ArrayList();

        // Different types of Datatypes
        list.add("Bhanu");
        list.add(10); 
        list.add(3.14);

        for(Object obj : list){
            System.out.println(obj + " is a type of " + obj.getClass().getName());
        }

        // Type casting is needed
        String name = (String) list.get(0);
        int val = (int) list.get(1);
        System.out.println(name);
        System.out.println(val);

        // Problem:
        // You can store any type of object → no type safety.
        // You must use type casting, which can cause runtime errors.
    }
}
