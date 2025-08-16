
import java.util.Arrays;

public class Test08 {

    public static void main(String[] args) {

        Tretja.Ukaz u1 = new Tretja.Postavi(2);
        Tretja.Ukaz u2 = new Tretja.Odvzemi(1);
        Tretja.Ukaz u3 = u1.zaporedje(u2);
        Tretja.Ukaz u4 = new Tretja.Odvzemi(0);
        Tretja.Ukaz u5 = u3.zaporedje(u4);
        Tretja.Ukaz u6 = u3.zaporedje(u5);

        Tretja.Ukaz[] ukazi = {u1, u2, u3, u4, u5, u6};

        for (Tretja.Ukaz ukaz: ukazi) {
            System.out.println(ukaz);
        }
        System.out.println("----------");

        for (Tretja.Ukaz ukaz: ukazi) {
            int[] stolpi = {10, 10, 10};
            ukaz.izvedi(stolpi);
            System.out.println(Arrays.toString(stolpi));
        }
    }
}
