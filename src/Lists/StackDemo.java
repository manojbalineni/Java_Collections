package Lists;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        /**
         * Inherits from Vector.
         * Follows LIFO (Last In, First Out).
         * Provides push, pop, peek operations.
         */
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println("Popped element: " + stack.pop());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Printing remaining elements
        System.out.println("Stack elements: " + stack);
    }
}
