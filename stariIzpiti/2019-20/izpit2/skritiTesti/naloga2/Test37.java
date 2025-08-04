
import java.util.Arrays;

public class Test37 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'v', '-', 'q', 'd', 'e', '-', 'i', '-', '-', 'd', 'q', 'd', '-', 'd', 'm'},
            {'t', 't', 'x', 'n', '-', 'm', 'k', 'm', 'q', '-', 'a', 'p', 'w', 'w', 'z'},
            {'-', 't', 'o', 'a', '-', '-', 'u', '-', 'k', 'n', 'w', '-', 'x', 'l', '-'},
            {'y', 'e', '-', 'm', 's', 'z', '-', '-', 'd', '-', 'c', 'y', 'i', 'z', 'v'},
            {'-', 'i', 'j', 'p', '-', 'h', 'g', '-', 'e', 'p', '-', 'q', '-', 'j', 'x'},
            {'i', 'o', 'a', '-', '-', 'm', 'l', '-', 'n', '-', '-', 'h', 'h', '-', '-'},
            {'-', 'l', 'o', 'f', 't', '-', 'k', 'j', 's', 'o', 'i', 'o', 't', 'q', 'p'},
            {'f', '-', 'p', '-', '-', 'a', '-', 'w', 'e', '-', 'd', 'n', 'c', 'z', 'w'},
            {'-', 'e', '-', '-', 'l', 'p', 's', 'u', 'w', 'l', '-', 't', 'v', '-', 'm'},
            {'i', 'k', 'y', 'd', 'y', '-', 'n', '-', 't', 'q', 'p', 'h', 'i', 'j', '-'},
            {'-', 'f', 's', 'h', 'y', '-', 'f', 'm', 't', 'p', 'p', 'c', 'a', 'y', 'l'},
            {'p', 'q', 'n', 't', 'u', '-', 'u', 't', 'y', 'i', 'a', 'o', 'e', 'i', 'j'},
            {'x', 'h', 'b', 'j', '-', 't', '-', 'y', 'o', 'w', 'j', 'd', 'o', 'l', 'k'},
            {'q', 'p', '-', 'i', 'b', 'o', 'l', 'g', 'o', 'u', 'x', '-', 'n', 'v', 'b'},
            {'k', 'r', '-', 'n', 'd', 'z', 'y', 'e', 'o', '-', 's', 'x', '-', 'b', '-'},
            {'-', 'j', 't', '-', 'm', '-', '-', 'u', 'h', 'r', 'd', '-', 'i', '-', 'l'},
            {'n', '-', 'v', '-', 'd', 'z', 'i', 'd', '-', 's', 'j', 'i', '-', 'z', '-'},
            {'-', 'g', 'o', 'n', '-', '-', 'g', '-', 'q', 'k', 'z', '-', '-', 'l', '-'},
            {'-', 'a', 'w', '-', '-', 'v', 'o', 'g', '-', 's', 'z', '-', '-', '-', '-'},
        };
        izpisi(krizanka, 1, 2);
        izpisi(krizanka, 4, 10);
        izpisi(krizanka, 3, 2);
        izpisi(krizanka, 11, 5);
        izpisi(krizanka, 7, 9);
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
