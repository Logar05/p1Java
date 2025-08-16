
public class Test03 {

    public static void main(String[] args) {
        char[][] krizanka0 = {
            {'r', 'l', 'p', 'e', '-', '-', 't', 'x', 'y', 'b', 'm', 't', 'v', 'w', 't', 't', 'g'},
            {'a', 'x', 'l', 'd', 'g', 'p', 'i', 'q', 'm', 'o', 's', 'z', 'i', 'e', 'c', 'o', 'm'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka0));

        char[][] krizanka1 = {
            {'w', 'c', 'q', 'x', 'r', 's', 'm', 'y', 'y', '-', 'r', 'p', 'x', 'd', 'b', 'n', 'h'},
            {'w', 't', 'i', 'h', 'q', 'i', 'l', 'c', 'y', 'l', 'v', 'n', 'f', 'e', 'r', 's', 'w'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka1));

        char[][] krizanka2 = {
            {'u', 'n', 'y', 'w', 'i', 'h', 'f', 'd', 'v', 'm', 'y', 'u', 'g', 's', 'v', 'c', 'z'},
            {'g', 'l', 'f', 'x', 'y', 's', '-', 'b', 'w', 'y', 'u', 'w', 'b', 'a', 'c', 'g', 'n'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));

        char[][] krizanka3 = {
            {'m', 'w', 'l', 'a', 'o', 'z', 'y', 'n', 'n', 'j', 'l', 'y', 'k', 'u', 'r', 'h', 't'},
            {'g', 'b', 'c', 'n', 'u', 'v', 'z', 'i', 'x', 'h', 'd', 'i', 't', 'z', 'e', 't', 'y'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka3));

        char[][] krizanka4 = {
            {'y', 'c', 'f', 'm', 'v', 'j', 'd', 'c', 'u', 'q', 'z', 'n', '-', 'r', 'e', 'v', 'c'},
            {'m', 't', 'a', 'x', 'q', 'm', 'k', 'q', 'o', 'c', 'i', 'c', 'l', 'j', 'h', 'm', 'y'},
        };
        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka4));

    }
}
