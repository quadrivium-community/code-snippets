package academy.quadrivium.snippets.sorter;

import java.util.Arrays;

public class Sortirovka {
    private static int countChangesInArray;
    private static int countNoChangesInArray;
    private static final int[] number = {12, 245, 29, 39, 9, 10, 7, 0, 1, 79};

    public static void main(String[] arguments) {
        boolean swapped = true;
        System.out.println("\nНе отсортированный массив:" + Arrays.toString(number));

        while (swapped) {
            swapped = swap(number);
        }

        System.out.println(
                "Результат отсортированного массива:" + Arrays.toString(number) +
                        "\nМетод swap произвел:" + countChangesInArray + " изменений/я в массиве " +
                        "\nМетод swap ничего " + "не изменил в массиве:" + countNoChangesInArray + " раз/а"
        );
    }

    public static boolean swap(int[] array){
        boolean haveTheValuesChanged = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                haveTheValuesChanged = true;
                countChangesInArray ++;
            } else {
                countNoChangesInArray ++;
            }
        }
        return haveTheValuesChanged;
    }
}
