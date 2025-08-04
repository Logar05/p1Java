
import java.util.Arrays;

public class Test46 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'-', 'p', '-', '-', '-', 't', '-', 'b', 'h', 'y', 'w', 'j', 'g', 'j', 'f', '-', 'f'},
            {'a', 'u', '-', 'j', 'o', 't', 'j', 'n', '-', 'g', '-', 'x', 'j', 'd', 's', 'b', '-'},
            {'e', 'r', 'f', 'e', 'j', 'm', 'h', 'o', 'b', 'n', 'p', 's', 'j', '-', 'n', '-', 'n'},
            {'-', 'w', 'm', 'c', 's', '-', 'e', 'o', 'f', 'h', 'o', '-', 'b', 'u', 'x', '-', 't'},
            {'b', '-', 'a', 'w', '-', 's', 'o', 'i', 'f', 'r', 'p', 'c', 'q', 'p', 'n', 'o', 'l'},
            {'i', 'g', 'q', 'm', 'p', '-', '-', 'd', 'w', 'r', 'f', 'p', '-', 'h', 'p', 'm', 'j'},
            {'-', 'c', 'z', '-', '-', 'q', 'l', 'd', 'e', '-', 'i', '-', '-', 's', 'i', 'r', 'y'},
            {'o', '-', 'j', 'q', 'z', 'h', '-', '-', 't', 'g', 'k', 'w', 'c', 'j', 'i', 'x', 'c'},
            {'r', 'r', 'q', 'y', 'u', 'p', 'j', 'b', 'm', 'h', 'k', 'y', '-', '-', 'b', 'e', 't'},
            {'m', 'o', 'r', 'm', '-', 'q', '-', 'o', 'k', 'a', 'c', 'k', 'f', 'v', 'c', '-', '-'},
            {'f', 'i', 'u', 'y', 'l', '-', '-', '-', 'p', 'h', 'g', '-', 'x', '-', 'g', 'r', 'u'},
            {'v', '-', 'c', 'v', 'z', '-', 'p', 'e', '-', 'y', 'w', 'v', 'k', '-', 'm', 'i', 'r'},
            {'k', '-', 'g', '-', 'n', 'm', '-', '-', 'o', 'x', 'r', 's', 'w', 'i', 's', '-', 'z'},
            {'h', 'j', '-', 'j', '-', 'k', 'o', 'j', 'a', 'g', 'x', 'v', 'o', '-', 'x', 'p', 'v'},
            {'-', 'f', 'p', '-', 'l', 'l', 'e', 'a', 'a', 'm', '-', 'b', 'f', 'f', 'g', 'x', 'y'},
            {'q', 'w', '-', 'd', 'm', 'd', 'i', 'o', 'n', 'n', 'o', 'q', 'f', 'v', 'b', 'o', 'g'},
            {'s', 'z', 'k', 'l', 'i', '-', '-', 's', 'j', 'w', 'y', '-', '-', 's', 'y', '-', 'u'},
            {'b', '-', 'o', 'f', 'i', '-', 'd', 's', '-', 'j', 'a', 'e', 'y', '-', 'c', 'h', 'f'},
            {'t', 'r', '-', 'r', '-', 'b', 'k', 'z', '-', '-', 'n', 'q', 'e', '-', 'n', 'p', '-'},
        };
        izpisi(krizanka, 11, 3);
        izpisi(krizanka, 16, 2);
        izpisi(krizanka, 5, 2);
        izpisi(krizanka, 7, 5);
        izpisi(krizanka, 0, 2);
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
