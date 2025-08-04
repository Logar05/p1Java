
import java.util.Arrays;

public class Test37 {
    public static void main(String[] args) {
        int[] stolpi = {1, 17, 2, 0, 8, 13, 15, 0, 6};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(7),
            new Tretja.Odvzemi(7),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(8),
            new Tretja.Postavi(1),
            new Tretja.Postavi(5),
            new Tretja.Postavi(7),
            new Tretja.Postavi(7),
            new Tretja.Odvzemi(5),
            new Tretja.Odvzemi(5),
            new Tretja.Odvzemi(7),
            new Tretja.Postavi(3),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(8),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(2),
            new Tretja.Postavi(7),
            new Tretja.Postavi(8),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(0),
            new Tretja.Postavi(2),
            new Tretja.Postavi(5),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(8),
            new Tretja.Postavi(3),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
