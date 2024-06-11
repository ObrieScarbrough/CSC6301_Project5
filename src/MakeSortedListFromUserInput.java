import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

/**
 * This class reads a list of integers from user input,
 * stores them in an ArrayList, sorts the list in ascending order,
 * and provides the sorted list.
 * Reuse-- The only change that was made was on line 35.
 *      Originally it mentioned a linked list, so I changed that to a stack.
 * @author Obrie Scarbrough
 * @version 1.0
 * @since 6/1/2024
 */
public class MakeSortedListFromUserInput {
    public List<Integer> newList;

    /**
     * Constructs a new MakeSortedListFromUserInput object with an empty list.
     * @since 6/1/24
     */
    public MakeSortedListFromUserInput() {
        this.newList = new ArrayList<>();
    }

    /**
     * Reads integers from the user input until the user types "end".
     * The integers are added to newList.
     * @since 6/1/24
     * @throws NumberFormatException user enters a non-integer value (except "end"), an exception will be thrown.
     *                               This exception is handled in here with a try catch.
     */
    public void getIntFromUser() {
        System.out.println("Please enter all integers to be sorted and placed in a stack. Enter 'end' when finished.");
        try {
            Scanner userInput = new Scanner(System.in);
            while (userInput.hasNext()) {
                String temp = userInput.next();
                if (temp.equalsIgnoreCase("end")) {
                    break;
                } else {
                    int i = Integer.parseInt(temp);
                    newList.add(i);
                }
            }
            userInput.close();
        } catch (Exception e) {
            System.out.println("Please input only integers and the word 'end' when finished.");
            this.getIntFromUser();
        }
    }
    /**
     * Sorts the list of integers in ascending order.
     * @since 6/1/24
     * Reused pre-built code to sort the array of integers.
     */
    public void sortList() {
        Collections.sort(newList);
    }

    /**
     * Returns the sorted list of integers.
     * @since 6/1/24
     * @return newList.
     */
    public List<Integer> getList() {
        return newList;
    }
}