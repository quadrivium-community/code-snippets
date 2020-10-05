package academy.quadrivium.snippets.sorter;


import java.util.Arrays;

public class ArrayBubbleSortVladChar {
    public static void main(String[] args) {

        char[] A = {'a','f','r','t','1','7','%','$'};
        boolean swapped = true;
        while(swapped){
            swapped=swap(A);
        }

        for (char element: A) {
            System.out.println(element);
        }
    }

    public static boolean swap(char[] A){
        boolean swapped=false;
        for (int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i+1]){
                char temp;
                temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
                swapped=true;
            }
        }
        return swapped;
    }

}
