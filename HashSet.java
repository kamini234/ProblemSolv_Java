public class HashSet {
    // Create a Method
    public static void displaySet() {
        java.util.HashSet<Integer> numbers = new java.util.HashSet<>();
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        displaySet();
    }
}