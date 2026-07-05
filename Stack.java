
public class Stack{
    //Create a Mathod
    public static void displayStack(){
       java.util.Stack<Integer> numbers = new java.util.Stack<>();
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