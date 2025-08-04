
import java.util.Arrays;

public class Test42 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[12];
        ukazi[0] = new Tretja.Postavi(2);
        ukazi[1] = new Tretja.Odvzemi(3);
        ukazi[2] = ukazi[0].zaporedje(ukazi[0]);
        ukazi[3] = ukazi[2].zaporedje(ukazi[0]);
        ukazi[4] = ukazi[3].zaporedje(ukazi[3]);
        ukazi[5] = new Tretja.Postavi(3);
        ukazi[6] = ukazi[5].zaporedje(ukazi[5]);
        ukazi[7] = new Tretja.Postavi(3);
        ukazi[8] = ukazi[0].zaporedje(ukazi[0]);
        ukazi[9] = ukazi[6].zaporedje(ukazi[3]);
        ukazi[10] = ukazi[3].zaporedje(ukazi[7]);
        ukazi[11] = ukazi[2].zaporedje(ukazi[7]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {18, 20, 18, 12};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
