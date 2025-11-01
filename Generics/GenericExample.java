public class GenericExample<T> {
    T value;

    GenericExample(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public static void main(String[] args) {
        GenericExample<Integer> obj1 = new GenericExample<>(100);
        GenericExample<String> obj2 = new GenericExample<>("Bhanu");

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}
