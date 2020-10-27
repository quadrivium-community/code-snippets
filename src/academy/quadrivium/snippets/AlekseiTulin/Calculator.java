package academy.quadrivium.snippets.AlekseiTulin;
import java.util.*;

interface InterfaceForApplication {
    Scanner in = new Scanner(System.in);
    String name = in.next();
}

public class Calculator implements InterfaceForApplication {
    public static void main(String[] args) {

        System.out.print("Insert your name: ");
        System.out.print("\nHello " + name);
        System.out.print("\nHow work calculator: Insert first number, operator (+, -, *, /, %) and second number separated by a space or new line, and press Enter: \n");

        Double first = in.nextDouble();
        char operator = in.next().charAt(0);
        Double second = in.nextDouble();
        Double result = null;

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
                result = first % second;
            default:
                System.out.print("Operator is not correct, please insert first number, operator and second number again, and press Enter.");
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}