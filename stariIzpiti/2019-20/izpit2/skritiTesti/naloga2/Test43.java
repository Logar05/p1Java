
import java.util.Arrays;

public class Test43 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'-', '-', 'y', 'x', '-', 'u', 's', '-', 'o', 'b', 'l', 'v', '-', '-', 'j', 'j', '-', '-'},
            {'-', 'p', 'z', '-', 'h', 'p', 'o', 'r', '-', '-', '-', '-', 'a', 'o', 'x', '-', '-', 'y'},
            {'y', 'f', 'd', '-', 'h', '-', 'q', 'a', 'f', '-', 'g', 'x', 'd', 'x', 'c', '-', 'l', 'n'},
            {'b', 'b', 'a', 'e', '-', 'a', 't', '-', '-', 'k', '-', '-', 'u', 't', 'd', 'n', 'h', '-'},
            {'g', 'y', 'w', 'x', 'w', 'i', '-', 'd', 'x', 'g', 'c', '-', '-', 'e', 't', 'q', '-', 'w'},
            {'i', '-', 'm', 'h', 'a', 'c', 'x', 'y', 'b', 'm', 'r', '-', '-', '-', 'f', '-', 'o', 'a'},
            {'-', 't', 'n', 's', 't', 'o', '-', 'b', 'a', 'h', 'e', '-', 'g', 'q', '-', '-', 'w', '-'},
            {'e', 'o', 'e', 'g', 'v', 'a', 'i', '-', 'a', 'h', '-', 'z', 'g', '-', 'f', 'k', 'g', 'u'},
            {'-', 'r', 'y', '-', 'n', 'u', 's', 'o', 'm', 'v', 'u', 'a', '-', '-', 'p', 'q', 'c', 'c'},
            {'-', 'd', 'm', 'o', 'r', 'b', 'j', 'q', 'm', 'w', 'k', 'k', 'v', 'n', 's', '-', 'f', 'w'},
            {'z', 'w', 'o', 'u', '-', 'l', 'z', 'g', 'v', 'n', 'j', 'u', 'u', 'b', '-', 'r', 'o', '-'},
            {'p', 'o', '-', 'u', 't', 'l', 'k', '-', '-', 'd', 'q', 'v', 'h', 'y', '-', '-', 'f', 'x'},
            {'k', '-', '-', '-', 'x', '-', 'l', 'z', 'h', 'a', '-', 'b', 'i', 'v', 'j', 's', 'c', 'f'},
            {'z', 'j', 'k', '-', 'm', 'l', '-', 'g', '-', 'w', 'g', 'a', '-', 's', '-', '-', '-', '-'},
            {'t', 'e', 'y', 'l', 'q', '-', 'f', '-', '-', 'i', '-', '-', '-', 'g', 'd', 't', 'm', 'v'},
            {'d', 'k', 'v', '-', '-', '-', '-', 'n', '-', 'b', 'o', '-', 'v', 'c', 'u', 'e', 'q', 'q'},
            {'t', 's', '-', 'q', 'h', 'e', 'l', 's', 'e', 'z', 'k', 'm', 'x', 'r', 'o', '-', '-', 'n'},
            {'p', 'p', '-', 'c', 'k', 't', 'j', 'q', 'l', 'm', 'l', 'u', 'l', '-', 'x', 'n', 'j', '-'},
            {'n', 't', 'e', 'f', 't', 'w', '-', 's', 'b', 'v', 'q', '-', 'b', 'n', 'u', 'j', 'a', '-'},
            {'i', 'u', 'i', 'x', 'q', 's', 'o', '-', '-', '-', 'q', '-', 'w', 'h', 'i', 'i', '-', 'j'},
        };
        izpisi(krizanka, 11, 9);
        izpisi(krizanka, 15, 9);
        izpisi(krizanka, 3, 7);
        izpisi(krizanka, 9, 5);
        izpisi(krizanka, 16, 5);
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
