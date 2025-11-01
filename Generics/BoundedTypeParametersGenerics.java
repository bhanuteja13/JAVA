class Box<T extends Number>{ // Only subclasses of Number allowed
    T num;

    Box(T num){
        this.num = num;
    }

    void show(){
        System.out.println(num);
    }

    @Override
    public String toString() {
        return "Box contains: " + num;
    }
}
public class BoundedTypeParametersGenerics {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>(10);
        Box<Double> dBox = new Box<>(3.14);
        // Box<String> sBox = new Box<>("Hello"); ❌ Error

        // uses show method
        iBox.show();
        dBox.show();
        
        // Uses toString() method 
        System.out.println(iBox);
        System.out.println(dBox);
    }
}
