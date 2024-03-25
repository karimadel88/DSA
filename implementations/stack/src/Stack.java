import java.util.EmptyStackException;

public class Stack<T> {

    private int size;       // Maximum size of the stack
    private int top;        // Index of the top element in the stack
    private T[] array;      // Array to store stack elements

    /**
     * Constructor to initialize a stack with a specified size.
     * @param size The maximum number of elements the stack can hold.
     */
    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.array = (T[]) new Object[size]; // Array of generic objects
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param value The element to be added.
     * @return True if the element was added successfully, false if the stack is full.
     */
    public boolean push(T value) {
        if (isFull()) {
            return false; // Cannot add to a full stack
        }
        array[++top] = value;
        return true;
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return The top element of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Cannot peek from an empty stack
        }
        return array[top];
    }

    /**
     * Removes and returns the top element of the stack.
     * @return The removed top element.
     * @throws EmptyStackException if the stack is empty.
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Cannot pop from an empty stack
        }
        T value = array[top];
        array[top--] = null; // Clear reference for garbage collection
        return value;
    }

    /**
     * Checks if the stack is empty.
     * @return True if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     * @return True if the stack is full, false otherwise.
     */
    public boolean isFull() {
        return top == size - 1;
    }

    /**
     * Prints the elements of the stack in order (top to bottom).
     */
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
