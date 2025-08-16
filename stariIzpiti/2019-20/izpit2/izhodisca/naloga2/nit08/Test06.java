
import java.util.Arrays;

public class Test06 {

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
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 2, 1);
        izpisi(krizanka, 3, 1);
        izpisi(krizanka, 4, 1);
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
