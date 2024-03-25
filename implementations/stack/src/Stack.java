import java.util.EmptyStackException;

public class Stack<T> {
    private int size;
    private int top;
    private T[] array;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.array = (T[]) new Object[size]; // Create an array of generic objects
    }

    public boolean push(T value) {
        if (isFull()) {
            return false;
        }
        array[++top] = value;
        return true;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // More appropriate exception
        }
        return array[top];
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = array[top];
        array[top--] = null; // Clear the reference for better garbage collection
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
