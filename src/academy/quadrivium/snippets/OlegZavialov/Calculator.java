package academy.quadrivium.snippets.OlegZavialov;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, result;
        String operator;

        System.out.print("Insert integer: ");
        a = in.nextInt();

        System.out.print("Define operator: ");
        operator = in.next();

        System.out.print("Insert another integer: ");
        b = in.nextInt();

        if (operator.equals("*")) {
            result = a * b;
        }
        if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("/")) {
            result = a / b;
        } else if (operator.equals("%")) {
            result = a % b;
        } else if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else {
            throw new RuntimeException("Operator is not supported!");
        }
        System.out.println(result);
            }
}
