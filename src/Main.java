import java.util.List;
import java.lang.*;

/**
 * Main class to demonstrate the usage of MakeSortedListFromUserInput and ListOfLinks classes.
 * @author Obrie Scarbrough
 * @version 1.0
 * @since 6/1/2024
 */
public class Main {
    /**
     * Main method to run the program.
     * @param args Command line arguments (not used).
     * Reuse-- Only two lines were changed.
     *  1. I initialize a stack instead of a linked list on line 19
     *  2. I call a method from the StackFromList class on line 25 instead of the equivalent method for my linked lists.
     */
    public static void main(String[] args) {
        MakeSortedListFromUserInput userInput = new MakeSortedListFromUserInput();
        StackFromList newStack = new StackFromList();
        List<Integer> returnedList;
        userInput.getIntFromUser();
        userInput.sortList();
        returnedList = userInput.getList();
        System.out.println(newStack.CreateStack(returnedList));
    }
}