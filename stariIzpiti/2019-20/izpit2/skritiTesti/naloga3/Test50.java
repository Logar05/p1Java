
import java.util.Arrays;

public class Test50 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[20];
        ukazi[0] = new Tretja.Odvzemi(7);
        ukazi[1] = new Tretja.Odvzemi(1);
        ukazi[2] = new Tretja.Odvzemi(2);
        ukazi[3] = new Tretja.Odvzemi(3);
        ukazi[4] = ukazi[1].zaporedje(ukazi[0]);
        ukazi[5] = new Tretja.Postavi(8);
        ukazi[6] = ukazi[2].zaporedje(ukazi[3]);
        ukazi[7] = ukazi[4].zaporedje(ukazi[0]);
        ukazi[8] = ukazi[4].zaporedje(ukazi[6]);
        ukazi[9] = new Tretja.Postavi(6);
        ukazi[10] = ukazi[1].zaporedje(ukazi[1]);
        ukazi[11] = ukazi[1].zaporedje(ukazi[3]);
        ukazi[12] = ukazi[1].zaporedje(ukazi[10]);
        ukazi[13] = new Tretja.Postavi(6);
        ukazi[14] = ukazi[10].zaporedje(ukazi[8]);
        ukazi[15] = ukazi[14].zaporedje(ukazi[11]);
        ukazi[16] = new Tretja.Odvzemi(2);
        ukazi[17] = ukazi[16].zaporedje(ukazi[16]);
        ukazi[18] = new Tretja.Odvzemi(6);
        ukazi[19] = new Tretja.Odvzemi(3);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {12, 6, 1, 19, 20, 11, 9, 12, 5};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
