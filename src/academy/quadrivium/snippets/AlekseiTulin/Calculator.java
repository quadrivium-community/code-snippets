package academy.quadrivium.snippets.AlekseiTulin;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result;

        System.out.print("\nInsert first number, operator (+, -, *, /, %) and second number separated by a " +
                "space or new line, and press Enter: ");
        Double first = in.nextDouble();
        char operator = in.next().charAt(0);
        Double second = in.nextDouble();

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
                throw new RuntimeException("\n\n========================" +
                        "\nError! \nOperator is not correct, please press 'Return 'Calculator'' of that " +
                        "application and try again.\n========================\n");
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
