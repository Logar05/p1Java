
public class Test19 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'o', 'u', 'n', 'u', 'b', 'b', 'u', 'a', 'a', 'f', 't', 'a', '-', '-', 'q', 'f'},
            {'x', 'q', 'c', 'p', 'v', 'b', 'o', 'y', 't', 'm', 'c', 'j', 'l', 'c', 'p', '-'},
            {'i', 'e', 'a', 't', 'i', 'h', '-', 'j', 'o', 'u', 'x', 'o', 'k', 'f', '-', 'p'},
            {'p', 'q', 'w', 'q', 'w', 'b', 't', 'n', 's', 't', 'b', 's', 'y', 'j', 'i', 's'},
            {'c', 's', 'j', 'p', 'f', 'j', 'j', 'm', 'i', 'u', 'v', 'v', 'p', 'h', 'f', 'z'},
            {'x', 'k', 'm', 'z', 'y', 'e', 'w', 'g', 's', 'n', 'z', 'a', 'o', 'c', 'm', 't'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'r', 'n', 'h', 't', 'n', 'b', 'y', 'x', 'c', '-', 'e', 'z', 'a', 'o', 'u', 'z'},
            {'l', 'g', 'j', 'q', 'r', 'k', '-', 'e', 'u', 'h', 'q', 'a', 'g', 'j', 'p', 'c'},
            {'c', 'm', 'n', 'z', 'y', 'n', 'g', 'x', 'r', '-', 'h', 'v', 'x', 'c', 'z', 'u'},
            {'h', 'l', 'n', 'r', 'e', 'h', 'y', 'n', 'c', 'm', 'l', 'b', 'k', 'x', 'i', 'm'},
            {'i', 'e', 'v', 'o', 'z', 'k', 'd', 'z', 'h', 'l', 'l', 'a', 'c', 'a', 'm', 'y'},
            {'b', 'j', 'o', 'i', 'h', 'y', 's', 'v', 'g', 'i', 'g', 'n', 'g', 'z', 'u', 'r'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'s', 'm', 'o', 'v', '-', 'f', 'c', 'e', 'n', 'r', 'x', 'v', 'f', 'p', 'y', 'q'},
            {'d', 'j', 'g', 'u', 'f', 'i', 'a', 'k', 'z', 'e', 'j', 'v', 'q', 'c', 'i', 'y'},
            {'o', 'u', 'y', 'j', 'x', 'j', 'o', 'y', 'k', 'q', 'm', 'j', 'i', 'x', 'd', 'r'},
            {'e', 'q', 's', 'y', 'f', 'g', 'j', 'i', 'v', 'x', 't', 'e', 'b', 'v', 'p', 's'},
            {'j', 'j', 'm', 'b', 's', 'v', 'b', 'g', 'z', 'x', 'u', 'd', 'r', 'w', 'r', 'w'},
            {'h', 'g', 'y', 'z', 'm', 's', 'x', 'm', 'm', 'r', 'q', 'q', 'h', 'i', 'p', 'm'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'j', 'r', 'l', 'j', 'g', 'h', 'b', 'k', 'f', 'm', 'c', 'c', 'c', 'p', 'k', 'j'},
            {'t', 'h', 'j', 'b', 'v', 'i', 'b', 'k', '-', 's', 'e', 'n', 'y', 'w', 'e', 'o'},
            {'g', 'l', 'p', 'r', 'v', 'b', 'o', 'x', 'y', 'v', 'f', '-', 'l', 'e', 'y', 'e'},
            {'a', 'y', 'l', 'r', 'f', 'f', 's', 'g', 'i', 'k', 'v', 'w', 'o', 'l', 'a', '-'},
            {'d', 'a', 'u', 'w', '-', 'l', 'h', 'y', 'j', 'f', 'c', 'd', 'z', 'b', 'w', 'w'},
            {'a', 'g', '-', 'o', 'e', 't', 'z', 'h', '-', 'x', 'v', 'j', 't', 'o', 'i', 'y'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'-', 'y', 's', '-', 'u', 'n', 'w', 'k', 'v', 'p', 'u', 'i', 'l', 'x', 'c', 'q'},
            {'h', 't', 'a', 'g', 'k', 'f', 'q', 'e', 'l', 'y', '-', 'w', 'c', 'c', 'x', 'y'},
            {'f', '-', 'c', 'l', 'j', 'y', 'z', 'm', 'o', 'z', 'w', '-', 'c', 'e', 'x', '-'},
            {'a', 'a', 'y', 'h', 'p', 'k', '-', 'y', 'v', 'w', 'e', 'w', 'q', 'r', 'd', 'z'},
            {'t', 'x', 'd', 'm', 'u', 'i', 'r', 'e', 'k', 'z', 'r', 'w', 'i', 'r', 'u', 'q'},
            {'y', 's', 'c', 'i', 'c', 'l', 'c', 'p', 'u', 'z', 'x', 'm', 'p', 'v', 'v', 'y'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
