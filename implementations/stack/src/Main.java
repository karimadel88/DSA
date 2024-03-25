public class Main {
    public static void main(String[] args) {
        // Test with integers
        Stack<Integer> intStack = new Stack<>(3);
        System.out.println("Integer Stack:");
        intStack.push(5);
        intStack.push(10);
        intStack.push(15);

        System.out.println("Popped: " + intStack.pop());
        System.out.println("Peek: " + intStack.peek());

        intStack.display();

        // Test with strings
        Stack<String> strStack = new Stack<>(2);
        System.out.println("\nString Stack:");
        strStack.push("Java");
        strStack.push("Python");

        System.out.println("Popped: " + strStack.pop());
        strStack.display();

    }
}