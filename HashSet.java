import java.util.HashSet;
import java.util.Set;
public class HashSet {
    public static void displaySet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
    }
    public static void main(String[] args) {
        displaySet();
    }
}
