package academy.quadrivium.snippets.sorter;

import java.util.Arrays;

public class IntegersSorter {
	public static void main(String[] arguments) {
		final int[] integers = {1, 6, 8, 9, 10, 4, 2};
		sort(integers);
		printArray(integers);
	}

	private static void sort(int[] integers) {
		boolean hasSwapped = true;
		while(hasSwapped) {
			hasSwapped = swap(integers);
		}
	}

	private static boolean swap(int[] array) {
		boolean hasSwapped = false;
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i + 1]) {
				final int temp;
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				hasSwapped = true;
			}
		}
		return hasSwapped;
	}

	private static void printArray(int[] papaya) {
		Arrays.stream(papaya).forEach(System.out::println);
	}
}
