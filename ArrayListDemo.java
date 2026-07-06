import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void displayList() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
    }
    public static void main(String[] args) {
        displayList();
    }
}
