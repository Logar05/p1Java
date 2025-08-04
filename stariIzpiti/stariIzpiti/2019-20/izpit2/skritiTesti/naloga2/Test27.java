
import java.util.Arrays;

public class Test27 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'b', 'k', '-', 'l', '-'},
            {'-', 'b', '-', '-', 'y'},
            {'i', 'r', 'o', 'z', 'k'},
            {'x', 'q', 'n', 'd', '-'},
            {'p', 's', 'l', 'i', 'g'},
            {'n', '-', '-', 'a', 'm'},
            {'j', 'p', 'u', '-', 'p'},
            {'-', 'u', '-', 'c', 'm'},
            {'i', 'u', 'v', 'o', 'r'},
            {'k', 'n', 'h', '-', 'f'},
            {'n', 'r', 'q', 'r', 'o'},
            {'v', 'o', 'v', '-', '-'},
            {'c', 'y', 'k', 'h', 'v'},
            {'c', 'e', 'm', 'z', 'u'},
            {'k', 'e', 'a', '-', 'y'},
            {'q', 'c', 'o', 'u', 'd'},
            {'t', 'd', '-', 'x', 'k'},
            {'n', 'd', 'w', 'd', 'f'},
            {'-', 'x', 'i', '-', 's'},
        };
        izpisi(krizanka, 3, 1);
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 4, 1);
        izpisi(krizanka, 2, 1);
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
