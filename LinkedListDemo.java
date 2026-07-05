import java.util.LinkedList;

public class LinkedListDemo {
    // Create a Method
    public static void displayList() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);
    }

    public static void main(String[] args) {
        displayList();
    }

}