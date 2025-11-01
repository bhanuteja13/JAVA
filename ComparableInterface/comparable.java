// 🧩 What is Comparable in Java?
// ✅ Definition:
// Comparable is an interface in Java that allows objects of a class to be compared to each other — mainly for sorting.
// It defines a natural (default) way of ordering objects.

/* 📦 Location in Java Library
It is part of the java.lang package, so you don’t need to import it manually.

package java.lang;
public interface Comparable<T> {
    public int compareTo(T o);
} 

Comparable has only one method:
int compareTo(T o)
*/

// ✅ Purpose:
// Used to compare the current object (this) with another object (o) of the same type.

// Defining A Class implementing Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int id;
    String name;

    // Constructor
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Implementing compareTo Method 
    @Override
    public int compareTo(Student s){
        return this.id - s.id;
    }

    // // Sort by Name
    // @Override
    // public int compareTo(Student s){
    //     return this.name.compareTo(s.name);
    // }

    // Multiple Sorting Fields
    // If two students have the same ID, you can compare by name as a tie-breaker:
    // @Override
    // public int compareTo(Student s) {
    //     if (this.id == s.id)
    //         return this.name.compareTo(s.name);
    //     else
    //         return this.id - s.id;
    // }

    // toString() for display
    @Override
    public String toString(){
        return id + " " + name;
    }

}
public class comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Bhanu"));
        list.add(new Student(2, "Arun"));

        // Sort using natural order (compareTo)
        Collections.sort(list);

        System.out.println(list);
    }
}
