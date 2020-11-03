package academy.quadrivium.snippets.OlegZavialov;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insert integer: ");
        int a = in.nextInt();

        System.out.print("Define operator: ");
        String operator = in.next();

        System.out.print("Insert another integer: ");
        int b = in.nextInt();

        if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else if (operator.equals("%")) {
            System.out.println(a % b);
        } else if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else {
            throw new RuntimeException("Operator is not supported!");
        }
    }
}
