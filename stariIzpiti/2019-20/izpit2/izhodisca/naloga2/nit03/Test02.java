
public class Test02 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'l', '-', 'b', 'q', 'w', 'e', 'p', 'o', 'c', 'p', '-'},
            {'l', 'j', 'r', 't', 'e', 'h', 'i', 'e', 'r', 'c', 'e'},
            {'f', 'j', '-', 'p', 't', 'm', 'z', 'g', 'v', 'c', 'i'},
            {'q', 'l', 'x', 'w', '-', 'h', 'r', 'z', 'c', 'j', 'p'},
            {'t', 'a', 'p', 'g', 's', 'i', 'r', 'i', 'd', 'u', 'p'},
            {'j', 'e', 'q', 'p', 'z', 'a', 't', 'y', 'k', 'a', 'p'},
            {'n', 'y', 'b', 'k', 'w', 'q', '-', 'd', 'q', 'z', 'e'},
            {'e', 'h', 'h', 'l', 'm', '-', 'n', 'v', 'b', 'p', '-'},
            {'r', 'd', 'v', 'k', 'b', 'n', 'p', 'k', 'x', 'g', 's'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'u', 'f', 'g', 'w', 'b', 'h', 'r', 'g', 'n', '-', 'w'},
            {'u', 's', 'x', 't', '-', 'z', 'k', 'q', 'a', 'o', '-'},
            {'z', 't', 'a', 'f', 'x', 'w', 'l', 'c', 'h', 't', 'n'},
            {'o', 'v', 'n', 'n', 'e', 'w', 'c', 'r', 'h', 'l', 'p'},
            {'c', 's', 'p', 'd', 'o', 'w', 'q', 's', '-', 't', 'q'},
            {'-', '-', 'h', 'y', 'z', 't', 'v', 'l', '-', 'f', 'p'},
            {'q', 'b', 'y', 'j', 'q', 'e', '-', 'y', 'e', 't', 'd'},
            {'v', 'm', '-', 'w', 'w', 'j', 'k', 'k', 't', 'v', 'm'},
            {'u', 'j', 'k', 'b', 'c', 'z', 'q', 'd', 'o', 'b', 'k'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'y', 's', 's', 'i', 'a', 'g', 'i', '-', 'x', 'b', '-'},
            {'e', 'j', '-', 'g', 'a', 'e', 'd', 'd', 'z', 'c', 'b'},
            {'a', 'q', 'z', 'u', 'x', 'm', 'm', '-', 'z', 'g', 'c'},
            {'n', 'q', 'o', 'h', 'j', 'z', 'e', 'v', 'q', 'g', 'l'},
            {'v', '-', 'u', 'p', 'k', 'd', 'y', 'm', 'c', 'f', 'n'},
            {'y', 'l', '-', 'g', 'x', 'o', 'f', 'p', 'h', 'p', 'v'},
            {'h', 'y', 's', 'v', 'q', 'd', 'l', 'r', 'm', 'v', 'q'},
            {'p', 's', 's', 'u', 'x', 'w', 'h', 'a', 's', 'b', 'y'},
            {'m', 'c', 'n', 'x', 'g', 'a', 's', 'y', 'a', 't', 'd'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'k', 'k', 'h', 'x', 'f', 'g', 'z', 'e', 'p', 'f', 'a'},
            {'j', 'g', 'q', 'e', 'y', 'x', 'm', 'g', 's', 'v', 'd'},
            {'s', 's', 'p', 'b', 'i', 'n', 'm', 'j', 'u', 'o', 's'},
            {'u', 'e', '-', 'u', 'z', 'y', 'x', 'v', 'h', '-', 'r'},
            {'c', 'p', 'j', 's', 't', 'a', 'j', 'u', 'u', 'n', '-'},
            {'m', 'y', 'x', 'x', 'l', 'k', 'z', 'p', 'f', 'h', 'q'},
            {'-', 't', 'i', 'i', 'u', 'a', 'x', 's', 'z', 'q', 'p'},
            {'k', 'f', 'b', 'q', 'n', 'r', 'y', 'g', 'c', 'o', 'k'},
            {'c', 'd', 'a', 'c', 'n', 'f', 'l', 'q', 'e', 'a', 'j'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'d', 'g', 'm', 'o', 'b', 'g', 'w', 'j', 'k', 'j', 's'},
            {'m', 'q', 'x', 'n', 'z', 'f', 'j', 'i', 'q', 'j', 'r'},
            {'l', 'g', 'f', 'u', 'f', 's', 'r', 't', 'y', 'e', 'q'},
            {'g', 'z', 'y', 'u', 'j', 'j', 'h', 'n', 'c', 'n', 'u'},
            {'x', 't', 'm', 'y', 'f', 'w', 'e', 's', 'z', 'm', 'r'},
            {'q', 'a', 'n', 'a', 'n', 'u', 'f', 'q', 'b', 'o', 'p'},
            {'e', 'r', 'n', 'w', 'o', 'v', 't', 'y', 'e', 'w', 'd'},
            {'w', 'g', 'd', 'm', 'u', 'h', 'w', 'w', 'i', 'r', 'v'},
            {'f', 'p', 'v', 'v', 'q', 'x', 'n', 'b', 't', 'e', 'd'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
