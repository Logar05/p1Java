
import java.util.Arrays;

public class Test42 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'d', 'i', '-', 'r', '-', 'u', '-', 'o', '-', 'd', 'q', 'm'},
            {'a', 'f', 'j', 'v', 'v', 'f', 'm', 'o', 'p', '-', 't', 'i'},
            {'e', 'm', 'e', 'w', 'c', 'c', '-', 'o', 'u', 'h', 'e', 'q'},
            {'y', 'q', 'w', 'l', 'f', '-', 'z', '-', 'x', '-', 'n', 'c'},
            {'s', 'w', 'v', 'j', 'm', 'c', 'd', '-', 'r', 'p', '-', '-'},
            {'-', 'h', 'o', 'x', 't', '-', 'm', 'j', '-', '-', 'p', 'p'},
            {'u', 'g', 't', 'o', 'e', 'z', '-', '-', 'k', '-', 'm', '-'},
            {'q', 'v', 'u', 'b', 'x', 'f', 'e', '-', 'n', 'x', 'n', '-'},
            {'l', '-', 'u', '-', 'o', 'o', 'n', '-', '-', 'h', '-', 'q'},
            {'n', 'z', 'v', '-', 'j', 'e', 'z', 'r', 'i', 'i', 'r', 'r'},
            {'b', 'z', 'm', 'm', 'w', 'i', 'z', 'b', 'r', 'h', 's', '-'},
            {'e', '-', 'v', 'm', 'u', '-', 'g', 'g', 'z', 'k', 'y', 'w'},
            {'j', '-', 'm', '-', 'e', 'e', '-', 'z', '-', 'x', '-', 'f'},
            {'d', 'k', 'p', 'g', 'l', 'z', 'g', 'g', 'g', 'k', 'd', 'v'},
            {'r', '-', 'x', 'p', 'r', 'j', 't', 'i', 'i', '-', 'w', 't'},
            {'h', 'a', '-', 'b', 'g', 'h', 'r', 'u', 'm', 'k', 'x', 'c'},
            {'u', '-', 'p', 'g', 'z', 'h', '-', '-', 's', 'x', 'c', 'x'},
            {'o', 'o', 'e', 'l', '-', 'u', 'w', 'e', 'j', '-', '-', 'z'},
            {'h', 'i', 'm', 'u', '-', 'r', '-', 'e', 'z', 'k', 'm', 'b'},
            {'-', 'p', 'r', 'i', 'g', 's', 'c', 'q', 'l', 't', 'i', '-'},
            {'t', 'd', 'b', 'u', 'h', 'b', 'd', '-', 'w', 'w', '-', 'q'},
            {'h', 'l', 'd', 'l', 'a', 'w', 'y', 't', 'r', 'k', '-', 'l'},
            {'e', 'y', 'm', 'c', 'z', 'r', 'y', 'n', 'f', 'f', '-', 't'},
            {'w', 'm', 's', 'm', 'u', '-', 'q', 'q', 'n', 'h', 'w', 's'},
            {'m', '-', 'p', 'a', '-', 'h', 'f', 'f', 'a', 'z', 'i', 'k'},
            {'o', 'u', '-', 'v', 'i', '-', 'y', 'c', '-', 'p', 'm', 'q'},
            {'q', '-', '-', '-', 'z', 'v', 'h', 'r', 'q', 'n', 'p', '-'},
            {'e', '-', '-', 'y', 'l', 'b', '-', '-', '-', 'r', 'a', '-'},
            {'r', 'e', '-', 'x', 'i', 'a', 'l', 'v', 'y', 'u', '-', 'w'},
            {'-', 't', 'i', 't', 'f', 'n', 'x', 'h', 'w', '-', 'w', 'l'},
        };
        izpisi(krizanka, 3, 2);
        izpisi(krizanka, 0, 2);
        izpisi(krizanka, 9, 2);
        izpisi(krizanka, 6, 2);
        izpisi(krizanka, 11, 6);
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
