
import java.util.Arrays;

public class Test26 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'b', '-', '-', 'm', 'e'},
            {'-', '-', 'i', '-', 'h'},
            {'c', 'y', '-', 'i', 'z'},
            {'n', 'd', 'h', 'a', 'f'},
            {'l', 'c', '-', 'z', 'c'},
            {'w', 'w', 'j', 'y', 'v'},
            {'j', 'g', 'j', 't', 's'},
            {'p', 'n', 'a', 'c', '-'},
            {'e', '-', '-', 'a', 'l'},
            {'h', 'k', 'e', 'g', 'z'},
            {'m', 'p', 'm', 'f', 'b'},
            {'y', 'p', 'b', '-', '-'},
            {'o', '-', 'x', 'a', 't'},
            {'-', 'm', 'k', '-', 'i'},
            {'k', 'h', 'm', '-', '-'},
            {'g', '-', 'q', 'm', 'h'},
            {'s', 'r', '-', 'g', 'w'},
        };
        izpisi(krizanka, 2, 1);
        izpisi(krizanka, 4, 1);
        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 3, 1);
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
