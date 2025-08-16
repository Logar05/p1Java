
import java.util.Arrays;

public class Test09 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'-', 'x', 'k', 'h', 'b', '-'},
            {'f', 'g', '-', 'b', 'z', 'k'},
            {'m', '-', 'p', 'i', 'h', 'i'},
            {'-', '-', '-', '-', 'o', '-'},
            {'o', 'u', 'h', 'p', '-', 'y'},
            {'u', '-', '-', '-', 'l', 'n'},
            {'a', '-', 'c', 'p', 'x', 'h'},
            {'-', '-', 'w', 'k', 'v', 'd'},
            {'b', 'u', 'k', 'w', 'n', '-'},
            {'h', '-', 'x', 'h', 'u', 'j'},
            {'-', 'q', '-', 'o', 'n', 'b'},
            {'q', 'e', 'j', 'm', '-', '-'},
            {'p', 'g', 'z', '-', 'm', 'l'},
            {'y', 'h', '-', 'z', 'x', '-'},
            {'f', '-', 't', 'u', '-', 'r'},
            {'d', '-', 'v', 'b', 'e', 'g'},
            {'-', '-', 'c', 'r', '-', 'h'},
            {'-', 's', '-', '-', 'd', '-'},
            {'j', 'a', 'v', 'm', 's', '-'},
            {'v', '-', '-', 's', 'p', '-'},
            {'f', 'm', 'u', 'q', 'a', 'y'},
            {'z', 'd', 'g', '-', 'w', 'v'},
            {'-', '-', 'q', 'a', 'b', 'r'},
            {'-', 'm', '-', 'c', 'u', 'g'},
            {'l', 'q', 's', 'x', '-', 't'},
            {'y', 'b', '-', '-', 'x', 'o'},
            {'u', 'u', 'e', 'b', 'b', 'l'},
            {'c', 'p', 'g', 'f', '-', 'i'},
            {'w', 'f', 'y', 'w', 'u', '-'},
            {'-', '-', '-', 'i', 'k', 'e'},
            {'e', 'b', '-', '-', '-', 'n'},
            {'i', 'b', 'd', '-', '-', 'v'},
            {'f', 'y', 'y', 'i', '-', 'b'},
            {'i', 'x', 'l', 'i', 's', 'v'},
        };
        izpisi(krizanka, 2, 13);
        izpisi(krizanka, 3, 4);
        izpisi(krizanka, 0, 3);
        izpisi(krizanka, 4, 10);
        izpisi(krizanka, 5, 6);
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
