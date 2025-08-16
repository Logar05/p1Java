
import java.util.Arrays;

public class Test06 {

    public static void main(String[] args) {
        int[] stolpi = {0, 0, 0};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Postavi(3), 
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(1),
            new Tretja.Postavi(2),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(2)
        };
        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
