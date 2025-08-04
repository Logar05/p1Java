
import java.util.Arrays;

public class Test50 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'k', 'd', 'b', 'z', 'q'},
            {'z', 'z', 'o', 'g', 'x'},
            {'o', 'p', 'v', 'i', 'g'},
            {'z', 'n', 'r', 'o', 't'},
            {'b', 'r', '-', '-', 'v'},
            {'q', 'v', 'l', 's', 'a'},
            {'b', 'k', 't', 'e', '-'},
            {'-', 'k', 'j', 'y', 'b'},
            {'f', 'v', '-', 'o', 'c'},
            {'l', 'f', 'i', 'a', 'w'},
            {'q', 'v', 'o', 'o', 'v'},
            {'c', '-', 'v', 'v', 'z'},
            {'y', 'v', 'c', 'n', '-'},
            {'h', 'j', 'z', 'e', 'z'},
            {'-', 'f', 'o', 'y', 'm'},
            {'v', 'q', 'n', 'r', 'o'},
            {'t', 'y', 'h', 'i', '-'},
            {'m', 'l', 'k', 't', 'n'},
            {'r', 'v', 'q', 'h', 'l'},
            {'-', 'l', 'm', 'v', '-'},
            {'x', 'f', 'o', 'e', '-'},
            {'u', 'q', 'z', 'o', 'd'},
            {'k', 'e', 'n', 'e', 'e'},
            {'d', 'g', 'a', 'i', 'q'},
            {'x', 'n', 'v', 'u', 'm'},
            {'-', 'q', 'r', 'j', 'r'},
            {'d', '-', 'u', '-', 'r'},
            {'x', 'i', 'u', 'h', 'e'},
            {'e', 'p', 'w', 'p', 'z'},
            {'v', 'x', 'p', 'b', 'q'},
            {'m', 'v', 'u', '-', 's'},
            {'y', 'y', 'e', 'a', 'u'},
            {'l', 't', 'z', 'p', 'i'},
            {'j', 't', 'd', 'e', 'a'},
            {'v', 'o', 't', 'e', 't'},
            {'f', 'b', 'a', 'd', 'm'},
            {'b', 'n', 'w', 'z', 'c'},
            {'z', 'u', 'w', 'j', 'l'},
            {'o', 'q', 'l', '-', '-'},
            {'e', '-', 's', '-', 'f'},
            {'-', 'l', 'z', 'i', 'n'},
            {'l', 'w', 'k', 'l', 'b'},
            {'k', 's', 'h', 'z', 'n'},
            {'m', 'c', 'k', 'y', 'i'},
            {'b', 'l', 'l', '-', 'f'},
            {'e', 'c', 'x', 'e', 'k'},
        };
        izpisi(krizanka, 0, 4);
        izpisi(krizanka, 3, 5);
        izpisi(krizanka, 1, 5);
        izpisi(krizanka, 4, 6);
        izpisi(krizanka, 2, 3);
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
