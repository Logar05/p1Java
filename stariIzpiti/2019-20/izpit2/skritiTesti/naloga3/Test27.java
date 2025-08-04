
import java.util.Arrays;

public class Test27 {
    public static void main(String[] args) {
        int[] stolpi = {9, 0, 2, 18, 13, 10, 19, 20};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(4),
            new Tretja.Postavi(4),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(6),
            new Tretja.Postavi(1),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(4),
            new Tretja.Postavi(0),
            new Tretja.Postavi(2),
            new Tretja.Postavi(2),
            new Tretja.Postavi(6),
            new Tretja.Postavi(0),
            new Tretja.Postavi(7),
            new Tretja.Postavi(5),
            new Tretja.Postavi(2),
            new Tretja.Postavi(5),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
