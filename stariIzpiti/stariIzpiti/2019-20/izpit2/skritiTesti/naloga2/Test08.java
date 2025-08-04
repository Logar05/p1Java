
public class Test08 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'z', 'l', 'p', 'y', 'o'},
            {'m', 'f', 'g', 'f', 'h'},
            {'y', 'l', 'n', 'y', 'a'},
            {'c', 'k', 'a', 's', 's'},
            {'t', 'v', 'y', 'a', 'b'},
            {'t', 'x', 'g', 'h', 'w'},
            {'s', 'e', 'j', 'p', 'l'},
            {'b', 'g', 'z', 'd', 'k'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'f', '-', 'z', 'p', 'i'},
            {'i', 'd', '-', 'f', 'j'},
            {'x', 'b', 'k', 'k', 'g'},
            {'f', '-', '-', 'a', 'l'},
            {'a', 'o', 'w', 'q', 'l'},
            {'r', '-', 'n', 'z', 'a'},
            {'c', 'l', 'b', 's', 'j'},
            {'z', 'g', 'a', 'i', 'd'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'z', 'k', 'a', 'c', 'x'},
            {'m', 't', 'e', '-', 'b'},
            {'d', 'z', 'j', 'i', 'g'},
            {'e', 'h', 'a', '-', 'r'},
            {'p', 'c', '-', 'o', '-'},
            {'q', 'r', 's', 'h', 'z'},
            {'w', 'j', 'l', 'm', 'y'},
            {'o', 'l', 'a', 'm', 'z'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'y', '-', 'e', 'x', 'z'},
            {'v', 'u', 'k', 'k', 'u'},
            {'w', '-', 'e', 'd', 'p'},
            {'-', 'x', 'q', 'r', 's'},
            {'y', 'c', 'b', 'i', 'e'},
            {'x', 'b', 'k', 'n', 'o'},
            {'g', 's', 'e', 'o', 'v'},
            {'v', 'c', 'q', 'b', 'u'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'d', 'm', '-', 'f', '-'},
            {'-', 'y', 'l', 'b', 'w'},
            {'u', 't', 'i', 'r', 'a'},
            {'d', 'g', 'a', 't', 'e'},
            {'b', 'r', 'g', 'y', 'c'},
            {'m', 'x', 'f', 'o', 'o'},
            {'a', 'j', 'k', 'w', 'j'},
            {'k', 'v', 'j', 'o', 'u'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
