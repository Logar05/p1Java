
import java.util.Arrays;

public class Test29 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'x', 'u', 'j', 'v', 'j', 'q', 'a', 'r', 'q', 't', 'm', 'w', 'j', 'j', 'w', '-', 'l', '-'},
            {'w', 's', '-', 'l', 'g', 'k', 'z', 'i', 'm', 'a', 'o', 'w', 'i', 'b', 'i', 's', 'c', 'x'},
            {'e', 'd', 'c', 'i', 'q', 'c', '-', 'a', 'j', 'z', 'g', '-', 'p', 'r', 'l', '-', 'f', '-'},
            {'n', 'v', '-', '-', 'r', 'l', 'y', 'v', 'r', 'z', 'l', '-', '-', 'g', '-', '-', 'v', 'i'},
            {'w', 't', 'e', 'k', 'k', 'w', 'l', '-', 'q', 'c', 'h', 'f', 's', 'f', 'f', 'g', 'h', 'h'},
            {'r', 'a', 'i', 'u', 'u', 'o', 'z', 'e', 'h', 'y', 'e', 'e', 'h', 'k', 'l', 's', 'a', 'f'},
            {'k', '-', 'e', 'a', '-', '-', 'r', 'p', 'p', 'e', 'r', 'k', 'm', 'v', 'k', 'g', 'p', 'h'},
            {'-', 's', 'u', 'x', 'm', 'n', 'r', 'i', 'o', 'y', 'k', 'j', 'v', 't', 'b', 's', '-', '-'},
            {'-', 'i', '-', 'm', '-', 'h', 'c', 'j', 'l', 'f', '-', 'q', 'g', '-', 'j', 'z', '-', 's'},
            {'n', 'm', '-', 't', 'o', 'k', 'c', 'g', '-', 'n', 'i', 'u', 'l', 'j', 'u', 'z', 'x', 'n'},
            {'q', 'r', 'o', 'x', 'o', 'p', 'd', '-', '-', 'h', 'j', 'q', '-', '-', '-', 'i', 'w', '-'},
            {'o', 'l', 'm', 'q', 'c', '-', 'j', 'r', 'q', 'r', 'w', 'h', '-', '-', 'b', 'q', 'n', '-'},
            {'n', 'v', 'k', 's', 'z', 'u', 'w', 'w', 's', 'f', '-', 'k', 'd', 'm', 'x', 'd', 'h', 'l'},
            {'e', 'n', 's', '-', 'u', 'e', 'w', '-', 'm', 'b', 'p', 'o', '-', 'h', '-', 'a', 'l', '-'},
            {'b', 'x', 'x', 'e', 'f', 'd', 'y', 'g', '-', 'b', 'o', 'k', 'n', 'u', 'b', 'z', 'z', 'j'},
            {'y', 'w', 'r', 'b', 'r', 'u', 'b', 'u', 'c', 'r', 'v', 'g', 'p', 's', 'p', 'q', 'g', '-'},
            {'-', 'n', '-', 'o', 'a', 'z', 'x', 'z', 'w', 'k', '-', '-', 'm', 'z', 's', 'u', 'b', 'b'},
            {'y', 'a', 'u', 'r', 'b', 'z', '-', 'c', 'x', '-', 'h', 'n', 'g', 'v', 'z', '-', 'o', 'v'},
            {'o', 'g', 'w', '-', '-', 'm', 'u', 'n', 'o', 'l', 'w', 's', 't', 'g', '-', 'a', 'o', 'g'},
            {'k', 's', '-', 'v', 't', 'w', 'j', 'f', 'h', 'p', '-', 'r', 'c', 'n', 'a', 'o', 'f', '-'},
            {'-', 'c', 'i', 'm', 'n', 'b', '-', 'z', 'w', 'n', 'o', 'u', 'u', 'u', '-', 'g', 'x', '-'},
            {'-', 'c', 'q', 'a', 'q', 's', 'r', 'z', '-', '-', 'h', 't', 'a', 'i', 'i', 'l', 'k', 't'},
        };
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 9, 1);
        izpisi(krizanka, 6, 1);
        izpisi(krizanka, 12, 1);
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
