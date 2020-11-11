package academy.quadrivium.snippets.OlegZavialov;

import java.util.Scanner;
    public class Okruglenie {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            double a = in.nextDouble();
            long b = 3;
            long c = (long)Math.ceil(a/b);
            System.out.println (c);
        }
    }
