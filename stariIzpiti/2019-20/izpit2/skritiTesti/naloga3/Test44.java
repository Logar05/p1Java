
import java.util.Arrays;

public class Test44 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[24];
        ukazi[0] = new Tretja.Postavi(1);
        ukazi[1] = new Tretja.Postavi(0);
        ukazi[2] = new Tretja.Postavi(1);
        ukazi[3] = new Tretja.Postavi(0);
        ukazi[4] = new Tretja.Postavi(0);
        ukazi[5] = new Tretja.Postavi(1);
        ukazi[6] = ukazi[3].zaporedje(ukazi[2]);
        ukazi[7] = ukazi[5].zaporedje(ukazi[2]);
        ukazi[8] = new Tretja.Postavi(0);
        ukazi[9] = new Tretja.Postavi(0);
        ukazi[10] = ukazi[3].zaporedje(ukazi[2]);
        ukazi[11] = new Tretja.Postavi(1);
        ukazi[12] = new Tretja.Postavi(0);
        ukazi[13] = new Tretja.Postavi(1);
        ukazi[14] = new Tretja.Postavi(1);
        ukazi[15] = new Tretja.Postavi(1);
        ukazi[16] = new Tretja.Postavi(1);
        ukazi[17] = new Tretja.Postavi(0);
        ukazi[18] = new Tretja.Postavi(0);
        ukazi[19] = new Tretja.Postavi(0);
        ukazi[20] = ukazi[17].zaporedje(ukazi[17]);
        ukazi[21] = ukazi[14].zaporedje(ukazi[1]);
        ukazi[22] = ukazi[2].zaporedje(ukazi[6]);
        ukazi[23] = new Tretja.Postavi(0);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {12, 19};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
