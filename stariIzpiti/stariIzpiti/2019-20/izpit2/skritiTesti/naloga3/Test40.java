
import java.util.Arrays;

public class Test40 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[25];
        ukazi[0] = new Tretja.Odvzemi(7);
        ukazi[1] = new Tretja.Odvzemi(3);
        ukazi[2] = new Tretja.Odvzemi(1);
        ukazi[3] = ukazi[0].zaporedje(ukazi[2]);
        ukazi[4] = new Tretja.Odvzemi(1);
        ukazi[5] = ukazi[1].zaporedje(ukazi[1]);
        ukazi[6] = ukazi[4].zaporedje(ukazi[2]);
        ukazi[7] = new Tretja.Odvzemi(3);
        ukazi[8] = new Tretja.Odvzemi(0);
        ukazi[9] = new Tretja.Odvzemi(6);
        ukazi[10] = new Tretja.Odvzemi(4);
        ukazi[11] = ukazi[9].zaporedje(ukazi[2]);
        ukazi[12] = new Tretja.Odvzemi(2);
        ukazi[13] = new Tretja.Odvzemi(0);
        ukazi[14] = new Tretja.Odvzemi(1);
        ukazi[15] = new Tretja.Postavi(5);
        ukazi[16] = ukazi[3].zaporedje(ukazi[15]);
        ukazi[17] = new Tretja.Odvzemi(2);
        ukazi[18] = new Tretja.Odvzemi(3);
        ukazi[19] = ukazi[14].zaporedje(ukazi[6]);
        ukazi[20] = new Tretja.Odvzemi(4);
        ukazi[21] = ukazi[18].zaporedje(ukazi[8]);
        ukazi[22] = ukazi[6].zaporedje(ukazi[5]);
        ukazi[23] = ukazi[9].zaporedje(ukazi[3]);
        ukazi[24] = ukazi[20].zaporedje(ukazi[4]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {8, 2, 13, 20, 14, 16, 16, 1};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
