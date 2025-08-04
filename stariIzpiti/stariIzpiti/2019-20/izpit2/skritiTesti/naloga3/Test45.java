
import java.util.Arrays;

public class Test45 {
    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi = new Tretja.Ukaz[15];
        ukazi[0] = new Tretja.Odvzemi(2);
        ukazi[1] = new Tretja.Postavi(5);
        ukazi[2] = new Tretja.Postavi(0);
        ukazi[3] = new Tretja.Postavi(2);
        ukazi[4] = ukazi[0].zaporedje(ukazi[2]);
        ukazi[5] = new Tretja.Odvzemi(1);
        ukazi[6] = new Tretja.Postavi(5);
        ukazi[7] = ukazi[1].zaporedje(ukazi[2]);
        ukazi[8] = new Tretja.Postavi(4);
        ukazi[9] = ukazi[8].zaporedje(ukazi[4]);
        ukazi[10] = ukazi[9].zaporedje(ukazi[8]);
        ukazi[11] = ukazi[3].zaporedje(ukazi[10]);
        ukazi[12] = new Tretja.Postavi(3);
        ukazi[13] = new Tretja.Postavi(3);
        ukazi[14] = new Tretja.Postavi(7);
        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {13, 12, 0, 6, 16, 9, 1, 16};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
