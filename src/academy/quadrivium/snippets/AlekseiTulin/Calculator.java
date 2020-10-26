package academy.quadrivium.snippets.AlekseiTulin;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        String message[] = {"\nInsert first number, operator (+, -, *, /, %) and second number separated by a \" +\n" +
                "\"space or new line, and press Enter: \n", "\\n\\n========================\" +\n" +
                "\"\\nError! \\nOperator is not correct, please press 'Return 'Calculator'' of that \" +\n" +
                "\"application and try again.\\n========================\\n"
        };

        System.out.print(message[0]);
        Scanner in = new Scanner(System.in);
        Double first = in.nextDouble();
        char operator = in.next().charAt(0);
        Double second = in.nextDouble();
        Double result;

        switch(operator) {
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '%':
                result = first % first;
                break;
            default:
                throw new RuntimeException(message[1]);
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}