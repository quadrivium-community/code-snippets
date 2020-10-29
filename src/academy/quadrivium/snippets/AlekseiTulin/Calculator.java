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
        System.out.print("\nHow work calculator: Insert first number, operator (+, -, *, /, %) and second number " +
                "separated by a space or newline, and press Enter: \n");

        Double result = null;

        try {
            while(result == null) {
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
                        result = first % second;
                    default:
                        System.out.print("The operator is not correct, please insert the first number, operator, " +
                                "and second number again, and press Enter.\n");
                }

                System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
            }

        } catch (InputMismatchException e) {
            System.out.println("Sorry, calculator not working like that, if you won't run that " +
                    "app again please click the restart button, and try again.");
        }
    }
}