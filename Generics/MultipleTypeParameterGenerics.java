class Pair<K, V>{
    K key;
    V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    void display(){
        System.out.print(key + " " + value);
    }
}
public class MultipleTypeParameterGenerics {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Bhanu");
        p1.display();

        System.out.println();
        
        Pair<String, Double> p2 = new Pair<>("Teja", 3.14);
        p2.display();

    }
}
