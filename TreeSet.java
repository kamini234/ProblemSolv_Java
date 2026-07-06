import java.util.TreeSet;
import java.util.Set;
public class TreeSet{
    public static void displaySet() {
       Set<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
    }
    public static void main(String[] args) {
        displaySet();
    }
}
