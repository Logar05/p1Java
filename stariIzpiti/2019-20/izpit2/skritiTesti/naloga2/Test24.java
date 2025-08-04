
public class Test24 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'e', '-', 's', 'r', 'x', 'm', 'm', 'r'},
            {'x', 'r', 'i', '-', 'v', 'b', 'o', 'l'},
            {'m', 'q', 'g', 'd', '-', 'y', 'v', 't'},
            {'j', 'd', 'd', 'c', 'k', 'g', 'l', 'x'},
            {'o', 's', 'h', 'b', 'w', 'z', 'y', 'j'},
            {'x', 't', 'y', 'a', 'd', 'r', 'r', 'g'},
            {'x', 'd', 'p', 'x', 'c', 'o', 'v', 'z'},
            {'z', 'g', 'l', 'm', 'z', 's', 'u', 'h'},
            {'g', 'y', 'x', 'c', 'g', 'i', 'p', 'z'},
            {'e', 'g', 'u', 'a', 'a', 'e', 'v', 'v'},
            {'i', 'f', 'i', 'q', 's', 'b', 'c', 'o'},
            {'a', 's', 'h', 'j', 'c', 'm', 'x', 'r'},
            {'v', 's', 'b', 'w', 'g', 'c', 'i', 't'},
            {'a', 'a', 'w', 'o', 'o', 'z', 'q', 't'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'u', 's', '-', 'r', 'l', 'z', 'm', 'n'},
            {'u', 'q', 'a', 'u', 'y', 'z', '-', 'n'},
            {'e', 'b', '-', 'v', 'c', 'g', 'g', 'p'},
            {'-', 'i', 'f', 'b', 'g', '-', 'j', 'i'},
            {'s', 'm', 'n', 't', 'k', 'z', 'u', 'r'},
            {'f', 'u', 'g', 'n', 't', 'v', 'k', 'c'},
            {'l', 'o', 'm', 'd', 'm', 'r', 'r', 'n'},
            {'y', 'i', 'n', 'm', 'l', 'o', 'l', 'j'},
            {'k', 'd', 'p', 'd', 'h', 'o', 'o', 't'},
            {'t', 't', 'r', 'g', 'v', 'z', 'a', 'f'},
            {'n', 'x', 'f', 's', 'h', 'z', 'i', 'm'},
            {'r', 'c', 's', 'd', 'k', 't', 'u', 'r'},
            {'s', 'r', 'k', 'e', 'i', 'e', 'x', 'q'},
            {'l', 'h', 'l', 'a', 'e', 'g', 't', 'b'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'y', 'g', '-', 'x', 'z', 'h', 'x', 'k'},
            {'k', 'u', 'd', 's', 'k', 'f', 'u', 'h'},
            {'f', 'o', '-', 'v', 'm', '-', 'a', 'r'},
            {'x', 'v', 'g', 'k', 'q', 'b', 'p', '-'},
            {'s', 'x', 'z', 'v', 'r', 'y', 'q', 'y'},
            {'k', 'y', 'g', 't', 'c', '-', 'f', 'r'},
            {'d', 'k', 'c', '-', 'w', 'e', 'z', 'g'},
            {'z', 'd', 'x', 'e', 'd', '-', 'x', 'n'},
            {'z', 'h', '-', 'i', 'p', 'o', 'r', 'q'},
            {'a', 'u', '-', 'h', 'l', 'm', 'l', 'w'},
            {'y', '-', 'h', '-', 'a', 'i', 'j', 'w'},
            {'q', 'u', 'v', 'z', 'y', 'e', 'r', '-'},
            {'r', 'e', 'w', 'e', 'i', 'c', 'z', 'd'},
            {'i', 'x', 'e', 'c', 'j', 'g', 'k', 'o'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'b', 'm', 'u', 'g', 'r', 'c', 'n', 'b'},
            {'b', 'z', 'w', 'j', 'b', 'p', 'f', 't'},
            {'u', 'r', 'a', '-', 'w', 'g', 'p', 'b'},
            {'-', 'x', '-', 'j', 'x', 'l', 'w', 'd'},
            {'g', 'u', 'w', 'h', 'z', 'y', 'r', 'o'},
            {'g', '-', 'd', '-', '-', 'w', 'h', 'p'},
            {'k', 'w', 'p', 'h', 'p', 'r', 'u', 'a'},
            {'o', 't', 'x', 'f', 'i', 'o', 'y', 'h'},
            {'k', 't', 'k', 'd', 'c', 'f', 'm', 'y'},
            {'t', 'e', 'k', 'z', 'e', 'm', 'h', 'a'},
            {'m', 'n', 'z', 'j', 'p', 't', 'd', 'k'},
            {'b', 'f', 'v', 'c', 's', 'a', 'j', 'l'},
            {'r', 'r', 'e', 'f', 'q', 'c', 'h', 'y'},
            {'z', 'c', 'j', 'u', 'k', 'q', 'c', 'o'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'v', 'u', 'h', 'k', 'l', '-', '-', 'f'},
            {'o', 't', 'p', 'n', 's', 'f', 'd', 'p'},
            {'f', 'b', 'b', 'p', 'e', 't', 'w', 'n'},
            {'n', 'k', 'g', '-', 'i', 'c', 'q', 'p'},
            {'e', 'i', 'o', 'i', 's', 'a', 'k', 'y'},
            {'e', 'f', 'd', 'k', 'j', 't', 'j', 'f'},
            {'r', 'r', 'g', 'd', 'j', 'v', 'p', 'n'},
            {'l', 'g', 'm', 'v', '-', 'y', 'a', '-'},
            {'y', 'q', 'b', 'o', '-', 'u', 'v', 'y'},
            {'a', '-', 'j', 'm', 'c', 'i', 't', 'g'},
            {'c', 'c', 'f', 's', 'z', 'n', 'a', 'i'},
            {'m', 'g', 'e', 'y', 'a', 't', 's', 't'},
            {'q', 'm', 'b', 't', 'r', 'u', 'l', 'd'},
            {'k', 'o', 'b', 'e', 'w', 'x', 'o', 'q'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
