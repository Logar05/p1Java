
import java.util.Arrays;

public class Test47 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[14];
        ukazi[0] = new Tretja.Postavi(1);
        ukazi[1] = new Tretja.Postavi(0);
        ukazi[2] = ukazi[1].zaporedje(ukazi[0]);
        ukazi[3] = ukazi[0].zaporedje(ukazi[2]);
        ukazi[4] = new Tretja.Postavi(1);
        ukazi[5] = new Tretja.Odvzemi(3);
        ukazi[6] = ukazi[5].zaporedje(ukazi[4]);
        ukazi[7] = ukazi[4].zaporedje(ukazi[6]);
        ukazi[8] = new Tretja.Postavi(2);
        ukazi[9] = new Tretja.Postavi(0);
        ukazi[10] = ukazi[7].zaporedje(ukazi[9]);
        ukazi[11] = ukazi[4].zaporedje(ukazi[9]);
        ukazi[12] = new Tretja.Postavi(1);
        ukazi[13] = ukazi[10].zaporedje(ukazi[1]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {16, 0, 19, 0};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
