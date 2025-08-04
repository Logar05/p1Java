
import java.util.Arrays;

public class Test34 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'f', '-', 'm', 's', 'n', 'b'},
            {'k', 's', 'd', 'k', '-', 'f'},
            {'c', 'f', 'g', 'n', 'c', 'm'},
            {'h', 'z', '-', 'x', 'k', '-'},
            {'b', 'r', 'y', 'n', 'r', 'k'},
            {'h', 'c', 'v', 'g', 'a', 'w'},
            {'j', 'h', 'q', 'x', 'l', 'w'},
            {'v', 'p', 'c', 'y', '-', 't'},
            {'e', 'w', '-', 'y', 'r', 'c'},
            {'g', 'r', 'm', 'v', '-', 'k'},
            {'q', 'y', 'g', '-', 'q', 'e'},
        };
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 2, 1);
        izpisi(krizanka, 5, 1);
        izpisi(krizanka, 0, 1);
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
