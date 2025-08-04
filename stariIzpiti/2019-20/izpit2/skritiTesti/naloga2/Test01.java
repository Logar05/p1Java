
public class Test01 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'v', 'u', 'a', 'u', 'y', 'n', 'k', 'r', 'u', 'o', 'p', 'p', 'r', 'v', 'x', '-', 'w'},
            {'k', 'a', 'y', 'y', 'j', 'z', 'g', 'g', 'm', 'u', 'l', 'w', 'p', 'r', 'k', 'w', 'x'},
            {'u', 'k', '-', 'm', 'd', 'j', 'u', 'p', 'l', 'p', 'd', 'z', 'c', 'n', 'a', 'l', 'o'},
            {'e', 'f', 'o', 'u', 'q', 'j', 'c', 'e', 'w', 'q', 'r', 'y', 't', 'd', 'z', 'a', 'u'},
            {'s', 'o', 'y', 'w', 'q', 'u', 'c', 'i', 'e', 'p', 'q', 'k', 'z', 'b', 'y', 'c', 'n'},
            {'q', '-', 's', 'm', 'j', 'j', 'f', 'm', 's', 'o', 'l', 's', 'x', 'i', 'm', 'a', 'j'},
            {'-', 'v', 'z', 'y', 'q', 'j', 'c', 'z', 'g', '-', 's', 'h', 's', 'h', 'v', 't', 'g'},
            {'e', 'i', 'c', 'f', 'o', 't', 'e', 't', 'k', 'f', 'c', 'h', 'u', 'y', 'l', 'q', 'a'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'b', 'l', 'o', 'x', 'z', 'j', 'q', '-', 'u', 'o', 'i', 'u', 'c', 'o', 'x', 'f', 'c'},
            {'h', 'q', 'j', 'f', 't', 'r', 'p', '-', 's', 'n', 'r', 'z', 'w', 'n', 'z', 'l', 'a'},
            {'t', 'a', 't', 'k', 'p', 'z', 'c', 'p', 'j', 't', 'c', 'z', 'u', 'f', 'd', 'u', 'f'},
            {'s', 'y', 'a', 'z', 'r', 'e', 'j', 'j', 'b', 'r', 'm', 'z', 'y', 'y', 't', 'm', 'x'},
            {'l', 'g', 'i', 'f', 's', 'n', 'v', 's', 'y', 'r', 'v', 'g', 'g', 'v', 's', 'y', 'm'},
            {'q', 'y', 'k', 'r', 'q', 'v', 'h', 'v', 'r', 'l', 'u', 'k', 'o', 'a', 'r', 'c', 'g'},
            {'a', 'y', 'd', 'q', 'y', 't', 'l', 'k', 'g', 'c', 's', 'f', 'q', 'd', 'b', 'x', 'o'},
            {'f', 'p', 'd', 'v', 'u', 'm', 'g', 'w', 'f', 'g', 'z', 'a', 'e', 'z', 'c', 'y', 'p'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'e', 'm', 'v', 'o', 'd', 'v', 'c', 'k', 'w', 'b', 'q', 'd', 'k', 'q', 'b', 'l', 'z'},
            {'z', 'g', 'k', 'x', 's', 'c', 'k', 'y', 'y', 'w', 'l', 'h', 'z', 'r', 'p', 'z', 'c'},
            {'y', 'l', 'z', 'a', 'u', 'c', 'd', 'v', 'f', 'p', 'l', 'w', 'v', 'a', 'w', 'g', 'x'},
            {'g', 'f', 'x', 'q', 'u', 'x', 's', 'w', 'l', 'h', 'i', 't', 'j', 'd', 'a', 'o', 'z'},
            {'t', 'c', 'j', 'd', 'l', 't', 'w', 'n', 'u', 't', 'z', 'd', 'd', 'x', 'b', 'z', 'c'},
            {'b', 'j', 'p', 'k', 'h', 'h', 's', 'h', 'r', 'r', 'o', 't', 'm', 'q', 'a', 'f', 'a'},
            {'c', 'q', 't', 'p', 'b', 'k', 'y', 'j', 'm', 'g', 'e', 'y', 'i', 'z', 'j', 'e', 'u'},
            {'y', 'k', 'o', 'd', 'u', 'y', 't', 'x', 'q', 'w', 'i', 'q', 'u', 'w', 'b', 't', 'h'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'y', 'i', 'b', 'x', '-', 'n', 'x', 'z', 'g', 'd', 'f', 'w', 'o', 'c', 'o', 'k', 'o'},
            {'v', 'r', 'i', '-', 'l', 'r', 'g', 'd', 'x', '-', 'o', 'x', 'h', 'y', 'y', 'r', 's'},
            {'p', 'n', 'f', 'j', 'w', 'h', '-', 'z', '-', 'f', 'r', 'k', 'n', 'k', '-', 'k', 'e'},
            {'t', 'u', 'o', 'r', 'y', 'i', 't', 'l', 'e', 't', 'c', 'm', 'k', 'n', '-', 'e', '-'},
            {'l', 'z', 'a', 'j', 's', 'k', 'q', 's', 'y', 'k', 'm', 'k', 'm', 'h', 'c', 'o', 'j'},
            {'b', 'u', 'd', 'b', 'o', 'r', 'e', 'n', 'u', 'i', 'b', 'b', 'l', 'm', 'r', 'u', 'd'},
            {'c', 'h', 'k', 'i', 'o', 'q', 'r', 't', 'v', 'k', 'l', 'l', 'z', 'r', 'g', 'k', 'n'},
            {'h', 'h', 'u', 'f', 'e', 's', 'y', 'o', 'm', 'v', 's', 's', 'm', 'f', 'y', 'l', 'i'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'h', 'g', 'q', 'm', 't', 'j', 'h', 'b', 'y', '-', 'p', 'r', 'a', 'i', 'f', 'k', 'l'},
            {'f', 'n', 'n', 'b', 'j', '-', 'x', 'v', 'f', 's', 'u', 'l', '-', 'c', 'a', 'b', 'v'},
            {'u', 's', 'b', 'v', 'k', 'k', '-', 'f', 'k', '-', 'k', 'p', 'u', 'v', 'm', 'b', 'a'},
            {'-', '-', 's', 'c', 'o', 'q', 'e', 'z', 'z', 'w', 'l', 'p', 'a', 'z', 'w', 'o', 's'},
            {'g', 'k', 'h', 'y', 'w', 'r', 'd', 'x', 'e', 'e', '-', 'd', 'b', 'u', 'h', 'p', 'l'},
            {'q', 'o', 'j', 'v', 'r', 't', 'w', 't', 'm', 'w', 'v', 'd', 'z', 'q', 'e', 'n', 'w'},
            {'q', 'b', 's', 'm', 't', 'z', 'k', 'd', 'r', 'v', 'm', 'm', 'i', 'm', 'h', 'n', 'f'},
            {'y', 's', 'd', 'u', 'u', 'n', 'x', 'h', 'c', 'q', 'x', 'r', 'n', 'n', 'p', 'e', 'p'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
