package academy.quadrivium.snippets.AlekseiTulin;

import java.util.Arrays;

public class IntegerSort {
    private static int countChangesInArray;
    private static int countNoChangesInArray;
    private static final int[] number = {12, 24225, 29, 913, 91, 20, 7, 0, 11, 79};

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
