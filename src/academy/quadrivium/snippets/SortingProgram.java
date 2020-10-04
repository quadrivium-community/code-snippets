package academy.quadrivium.snippets;

import java.util.Arrays;

public class SortingProgram {

    public static void main(String[] arguments) {
        // array yo sort
        final char[] chars = {'a', 'b', 'b', 'a', 'a', 'b', 'b', 'c', 'a', 'd', 'a', 'b', 'b', 'a', 'a', 'b', 'b', 'a'};
        System.out.println("\n\n==============S=O=R=T=I=N=G==============");
        Arrays.sort(chars,0,18);
        System.out.print("Array of not sorted characters: ");
        System.out.println(chars);

        final char[] sortedArray = sortAscending(chars);

        System.out.print("Sorted array of characters: ");
        System.out.println(sortedArray);
    }

    private static char[] sortAscending(char[] arrayToSort) {
        // implement sorting here
        return new char[] {}; // return correct sorted array
    }
}



