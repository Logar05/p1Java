
import java.util.Arrays;

public class Test35 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'b', 'o', '-', '-', 'j', 'a', 'g', '-', 'b', 'n', 'i'},
            {'q', 'j', 'u', 'c', 'c', 'i', '-', 'p', '-', 'b', 'r'},
            {'d', 'c', 'j', '-', 'a', 'c', 'j', 'o', 'w', 'x', 'y'},
            {'z', 'l', 'd', '-', 'd', 'k', '-', 'q', 'g', 'w', 't'},
            {'h', 's', '-', '-', 'd', 'm', 'l', '-', 'r', 'e', 'p'},
            {'h', 'k', 'q', '-', 'm', '-', 'n', 'w', 'r', 'i', '-'},
            {'o', 'd', 'b', 'j', 's', 'm', 'k', '-', 'r', 'e', 'y'},
            {'r', 'c', 'j', 'z', 'p', '-', 'r', 'w', 'v', 'd', 'q'},
            {'a', '-', 'm', 'e', 'h', 'z', 'c', 'u', '-', 'v', 's'},
            {'y', 'z', 't', 'n', 'j', 'f', 'u', 'v', 'l', 'a', 'f'},
            {'a', 'w', 'u', '-', 't', 'x', '-', 'f', 'o', '-', 'l'},
            {'b', 'b', 's', 'o', 't', 'r', 'r', 'b', 'q', 'k', 'j'},
            {'w', 'c', 'd', 'q', 'h', '-', 'x', 'y', 'o', 'r', 'i'},
            {'i', '-', '-', 'n', 'a', 'a', 'q', '-', 's', 'z', 'z'},
            {'-', 'p', 'z', 'j', '-', 'l', '-', 'k', 'd', 'i', 'e'},
            {'e', 'o', 'u', 'p', 'd', 's', 'f', 'c', 'z', 'z', 'c'},
            {'j', 'f', 'f', 'b', 's', 'v', 'm', 'o', 'q', 'x', '-'},
            {'u', 'p', 'i', 'j', 'x', 'm', 'k', 'e', 'k', 'x', 'r'},
            {'q', 'n', 'p', 's', 't', 'a', 'f', 'u', '-', '-', 'c'},
            {'n', 'k', 'i', 'f', 'c', 'o', 'd', 'c', 'r', 'g', '-'},
        };
        izpisi(krizanka, 3, 1);
        izpisi(krizanka, 4, 1);
        izpisi(krizanka, 9, 1);
        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 10, 1);
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
