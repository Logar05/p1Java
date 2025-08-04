
import java.util.Arrays;

public class Test48 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'q', '-', 'c', 'q', 'e', 'd', 'i', 'b', 'n', 'z', 'x', '-', 's', '-', 'm', 'u', 'c', 'a', '-', 'b'},
            {'u', 'i', '-', 'r', 'p', '-', 'w', 'f', '-', 'z', 'u', 'a', 'k', 'v', '-', '-', 'd', 'k', 'k', 'v'},
            {'a', 'x', 'g', 'w', 'u', 'w', 'k', 'u', 'e', '-', '-', 'u', 's', 'c', '-', 'z', 'p', '-', 'k', 'u'},
            {'k', 'h', 'b', 'o', 'k', 'd', 's', 'h', 'm', 'a', 'e', '-', 'r', 'e', 'u', 'o', 'h', 'b', 'b', 'i'},
            {'t', '-', 'n', '-', 't', 'x', 'd', 'e', '-', 't', 'z', 's', 'f', 'q', 'k', 'i', 'm', '-', 'm', 'c'},
            {'d', 'g', 'q', 'i', 'v', 'g', 'v', 'x', 'n', 'p', 'h', 'l', 't', 'l', 'w', '-', 'w', 'v', '-', 'm'},
            {'t', 's', 'y', 'l', 'x', 'v', 'p', 'v', 'a', 'a', 'g', 'w', 'g', 'f', 'f', 'r', 'k', 'k', 'z', 'c'},
            {'s', 'j', 's', 'k', 'e', 't', 'k', 'y', 's', 's', 'o', 'v', 'd', 'q', 'w', 's', '-', '-', 'e', 'n'},
            {'l', '-', 'h', 'x', 'h', 'o', 'j', 'u', 'y', 'u', 'w', 'e', 'p', 'l', 'm', 'w', 'a', 'k', '-', 'v'},
            {'f', 'v', 'j', 'h', 'q', 'e', 'p', '-', 'e', '-', 'c', 's', 'w', 'q', 'd', 'b', 'n', 'e', 'w', '-'},
            {'g', 'y', 'c', 'g', '-', 'w', '-', 'n', 'g', 'j', 'r', 'c', '-', 'j', '-', 'x', 'a', 'h', 'v', 'r'},
        };
        izpisi(krizanka, 15, 4);
        izpisi(krizanka, 14, 3);
        izpisi(krizanka, 18, 2);
        izpisi(krizanka, 5, 3);
        izpisi(krizanka, 12, 3);
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
