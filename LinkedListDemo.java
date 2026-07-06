import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
  public static void displayList() {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
    }
    public static void main(String[] args) {
        displayList();
    }
}
