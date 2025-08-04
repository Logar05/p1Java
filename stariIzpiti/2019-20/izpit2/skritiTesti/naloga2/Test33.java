
import java.util.Arrays;

public class Test33 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'r', 'z', 'q', 't', 'v'},
            {'-', 'q', 'k', 'e', 'u'},
            {'q', 'd', 'p', 'z', 'o'},
            {'b', 'z', 'v', 't', 'u'},
            {'-', '-', '-', 'q', 'z'},
            {'r', 'o', 'c', 'l', 'r'},
            {'v', 'z', 't', 'w', 'i'},
            {'m', 'x', '-', '-', 'o'},
            {'-', 'q', 'k', 'h', 'y'},
            {'t', 'e', 'b', 'c', 'u'},
            {'f', 'z', 'x', 'g', '-'},
            {'i', 'm', '-', 'k', 'l'},
            {'f', 'g', 'm', 'r', 'i'},
            {'r', 'o', 'f', 't', '-'},
        };
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 0, 1);
        izpisi(krizanka, 4, 1);
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
