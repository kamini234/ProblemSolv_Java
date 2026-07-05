
public class TreeMap{
    
    public static void displayMap() {
        java.util.TreeMap<Integer, String> map = new java.util.TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
    }

    public static void main(String[] args) {
        displayMap();
    }
}