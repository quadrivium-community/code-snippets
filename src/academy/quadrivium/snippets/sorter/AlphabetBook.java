package academy.quadrivium.snippets.sorter;

import java.util.Arrays;

public class AlphabetBook {

    public static void main(String[] arguments) {
        boolean swapped = true;
        char[] alphabetBook = {'g', 'i', 'S', 's', 'P', 'ю', 'l', 'q', 'ъ', 'v'};

        while (swapped) {
            swapped = swap(alphabetBook);
        }

        System.out.println(alphabetBook);
        //Arrays.stream(moneyWallet).forEach(System.out::println);
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
            }
        }
        return count;
    }
}