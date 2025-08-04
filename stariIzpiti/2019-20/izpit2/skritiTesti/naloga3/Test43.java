
import java.util.Arrays;

public class Test43 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[29];
        ukazi[0] = new Tretja.Odvzemi(6);
        ukazi[1] = new Tretja.Odvzemi(3);
        ukazi[2] = ukazi[0].zaporedje(ukazi[0]);
        ukazi[3] = new Tretja.Postavi(0);
        ukazi[4] = new Tretja.Odvzemi(7);
        ukazi[5] = ukazi[3].zaporedje(ukazi[3]);
        ukazi[6] = new Tretja.Odvzemi(0);
        ukazi[7] = ukazi[5].zaporedje(ukazi[4]);
        ukazi[8] = new Tretja.Postavi(5);
        ukazi[9] = ukazi[7].zaporedje(ukazi[0]);
        ukazi[10] = new Tretja.Postavi(5);
        ukazi[11] = ukazi[5].zaporedje(ukazi[7]);
        ukazi[12] = new Tretja.Postavi(1);
        ukazi[13] = ukazi[4].zaporedje(ukazi[12]);
        ukazi[14] = ukazi[11].zaporedje(ukazi[10]);
        ukazi[15] = new Tretja.Odvzemi(2);
        ukazi[16] = ukazi[11].zaporedje(ukazi[12]);
        ukazi[17] = new Tretja.Odvzemi(7);
        ukazi[18] = new Tretja.Postavi(1);
        ukazi[19] = ukazi[7].zaporedje(ukazi[6]);
        ukazi[20] = ukazi[15].zaporedje(ukazi[17]);
        ukazi[21] = new Tretja.Postavi(0);
        ukazi[22] = new Tretja.Postavi(0);
        ukazi[23] = new Tretja.Odvzemi(4);
        ukazi[24] = new Tretja.Postavi(6);
        ukazi[25] = new Tretja.Postavi(0);
        ukazi[26] = new Tretja.Postavi(7);
        ukazi[27] = new Tretja.Odvzemi(3);
        ukazi[28] = new Tretja.Postavi(7);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {5, 10, 10, 2, 0, 6, 10, 18};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
