
import java.util.Arrays;

public class Test30 {
    public static void main(String[] args) {
        int[] stolpi = {6, 5, 9, 0, 11, 6, 8, 10};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(7),
            new Tretja.Postavi(4),
            new Tretja.Postavi(3),
            new Tretja.Postavi(1),
            new Tretja.Postavi(7),
            new Tretja.Postavi(0),
            new Tretja.Postavi(7),
            new Tretja.Postavi(2),
            new Tretja.Postavi(4),
            new Tretja.Postavi(1),
            new Tretja.Postavi(6),
            new Tretja.Postavi(6),
            new Tretja.Postavi(1),
            new Tretja.Postavi(2),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(4),
            new Tretja.Postavi(3),
            new Tretja.Postavi(4),
            new Tretja.Postavi(7),
            new Tretja.Postavi(3),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
