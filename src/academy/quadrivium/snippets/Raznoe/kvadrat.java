package academy.quadrivium.snippets.Raznoe;

public class kvadrat {
    public static void main(String[] args) {
        double x = 1;
        double y = 1 - (Math.sqrt(x) + 2.5 * (x * Math.sqrt(x)) + Math.sqrt(x) *Math.sqrt(x));
        double z = y*y;
        System.out.print(z);
    }
}