package academy.quadrivium.snippets.type;

import java.util.Arrays;

public class MoneryWallet2 {

    public static void main(String[] arguments) {
        boolean swapped = true;
        int[] moneyWallet = {200, 2040, 29283, 39, 921, 10, 22, 0, 1, 99};

        while (swapped) {
            swapped = swap(moneyWallet);
        }

        Arrays.stream(moneyWallet).forEach(System.out::println);
    }
    public static boolean swap(int[] array){
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