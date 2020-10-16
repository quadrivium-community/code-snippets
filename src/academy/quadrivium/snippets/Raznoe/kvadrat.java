package academy.quadrivium.snippets.Raznoe;

import java.util.Scanner;

public class kvadrat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = 0;
        double y = ((1 - x * x) + (2.5 * x * x * x) + (x * x * x * x)*(1 - x * x) + (2.5 * x * x * x) + (x * x * x * x));
        System.out.print(y);
    }
}