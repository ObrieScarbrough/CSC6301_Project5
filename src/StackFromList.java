import java.util.*;

/**
 * This class provides a method to create a Stack from a given List of integers.
 * Reuse-- I used the built-in Stack data structure from the Java collections framework.
 *  * @author Obrie Scarbrough
 *  * @version 1.0
 *  * @since 6/7/2024
 */
    public class StackFromList {

    /**
     * Converts a given List of integers into a Stack.
     * @param list the List of integers to be converted into a Stack
     * @return a Stack containing all elements from the provided List in the same order
     * @since 6/7/2024
     */
    public Stack<Integer> CreateStack(List<Integer> List) {
    Stack<Integer> newStack = new Stack<>();
    for (int i = 0; i < List.size(); i++) {
        newStack.push(List.get(i));
    }
    return newStack;
    }
}
