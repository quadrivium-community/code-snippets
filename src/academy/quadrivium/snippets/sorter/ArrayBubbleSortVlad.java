package academy.quadrivium.snippets.sorter;


import java.util.Arrays;

public class ArrayBubbleSortVlad {
    public static void main(String[] args) {

        int[] A = {456, 7, 0, 19, 67, 44, 0, 0, 19, 88};
        boolean swapped = true;
        while(swapped){
            swapped=swap(A);
        }

        Arrays.stream(A).forEach(System.out::println);
    }

    public static boolean swap(int[] A){
        boolean swapped=false;
        for (int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i+1]){
                int temp;
                temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
                swapped=true;
            }
        }
        return swapped;
    }




}
