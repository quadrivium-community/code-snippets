package academy.quadrivium.snippets.sorter;

import java.util.Arrays;

public class SortingInteger {
    public static void main(String[] arguments) {
        int[] papaya = {1, 6, 8, 9, 10, 4, 2};
        boolean swapped = true;

        while (swapped) {
            swapped = swap(papaya);
        }

        Arrays.stream(papaya).forEach(System.out::println);

    }

    private static boolean swap(int[] array) {
        boolean count = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp;
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count = true;
            }
        }
        return count;
    }

}