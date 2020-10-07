package academy.quadrivium.snippets.sorter;
import java.util.Arrays;

public class MoneyWallet {

    // Number of changes in the array
    private static int countChangesInArray;
    private static int countNoChangesInArray;
    private static final int[] moneyWallet = {200, 2040, 29283, 39, 921, 10, 22, 0, 1, 99};

    public static void main(String[] arguments) {
        boolean swapped = true;
        System.out.println("\nНе отсортированный массив:" + Arrays.toString(moneyWallet));

        while (swapped) {
            swapped = swap(moneyWallet);
        }

        System.out.println(
                "Результат отсортированного массива:" + Arrays.toString(moneyWallet) +
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