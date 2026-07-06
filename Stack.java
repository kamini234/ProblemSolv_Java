import java.util.Stack;
public class Stack{
    public static void displayStack(){
       Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("Stack :"+numbers);
        System.out.println("Top Element:"+numbers.peek());
        System.out.println("Popped Element:"+numbers.pop());
        System.out.println("Stack after pop :"+numbers);
    }
    public static void main(String[] args) {
        displayStack();
    }
}
