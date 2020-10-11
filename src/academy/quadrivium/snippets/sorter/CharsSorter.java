package academy.quadrivium.snippets.sorter;

public class CharsSorter {
    public static void main(String[] arguments) {
        char[] papaya = {'f','t','T','e','#','T', 'B','a'};
        boolean swapped = true;

        while (swapped) {
            swapped = swap(papaya);
        }

        System.out.println(papaya);
    }

    private static boolean swap(char[] array) {
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

