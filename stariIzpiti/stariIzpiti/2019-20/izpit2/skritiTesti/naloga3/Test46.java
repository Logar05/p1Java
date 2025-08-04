
import java.util.Arrays;

public class Test46 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[12];
        ukazi[0] = new Tretja.Odvzemi(0);
        ukazi[1] = new Tretja.Odvzemi(0);
        ukazi[2] = new Tretja.Postavi(0);
        ukazi[3] = ukazi[2].zaporedje(ukazi[0]);
        ukazi[4] = new Tretja.Odvzemi(0);
        ukazi[5] = new Tretja.Odvzemi(0);
        ukazi[6] = ukazi[3].zaporedje(ukazi[1]);
        ukazi[7] = ukazi[4].zaporedje(ukazi[0]);
        ukazi[8] = ukazi[7].zaporedje(ukazi[0]);
        ukazi[9] = new Tretja.Odvzemi(0);
        ukazi[10] = ukazi[0].zaporedje(ukazi[5]);
        ukazi[11] = ukazi[8].zaporedje(ukazi[7]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {20};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
