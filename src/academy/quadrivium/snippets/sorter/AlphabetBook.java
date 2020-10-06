package academy.quadrivium.snippets.sorter;

import java.util.Arrays;

public class AlphabetBook {

    // Number of changes in the array
    private static int countChangesInArray;
    private static int countNoChangesInArray;

    public static void main(String[] arguments) {
        boolean swapped = true;
        char[] alphabetBook = {'g', 'i', 'S', 's', 'P', 'ю', 'l', 'q', 'ъ', 'v'};

        while (swapped) {
            swapped = swap(alphabetBook);
        }

        System.out.println("Результат отсортированного массива: " + Arrays.toString(alphabetBook));
        System.out.println("Метод swap произвел:" + countChangesInArray + " изменений/я в массиве");
        System.out.println("Метод swap ничего не изменил в массиве:" + countNoChangesInArray + " раз/а");
    }

    public static boolean swap(char[] array){
        boolean count = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                char temp;
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count = true;
                countChangesInArray = countNoChangesInArray + 1;
            } else {
                countNoChangesInArray = countNoChangesInArray + 1;
            }
        }
        return count;
    }
}