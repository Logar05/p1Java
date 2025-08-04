
import java.util.Arrays;

public class Test35 {
    public static void main(String[] args) {
        int[] stolpi = {6, 14};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(0),
            new Tretja.Postavi(1),
            new Tretja.Postavi(1),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(1),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
