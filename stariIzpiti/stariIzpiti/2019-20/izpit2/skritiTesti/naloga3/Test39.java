
import java.util.Arrays;

public class Test39 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[28];
        ukazi[0] = new Tretja.Postavi(0);
        ukazi[1] = new Tretja.Postavi(1);
        ukazi[2] = ukazi[0].zaporedje(ukazi[1]);
        ukazi[3] = ukazi[1].zaporedje(ukazi[2]);
        ukazi[4] = new Tretja.Postavi(1);
        ukazi[5] = ukazi[1].zaporedje(ukazi[2]);
        ukazi[6] = ukazi[2].zaporedje(ukazi[1]);
        ukazi[7] = ukazi[2].zaporedje(ukazi[6]);
        ukazi[8] = new Tretja.Postavi(1);
        ukazi[9] = ukazi[6].zaporedje(ukazi[4]);
        ukazi[10] = ukazi[5].zaporedje(ukazi[8]);
        ukazi[11] = ukazi[6].zaporedje(ukazi[4]);
        ukazi[12] = new Tretja.Postavi(1);
        ukazi[13] = ukazi[9].zaporedje(ukazi[11]);
        ukazi[14] = new Tretja.Postavi(0);
        ukazi[15] = new Tretja.Postavi(1);
        ukazi[16] = ukazi[9].zaporedje(ukazi[11]);
        ukazi[17] = ukazi[2].zaporedje(ukazi[5]);
        ukazi[18] = ukazi[7].zaporedje(ukazi[4]);
        ukazi[19] = ukazi[1].zaporedje(ukazi[17]);
        ukazi[20] = new Tretja.Postavi(0);
        ukazi[21] = ukazi[1].zaporedje(ukazi[20]);
        ukazi[22] = new Tretja.Postavi(1);
        ukazi[23] = new Tretja.Postavi(0);
        ukazi[24] = ukazi[22].zaporedje(ukazi[15]);
        ukazi[25] = new Tretja.Postavi(0);
        ukazi[26] = ukazi[9].zaporedje(ukazi[22]);
        ukazi[27] = ukazi[9].zaporedje(ukazi[11]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {11, 14};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
