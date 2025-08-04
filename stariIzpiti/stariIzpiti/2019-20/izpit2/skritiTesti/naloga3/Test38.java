
import java.util.Arrays;

public class Test38 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[21];
        ukazi[0] = new Tretja.Postavi(0);
        ukazi[1] = new Tretja.Postavi(3);
        ukazi[2] = new Tretja.Postavi(1);
        ukazi[3] = new Tretja.Postavi(6);
        ukazi[4] = ukazi[2].zaporedje(ukazi[0]);
        ukazi[5] = ukazi[4].zaporedje(ukazi[4]);
        ukazi[6] = new Tretja.Postavi(1);
        ukazi[7] = ukazi[6].zaporedje(ukazi[6]);
        ukazi[8] = new Tretja.Postavi(1);
        ukazi[9] = ukazi[2].zaporedje(ukazi[4]);
        ukazi[10] = ukazi[4].zaporedje(ukazi[6]);
        ukazi[11] = new Tretja.Postavi(6);
        ukazi[12] = ukazi[5].zaporedje(ukazi[3]);
        ukazi[13] = new Tretja.Odvzemi(1);
        ukazi[14] = new Tretja.Postavi(2);
        ukazi[15] = ukazi[10].zaporedje(ukazi[13]);
        ukazi[16] = new Tretja.Postavi(2);
        ukazi[17] = new Tretja.Odvzemi(4);
        ukazi[18] = ukazi[14].zaporedje(ukazi[9]);
        ukazi[19] = ukazi[17].zaporedje(ukazi[4]);
        ukazi[20] = ukazi[1].zaporedje(ukazi[10]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {16, 1, 11, 3, 8, 9, 17};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
