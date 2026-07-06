import java.util.TreeMap;
import java.util.Map;
public class TreeMap{
    
    public static void displayMap() {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
    }
    public static void main(String[] args) {
        displayMap();
    }
}
