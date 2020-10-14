package academy.quadrivium.snippets.Raznoe;

public class Delenie2 {

    // метод
    public static long a = 55656567464L;
    public static long b = 674764;

    public static long delenie(long firstNum, long secondNum) {
        return firstNum % secondNum;
    }

    public static void main(String[] args) {
        System.out.println("result: " + delenie(a, b));
    }
}

