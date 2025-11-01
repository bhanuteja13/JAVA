/* What is Comparator?
Comparator is a functional interface in Java (java.util.Comparator) used to define custom sorting logic for objects.
Unlike Comparable, which defines natural ordering (inside the class),
Comparator allows you to define multiple different sorting rules outside the class. 
*/

/* When to Use Comparator
When you want to sort objects based on multiple different fields (like name, id, age, etc.).
When you cannot modify the class (e.g., class is from an external library).
When custom sorting order (e.g., descending) is needed. 
*/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Student{
    int id;
    String name;

    // Constructor
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // toString() to print student details
    public String toString() {
        return id + " " + name;
    }

}
public class comparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Bhanu"));
        list.add(new Student(2, "Teja"));
        list.add(new Student(5, "Pinky"));
        list.add(new Student(4, "Rahul"));


        /* ======================================================
           1️⃣ TRADITIONAL WAY - Using Anonymous Inner Class
           ====================================================== */
           System.out.println("Using Anonymous Inner Class");
           // NAME COMPARISION
        Comparator<Student> nameComparator = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return s1.name.compareTo(s2.name);
            }
        };

        Collections.sort(list, nameComparator);

        System.out.println(list);

        // ID COMPARISION
        Comparator<Student> idComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                return s1.id - s2.id;
            }
        };

        Collections.sort(list, idComparator);

        System.out.println(list);

        System.out.println();

        System.out.println("Using Lambda Expression");
        /* ======================================================
           2️⃣ LAMBDA EXPRESSION (Assigning comparator to variable)
           ====================================================== */
           // NAME COMPARISION
           Comparator<Student> nameComparatorLambda = (s1, s2) -> s1.name.compareTo(s2.name);
           Collections.sort(list, nameComparatorLambda);
           System.out.println(list);

           // ID COMPARISION
           Comparator<Student> idComparatorLambda = (s1, s2) -> s1.id - s2.id;
           Collections.sort(list, idComparatorLambda);
           System.out.println(list);

           System.out.println();

           /* ======================================================
           3️⃣ INLINE LAMBDA (Comparator directly inside sort)
           ====================================================== */
           System.out.println("Inline Lambda");
           // NAME COMPARISION
            Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
            System.out.println(list);

            // ID COMPARISION
            Collections.sort(list, (s1, s2) -> s1.id - s2.id);
            System.out.println(list);
            
            System.out.println();
    }
}
