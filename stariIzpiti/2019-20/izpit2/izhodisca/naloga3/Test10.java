
import java.util.Arrays;

public class Test10 {

    public static void main(String[] args) {

        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[29];
        ukazi[0] = new Tretja.Odvzemi(1);
        ukazi[1] = new Tretja.Odvzemi(6);
        ukazi[2] = ukazi[1].zaporedje(ukazi[0]);
        ukazi[3] = new Tretja.Odvzemi(4);
        ukazi[4] = ukazi[2].zaporedje(ukazi[2]);
        ukazi[5] = ukazi[3].zaporedje(ukazi[0]);
        ukazi[6] = ukazi[3].zaporedje(ukazi[0]);
        ukazi[7] = new Tretja.Postavi(4);
        ukazi[8] = ukazi[1].zaporedje(ukazi[1]);
        ukazi[9] = ukazi[5].zaporedje(ukazi[5]);
        ukazi[10] = new Tretja.Odvzemi(1);
        ukazi[11] = new Tretja.Odvzemi(0);
        ukazi[12] = ukazi[2].zaporedje(ukazi[9]);
        ukazi[13] = new Tretja.Postavi(5);
        ukazi[14] = ukazi[6].zaporedje(ukazi[6]);
        ukazi[15] = new Tretja.Odvzemi(1);
        ukazi[16] = ukazi[13].zaporedje(ukazi[6]);
        ukazi[17] = new Tretja.Odvzemi(3);
        ukazi[18] = new Tretja.Postavi(0);
        ukazi[19] = ukazi[17].zaporedje(ukazi[14]);
        ukazi[20] = ukazi[11].zaporedje(ukazi[4]);
        ukazi[21] = new Tretja.Odvzemi(0);
        ukazi[22] = new Tretja.Postavi(5);
        ukazi[23] = new Tretja.Odvzemi(4);
        ukazi[24] = new Tretja.Odvzemi(5);
        ukazi[25] = ukazi[19].zaporedje(ukazi[13]);
        ukazi[26] = ukazi[0].zaporedje(ukazi[15]);
        ukazi[27] = new Tretja.Odvzemi(3);
        ukazi[28] = ukazi[15].zaporedje(ukazi[15]);

        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {12, 16, 13, 20, 13, 8, 13};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
