
import java.util.Arrays;

public class Test45 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'-', 'a', 'n', 'v', 'a', 'g', 'h', 'm', 'm', '-', 'j', 'i', 't', 'l', 'd', 'y', 'd', 'p'},
            {'-', 's', 'h', 'b', '-', '-', '-', 'd', 'b', 'u', 'q', 'z', 'v', 'd', 'k', 'k', 'm', 'p'},
            {'r', 'o', 'a', 'e', 'l', 'e', '-', 'j', '-', 'b', 'd', '-', 'p', 'z', 'i', 'h', '-', 'n'},
            {'u', 'l', 'q', '-', 'n', 'o', 'u', 'o', 'i', '-', 'w', 'p', '-', 'd', '-', '-', 's', 'l'},
            {'h', 'b', 'n', 'b', 'z', '-', 'q', 'u', 'g', 'd', 'l', 'f', 'x', 'v', 'a', 'n', 'q', 'z'},
            {'v', 'n', 'j', 'b', 'q', 'f', 'q', '-', 'o', 'f', 'g', 's', 'w', 'n', 'q', 'i', 's', 'j'},
            {'h', '-', 'k', 'i', 'b', 'x', 'a', 'l', 't', 'd', 'd', 'v', 's', 'e', 'l', 'u', 'w', '-'},
            {'e', 'k', 's', 'o', 'r', 'y', 'b', 't', 's', 'z', 'i', 'r', 'f', 'u', 'j', 'g', 'w', 'y'},
            {'u', 'q', 'f', 's', 'j', 'a', 'e', 'i', 'g', 'r', 'y', '-', 'n', 'a', 'i', 'j', 'o', 'b'},
            {'h', 'k', 'w', 'n', 'k', '-', '-', 'q', 'u', 'f', 'q', 'p', 'c', 's', 'b', 'e', 'w', 'e'},
            {'f', 'b', 'l', '-', 'm', 'j', 'y', 'g', '-', 'c', 'n', 't', 't', 'h', '-', 'y', '-', '-'},
            {'g', 'y', 'c', 'x', 'r', 'b', 'e', 'y', 'm', 'z', 'o', 'p', 'a', '-', 'w', 'i', 'x', 'b'},
        };
        izpisi(krizanka, 2, 2);
        izpisi(krizanka, 17, 3);
        izpisi(krizanka, 4, 3);
        izpisi(krizanka, 11, 3);
        izpisi(krizanka, 14, 4);
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
