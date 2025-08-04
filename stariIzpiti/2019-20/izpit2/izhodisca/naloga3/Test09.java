
import java.util.Arrays;

public class Test09 {

    public static void main(String[] args) {

        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[7];
        ukazi[0] = new Tretja.Postavi(0);
        for (int i = 1;  i < ukazi.length;  i++) {
            ukazi[i] = ukazi[i - 1].zaporedje(ukazi[i - 1]);
        }

        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {0, 0, 0};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
