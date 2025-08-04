
import java.util.Arrays;

public class Test29 {
    public static void main(String[] args) {
        int[] stolpi = {7, 17, 20, 9, 4};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(2),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(2),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(3),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(3),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
