
import java.util.Arrays;

public class Test28 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'g', 'x', '-', '-', 'h', 'l', 'h', 'k'},
            {'t', 'r', '-', 'y', 'b', '-', 'n', 'u'},
            {'m', 'w', 'r', 'h', 'c', 's', 'r', 'g'},
            {'b', 'j', 'x', '-', 'e', 'k', 'y', 'o'},
            {'m', '-', 'f', 'e', 'h', 'n', '-', 'w'},
            {'i', 'd', 'k', 'l', 'm', 'i', 'j', 'n'},
            {'d', 'p', 't', 'q', 'a', 'w', 'e', 'e'},
            {'d', 'o', 'x', 'b', 'j', 'a', 'a', 'e'},
            {'l', 'j', 'n', 'o', 'o', 'k', 'd', 'c'},
            {'q', 'b', 'w', 's', 'v', 'd', 'c', 'g'},
            {'j', '-', 'l', 'y', 'i', 'b', 's', 't'},
            {'x', '-', 'u', 'o', '-', 'r', '-', 'q'},
            {'j', 'i', 'u', 'p', 'd', 'k', 'd', 'g'},
            {'j', 'x', 'b', 'y', 'b', 'l', 'c', 'q'},
            {'r', 'h', 'j', 'u', 'g', 'n', 'c', 'i'},
            {'-', 'k', 'y', '-', 'a', 'x', 'c', 'u'},
            {'z', 'o', 'b', 't', 'l', 'm', '-', '-'},
            {'j', 'f', 'f', 's', 'k', 'w', 'z', 'k'},
            {'k', 'w', 'd', 'a', 't', 'y', 'k', 'm'},
            {'e', 'u', 'n', 'e', 'z', 'n', 't', 'h'},
            {'z', 'j', 'x', 'k', 'm', '-', 'i', 'c'},
            {'q', 'q', '-', 'a', 'd', 'c', 'v', 'f'},
            {'a', '-', 'p', 't', 't', 'c', 'k', 'i'},
            {'j', 'u', '-', 'g', 'f', 'k', 'w', 'd'},
            {'a', '-', 'k', 'x', 'n', 'v', 'f', 'w'},
            {'-', 'e', 'o', '-', 'y', 'b', 'h', 'a'},
            {'w', 'b', 's', 'l', 'i', 'b', '-', 'e'},
            {'s', 'w', 'u', 'm', 'd', 'x', 'm', 'm'},
            {'k', 'm', 's', 'a', 'e', 'l', 'e', '-'},
            {'i', 'o', 'e', 'i', 'j', '-', 'i', '-'},
            {'b', 'h', '-', 'o', 'x', 's', 'a', '-'},
            {'-', 's', 'f', 'j', 'p', '-', 'c', 't'},
            {'s', 'a', 'w', '-', 'q', 'g', 'e', 'v'},
            {'v', 'o', 'g', 'k', 'w', 'q', 'q', 'h'},
            {'p', 'i', '-', 'h', 'j', 'h', 'k', 'v'},
            {'s', 'b', 'd', 'y', 'w', 'h', 'g', 'z'},
            {'s', '-', 't', 'b', 't', 'j', 'l', 'l'},
            {'z', 'r', 'l', 'k', 'r', 'a', '-', 'q'},
            {'e', 'i', 'i', 'd', 'c', 'c', 'v', 'd'},
            {'z', 'u', 'e', 'w', 'j', 'a', 'o', 'l'},
            {'v', 'e', 'j', 'y', 'g', 't', 'i', 't'},
            {'o', 'u', '-', 'v', 'v', 'x', 'b', 's'},
            {'a', 'm', 'y', 'g', 'j', '-', 'b', 'a'},
            {'e', 'i', 'x', 'j', 'w', '-', 'f', 'd'},
        };
        izpisi(krizanka, 7, 1);
        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 6, 1);
        izpisi(krizanka, 2, 1);
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
