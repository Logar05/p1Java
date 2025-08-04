
import java.util.Arrays;

public class Test08 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'f', 'h', 'a', '-', 'b'},
            {'a', 'i', 'p', 's', 'o'},
            {'y', '-', 't', '-', 'l'},
            {'u', 'j', '-', 'c', '-'},
            {'k', 'l', 'z', '-', '-'},
            {'l', '-', 'v', 'w', 'k'},
            {'g', 'p', '-', 'y', 'a'},
            {'c', 's', 'r', '-', 'e'},
            {'e', '-', 'k', '-', 'r'},
            {'y', 'e', 'u', 'j', 'g'},
        };

        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 0, 2);

        System.out.println("----------");
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 1, 2);
        izpisi(krizanka, 1, 3);
        izpisi(krizanka, 1, 4);
        izpisi(krizanka, 1, 5);

        System.out.println("----------");
        izpisi(krizanka, 2, 1);
        izpisi(krizanka, 2, 2);
        izpisi(krizanka, 2, 3);
        izpisi(krizanka, 2, 4);

        System.out.println("----------");
        izpisi(krizanka, 3, 1);
        izpisi(krizanka, 3, 2);
        izpisi(krizanka, 3, 3);
        izpisi(krizanka, 3, 4);
        izpisi(krizanka, 3, 5);
        izpisi(krizanka, 3, 6);
        izpisi(krizanka, 3, 7);

        System.out.println("----------");
        izpisi(krizanka, 4, 1);
        izpisi(krizanka, 4, 2);
        izpisi(krizanka, 4, 3);
        izpisi(krizanka, 4, 4);
    }

    private static void izpisi(char[][] krizanka, int stolpec, int k) {
        char[] beseda = Druga.ktaBeseda(krizanka, stolpec, k);
        if (beseda == null) {
            System.out.println("null");
        } else {
            System.out.println(Arrays.toString(beseda));
        }
    }
}
