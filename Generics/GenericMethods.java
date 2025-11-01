class Test{
      public static <T> void printArray(T[] array){ // static generic method
        for(T element : array){
            System.out.print(element + " ");
        }
    }
}
public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"Bhanu", "Teja", "Rahul"};

        Test.printArray(intArr);
        System.out.println();
        Test.printArray(strArr);
        
    }
}
