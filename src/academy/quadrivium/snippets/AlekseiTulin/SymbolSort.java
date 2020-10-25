package academy.quadrivium.snippets.AlekseiTulin;
import java.util.Arrays;

public class SymbolSort {

    // Number of changes in the array
    private static int countChangesInArray;
    private static int countNoChangesInArray;
    private static final char[] alphabetBook = {'g', 'i', 'S', 's', 'P', 'ю', 'l', 'q', 'ъ', 'v', '*', '_', '&', 'ö'};

    public static void main(String[] arguments) {
        boolean swapped = true;
        System.out.println("\nНе отсортированный массив:" + Arrays.toString(alphabetBook));

        while (swapped) {
            swapped = swap(alphabetBook);
        }

        System.out.println(
                "Результат отсортированного массива:" + Arrays.toString(alphabetBook) +
                "\nМетод swap произвел:" + countChangesInArray + " изменений/я в массиве " +
                "\nМетод swap ничего " + "не изменил в массиве:" + countNoChangesInArray + " раз/а"
        );
    }

    public static boolean swap(char[] array){
        boolean haveTheValuesChanged = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                char temp = array[i];
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