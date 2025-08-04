
import java.util.Arrays;

public class Test30 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'q', 'b', 'j', 'q', 'o', 'r', '-', 'h', 'q', 'i', 'a', 'm'},
            {'r', 'b', 'z', '-', 'j', '-', '-', 'h', 'y', 't', 'm', 'u'},
            {'i', 'f', '-', 'w', 'v', 'e', 'a', 'n', 'p', 'x', 'b', 't'},
            {'y', 'i', 'j', '-', 'j', 'j', 'e', 'j', 'z', '-', 'x', 'n'},
            {'b', 'o', 'w', 'u', 'd', 'j', 'h', 'x', 'p', 'o', 'l', 'f'},
            {'r', 'i', 'w', 's', 'v', 'd', 'p', 't', 's', 'v', 't', 'y'},
        };
        izpisi(krizanka, 1, 1);
        izpisi(krizanka, 10, 1);
        izpisi(krizanka, 8, 1);
        izpisi(krizanka, 6, 1);
        izpisi(krizanka, 11, 1);
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
