
import java.util.Arrays;

public class Test48 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[20];
        ukazi[0] = new Tretja.Odvzemi(1);
        ukazi[1] = new Tretja.Odvzemi(9);
        ukazi[2] = new Tretja.Odvzemi(8);
        ukazi[3] = new Tretja.Postavi(7);
        ukazi[4] = ukazi[1].zaporedje(ukazi[3]);
        ukazi[5] = new Tretja.Odvzemi(2);
        ukazi[6] = new Tretja.Odvzemi(7);
        ukazi[7] = new Tretja.Odvzemi(9);
        ukazi[8] = ukazi[3].zaporedje(ukazi[6]);
        ukazi[9] = new Tretja.Odvzemi(5);
        ukazi[10] = new Tretja.Odvzemi(0);
        ukazi[11] = ukazi[9].zaporedje(ukazi[7]);
        ukazi[12] = new Tretja.Odvzemi(7);
        ukazi[13] = ukazi[11].zaporedje(ukazi[1]);
        ukazi[14] = new Tretja.Odvzemi(0);
        ukazi[15] = ukazi[12].zaporedje(ukazi[13]);
        ukazi[16] = new Tretja.Odvzemi(8);
        ukazi[17] = new Tretja.Odvzemi(7);
        ukazi[18] = ukazi[17].zaporedje(ukazi[10]);
        ukazi[19] = ukazi[11].zaporedje(ukazi[16]);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {7, 0, 9, 0, 6, 18, 4, 9, 15, 15};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
