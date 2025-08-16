
public class Test01 {

    public static void main(String[] args) {
        char[][] krizanka = {
            {'f', 'h', 'a', '-', 'b'},
            {'a', 'i', 'p', 's', 'o'},
            {'y', '-', 't', '-', 'l'},
            {'u', 'j', '-', 'c', '-'},
            {'k', 'l', 'z', '-', '-'},
            {'l', '-', 'v', 'w', 'k'},
            {'g', 'p', '-', 'y', 'a'},
            {'c', 's', 'r', '-', 'e'},
            {'e', '-', 'k', '-', 'r'},
            {'y', 'e', 'u', 'j', 'g'},
        };

        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka));

        char[][] krizanka2 = {
            {'f', 'h', 'a', 'b', 'b'},
            {'a', 'i', 'p', 's', 'o'},
            {'y', 'p', 't', 'c', 'l'},
            {'u', 'j', 'k', 'c', 'a'},
            {'k', 'l', 'z', 'k', 't'},
            {'l', 'r', 'v', 'w', 'k'},
            {'g', 'p', 'p', 'y', 'a'},
            {'c', 's', 'r', 's', 'e'},
            {'e', 'x', 'k', 'l', 'r'},
            {'y', 'e', 'u', 'j', 'g'},
        };

        System.out.println(Druga.zadnjaVrsticaZLocilom(krizanka2));
    }
}
