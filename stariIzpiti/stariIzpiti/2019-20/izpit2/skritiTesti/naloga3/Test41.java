
import java.util.Arrays;

public class Test41 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[29];
        ukazi[0] = new Tretja.Odvzemi(4);
        ukazi[1] = new Tretja.Odvzemi(3);
        ukazi[2] = new Tretja.Odvzemi(2);
        ukazi[3] = new Tretja.Postavi(3);
        ukazi[4] = ukazi[3].zaporedje(ukazi[1]);
        ukazi[5] = new Tretja.Postavi(0);
        ukazi[6] = ukazi[5].zaporedje(ukazi[4]);
        ukazi[7] = ukazi[3].zaporedje(ukazi[5]);
        ukazi[8] = ukazi[4].zaporedje(ukazi[1]);
        ukazi[9] = ukazi[3].zaporedje(ukazi[3]);
        ukazi[10] = ukazi[0].zaporedje(ukazi[9]);
        ukazi[11] = ukazi[3].zaporedje(ukazi[6]);
        ukazi[12] = ukazi[0].zaporedje(ukazi[10]);
        ukazi[13] = ukazi[10].zaporedje(ukazi[6]);
        ukazi[14] = ukazi[13].zaporedje(ukazi[12]);
        ukazi[15] = new Tretja.Odvzemi(4);
        ukazi[16] = ukazi[2].zaporedje(ukazi[13]);
        ukazi[17] = new Tretja.Postavi(4);
        ukazi[18] = ukazi[17].zaporedje(ukazi[8]);
        ukazi[19] = ukazi[11].zaporedje(ukazi[13]);
        ukazi[20] = new Tretja.Postavi(2);
        ukazi[21] = new Tretja.Postavi(1);
        ukazi[22] = ukazi[10].zaporedje(ukazi[11]);
        ukazi[23] = new Tretja.Odvzemi(3);
        ukazi[24] = ukazi[18].zaporedje(ukazi[2]);
        ukazi[25] = ukazi[1].zaporedje(ukazi[14]);
        ukazi[26] = new Tretja.Odvzemi(2);
        ukazi[27] = ukazi[14].zaporedje(ukazi[11]);
        ukazi[28] = ukazi[3].zaporedje(ukazi[8]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {12, 5, 13, 0, 10};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
