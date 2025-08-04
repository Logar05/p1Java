
import java.util.Arrays;

public class Test36 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'x', '-', '-', '-', 'z'},
            {'v', 'l', 'v', '-', 'n'},
            {'x', 'h', 'x', '-', 'b'},
            {'e', 'f', 'z', 'a', 'l'},
            {'t', '-', 'x', 'g', '-'},
            {'u', '-', 'p', 'e', '-'},
            {'t', 'x', '-', 's', 'o'},
            {'b', 'u', '-', 'w', '-'},
            {'j', 'd', 'b', 'g', 'w'},
            {'r', '-', 'z', '-', 'x'},
            {'v', 'e', 'p', 'l', '-'},
            {'k', 'i', '-', 't', 'f'},
        };
        izpisi(krizanka, 0, 2);
        izpisi(krizanka, 1, 5);
        izpisi(krizanka, 2, 2);
        izpisi(krizanka, 4, 3);
        izpisi(krizanka, 3, 5);
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
