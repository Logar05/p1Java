
import java.util.Arrays;

public class Test39 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'l', 'a', 'c', 'p', '-', 'l', 'l'},
            {'e', 'r', '-', 'm', 'e', 's', 'n'},
            {'j', 'k', 'z', '-', 'd', 'g', 'l'},
            {'r', 'u', 'v', 'z', 'p', 'v', 'h'},
            {'g', 'q', 'j', 'f', 'p', '-', 'i'},
            {'b', 'm', 'b', 'u', '-', '-', 'o'},
            {'-', '-', '-', '-', 'w', 's', '-'},
            {'z', 'c', 'm', 'm', 't', 'q', 'c'},
            {'i', 'q', '-', 'i', 'c', 't', '-'},
            {'u', 'r', 'm', 'w', 'k', 'k', '-'},
            {'-', '-', 'y', '-', 'a', '-', '-'},
            {'d', 'p', 'y', '-', 'f', 'j', '-'},
            {'-', 't', '-', 'j', 'w', 'e', '-'},
            {'-', 'm', 'b', 'r', '-', 's', '-'},
            {'w', '-', 'w', '-', 'w', 'i', 'd'},
            {'y', 'u', 'v', 'q', 'u', 'g', 'a'},
            {'t', '-', 'u', 'd', 'c', 'l', 'g'},
            {'y', 'x', 'p', '-', 'o', '-', '-'},
            {'e', '-', 'c', '-', 'j', '-', 'h'},
            {'q', 'v', '-', 'p', 't', 'c', 'j'},
            {'g', '-', '-', 'm', 'u', 'v', 'l'},
            {'v', 'd', 'z', '-', 'r', '-', 'w'},
            {'f', 'g', '-', '-', 'r', '-', 'b'},
            {'p', 'k', '-', '-', 'o', 't', 'm'},
            {'h', 'v', '-', 'v', 'x', 'i', 'l'},
            {'c', '-', 'x', '-', 'l', 't', 'm'},
            {'e', 'c', 'd', 'r', 'v', 'h', 'a'},
            {'f', 'm', 'f', '-', 'v', '-', 'l'},
            {'c', 'n', 'k', 'q', '-', 'l', '-'},
            {'-', '-', 'x', '-', 'r', 'o', 'g'},
            {'b', 'k', 'f', 'l', '-', 'y', 'k'},
            {'i', 'a', 'h', '-', 'm', 'n', '-'},
            {'z', 's', 'k', '-', '-', 'p', '-'},
        };
        izpisi(krizanka, 0, 6);
        izpisi(krizanka, 1, 10);
        izpisi(krizanka, 2, 7);
        izpisi(krizanka, 6, 8);
        izpisi(krizanka, 3, 14);
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
